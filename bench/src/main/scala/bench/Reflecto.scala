package bench

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

import scala.collection.mutable

object Reflecto {
  def main(args: Array[String]): Unit = {
    def supers(cls: Class[_]) = {
      val result = collection.mutable.Set[Class[_]](); def loop(cls: Class[_]): Unit = {
        if (cls != null && !result(cls)) {
          result += cls; loop(cls.getSuperclass); cls.getInterfaces.map(loop)
        }
      }; loop(cls); result
    }

    val classes = Set(
      Class.forName("scala.collection.immutable.$colon$colon"),
      Class.forName("scala.collection.immutable.Nil"),
      Class.forName("scala.collection.immutable.Nil$"),
      Class.forName("scala.collection.mutable.ListBuffer")
    ).flatMap(supers)
    val classNames = classes.map(_.getName)

    def rename(cls: String): String = cls.replaceFirst("""scala\b""", "skala")

    def toJava(cls: Class[_]) =
      if (cls.getName == "scala.collection.immutable.$colon$colon") sci_::
      else if (cls.getName == "scala.collection.immutable.Nil$") sci_Nil$
      else if (cls.getName == "scala.collection.mutable.ListBuffer") scm_ListBuffer
      else {

        val modifier = if (cls.isInterface) "public interface" else "public class"

        def extendsClause = if (cls.getSuperclass == null) "" else s" extends ${rename(cls.getSuperclass.getName)}"

        def implementsClause = if (cls.getInterfaces.isEmpty) "" else cls.getInterfaces.map(_.getName).map(rename).mkString(if (cls.isInterface) "extends " else "implements ", ",", "")

        def transitiveInterfaces(cls: Class[_]): mutable.Set[Class[_]] = {
          val result = mutable.Set[Class[_]]()

          def loop(cls: Class[_]): Unit = {
            if (!result(cls)) {
              result += cls
              cls.getInterfaces.foreach(loop)
            }
          }

          if (cls != null) cls.getInterfaces.foreach(loop)
          result
        }

        def newInterfaces: Seq[Class[_]] = Nil // cls.getInterfaces.filterNot(transitiveInterfaces(cls.getSuperclass))

        def constructor =
          if (cls.isInterface) s"public static void $$init$$(${rename(cls.getName)} self) {}"
          else s"public ${cls.getSimpleName}() { super(); ${newInterfaces.map(itf => s"${rename(itf.getName)}.$$init$$(this);").mkString("; ")} }"

        s"package ${rename(cls.getPackageName)}; $modifier ${cls.getSimpleName}$extendsClause $implementsClause { $constructor }"
      }

    val base = Paths.get("/Users/jz/code/sbt-jmh-listbuffer/bench/src/main/scala")
    classes.foreach { cls =>
      val packageName = cls.getPackageName
      if (packageName.startsWith("scala.") || packageName == "scala") {
        val code = toJava(cls)
        val path = base.resolve(rename(packageName).replace('.', '/')).resolve(cls.getSimpleName + ".java")
        Files.createDirectories(path.getParent)
        Files.write(path, code.getBytes(StandardCharsets.UTF_8))
      }
    }
  }

  def sci_:: =
    """
      |package skala.collection.immutable;
      |
      |public final class $colon$colon
      |extends List
      |implements skala.Product {
      |    private final Object head;
      |    private List next;
      |
      |    public List next$access$1() {
      |        return this.next;
      |    }
      |
      |    public Object head() {
      |        return this.head;
      |    }
      |
      |    public List next() {
      |        return this.next;
      |    }
      |
      |    public void next_$eq(List x$1) {
      |        this.next = x$1;
      |    }
      |
      |    public $colon$colon(Object head, List next) {
      |        this.head = head;
      |        this.next = next;
      |        try {
      |            scala.runtime.Statics.releaseFence();
      |        } catch (Throwable throwable) {
      |            throwable.printStackTrace();
      |        }
      |    }
      |}
    """.stripMargin

  def sci_Nil$ =
    """
      |package skala.collection.immutable;
      |
      |public final class Nil$
      |extends skala.collection.immutable.List
      |implements skala.Product {
      |    public static final Nil$ MODULE$ = new Nil$();
      |    private Nil$() {
      |    }
      |}
    """.stripMargin

  def scm_ListBuffer =
  """
    |package skala.collection.mutable;
    |
    |
    |import scala.runtime.Statics;
    |
    |public class ListBuffer
    |    extends skala.collection.mutable.AbstractBuffer
    |    implements skala.collection.StrictOptimizedSeqOps,
    |    skala.collection.mutable.ReusableBuilder/*, /*DefaultSerializable */ {
    |  private skala.collection.immutable.List first = skala.collection.immutable.Nil$.MODULE$;
    |  private skala.collection.immutable.$colon$colon last0 = null;
    |  private boolean aliased = false;
    |  private int len = 0;
    |
    |
    |  private skala.collection.immutable.List first() {
    |    return this.first;
    |  }
    |
    |  private void first_$eq(skala.collection.immutable.List x$1) {
    |    this.first = x$1;
    |  }
    |
    |  private skala.collection.immutable.$colon$colon last0() {
    |    return this.last0;
    |  }
    |
    |  private void last0_$eq(skala.collection.immutable.$colon$colon x$1) {
    |    this.last0 = x$1;
    |  }
    |
    |  public boolean isEmpty() {
    |    return this.len == 0;
    |  }
    |
    |  private void copyElems() {
    |    throw new UnsupportedOperationException();
    |//    Object buf = ListBuffer$.MODULE$.from((IterableOnce) this);
    |//    this.first_$eq(ListBuffer.super.first());
    |//    this.last0_$eq(ListBuffer.super.last0());
    |//    this.aliased = false;
    |  }
    |
    |  private void ensureUnaliased() {
    |    if (this.aliased) {
    |      this.copyElems();
    |    }
    |  }
    |
    |  public skala.collection.immutable.List toList() {
    |    this.aliased = this.len != 0;
    |    try {
    |      Statics.releaseFence();
    |    } catch (Throwable throwable) {
    |      throwable.printStackTrace();
    |    }
    |    return this.first();
    |  }
    |
    |  public skala.collection.immutable.List result() {
    |    return this.toList();
    |  }
    |
    |
    |  public final ListBuffer addOne(Object elem) {
    |    this.ensureUnaliased();
    |    skala.collection.immutable.$colon$colon last1 = new skala.collection.immutable.$colon$colon(elem, skala.collection.immutable.Nil$.MODULE$);
    |    if (this.len == 0) {
    |      this.first_$eq(last1);
    |    } else {
    |      this.last0().next_$eq(last1);
    |    }
    |    this.last0_$eq(last1);
    |    ++this.len;
    |    return this;
    |  }
    |
    |}
  """.stripMargin
}
