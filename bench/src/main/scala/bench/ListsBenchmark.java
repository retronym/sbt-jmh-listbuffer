package bench;


import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import scala.collection.mutable.ListBuffer;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(value = 1, jvmArgs = {
    "-server",
    "-Xms2g",
    "-Xmx2g",
    "-XX:NewSize=1g",
    "-XX:MaxNewSize=1g",
    "-XX:InitialCodeCacheSize=512m",
    "-XX:ReservedCodeCacheSize=512m",
    "-XX:+UseParallelGC",
    "-XX:-UseBiasedLocking"})
@BenchmarkMode({Mode.Throughput})
@OutputTimeUnit(TimeUnit.SECONDS)
public class ListsBenchmark {
  @Param({"10"})
  private int size = -1;

  @Benchmark
  public Object javaListBufferPlusEqAddOne() {
    ListBuffer<String> buffer = new ListBuffer<String>();
    int i = 0;
    while (i < size) {
      buffer.addOne("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  public Object scalaListBufferPlusEqAddOne() {
    ListBuffer<String> buffer = new ListBuffer<>();
    int i = 0;
    while (i < size) {
      buffer.addOne("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  public Object scalaListBufferPlusEq() {
    ListBuffer<String> buffer = new ListBuffer<>();
    int i = 0;
    while (i < size) {
      buffer.$plus$eq("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  public Object skalaAddOne() {
    skala.collection.mutable.ListBuffer buffer = new skala.collection.mutable.ListBuffer();
    int i = 0;
    while (i < size) {
      buffer.addOne("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  public Object skalaPlusEq() {
    skala.collection.mutable.ListBuffer buffer = new skala.collection.mutable.ListBuffer();
    int i = 0;
    while (i < size) {
      buffer.plusEq1("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  public void all(Blackhole bh) {
    bh.consume(javaListBufferPlusEqAddOne());
    bh.consume(scalaListBufferPlusEqAddOne());
    bh.consume(scalaListBufferPlusEq());
    bh.consume(skalaAddOne());
    bh.consume(skalaPlusEq());
  }
}
