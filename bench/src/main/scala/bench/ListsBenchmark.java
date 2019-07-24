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
    Lists.ListBuffer buffer = new Lists.ListBuffer();
    int i = 0;
    while (i < size) {
      buffer.addOne("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  public Object scalaListBufferPlusEq_212() {
    ListBuffer<String> buffer = new ListBuffer<>();
    int i = 0;
    while (i < size) {
      buffer.$plus$eq("");
      i += 1;
    }
    return buffer.result();
  }


  @Benchmark
  public void all(Blackhole bh) {
    bh.consume(javaListBufferPlusEqAddOne());
    bh.consume(scalaListBufferPlusEq_212());
  }
}
