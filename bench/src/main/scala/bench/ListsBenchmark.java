package bench;


import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import scala.collection.mutable.ListBuffer;

import java.util.concurrent.TimeUnit;

import static org.openjdk.jmh.annotations.CompilerControl.Mode.PRINT;

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
    "-XX:-UseBiasedLocking",
    "-XX:+AlwaysPreTouch"})
@BenchmarkMode({Mode.Throughput})
@OutputTimeUnit(TimeUnit.SECONDS)
public class ListsBenchmark {
  private int size = -1;

  @Setup
  public void setup() {
    size = 10000;
  }

  @Benchmark
  public Object scala212(Blackhole bh) {
    Lists.ListBuffer buffer = new Lists.ListBuffer();
    int i = 0;
    while (i < size) {
      buffer.addOne("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  public Object scala213(Blackhole bh) {
    Lists.ListBufferConstructorAndResultFence buffer = new Lists.ListBufferConstructorAndResultFence();
    int i = 0;
    while (i < size) {
      buffer.addOne("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  public Object scalaResultFenceOnly(Blackhole bh) {
    Lists.ListBufferResultFence buffer = new Lists.ListBufferResultFence();
    int i = 0;
    while (i < size) {
      buffer.addOne("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  public Object scalaCollectionImmutableList(Blackhole bh) {
    ListBuffer<String> buffer = new ListBuffer<>();
    int i = 0;
    while (i < size) {
      buffer.$plus$eq("");
      i += 1;
    }
    return buffer.result();
  }

  @Benchmark
  @CompilerControl(PRINT)
  public Object benchList(Blackhole bh) {
    ListBuffer1<String> buffer = new ListBuffer1<>();
    int i = 0;
    while (i < size) {
      buffer.$plus$eq("");
      i += 1;
    }
    return buffer.result();
  }
}
