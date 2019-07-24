Benchmark for https://github.com/scala/bug/issues/11627

```
[info] Loading settings for project sbt-jmh-listbuffer-build from plugins.sbt ...
[info] Loading project definition from /Users/jz/code/sbt-jmh-listbuffer/project
[info] Loading settings for project sbt-jmh-listbuffer from build.sbt ...
[info] Set current project to sbt-jmh-template (in build file:/Users/jz/code/sbt-jmh-listbuffer/)
[info] sbt server started at local:///Users/jz/.sbt/1.0/server/2ba38ac216b121189188/sock
sbt:sbt-jmh-template> ;bench/jmh:run bench.ListsBenchmark -f1 -wi 4 -i4
[info] Compiling 1 Java source to /Users/jz/code/sbt-jmh-listbuffer/bench/target/scala-2.13/classes ...
[info] Done compiling.
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/Users/jz/.sbt/boot/scala-2.12.7/org.scala-sbt/sbt/1.2.8/protobuf-java-3.3.1.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[info] Packaging /Users/jz/code/sbt-jmh-listbuffer/bench/target/scala-2.13/bench_2.13-0.1.0-SNAPSHOT.jar ...
Processing 84 classes from /Users/jz/code/sbt-jmh-listbuffer/bench/target/scala-2.13/classes with "reflection" generator
Writing out Java source to /Users/jz/code/sbt-jmh-listbuffer/bench/target/scala-2.13/src_managed/jmh and resources to /Users/jz/code/sbt-jmh-listbuffer/bench/target/scala-2.13/resource_managed/jmh
[info] Done packaging.
[info] Packaging /Users/jz/code/sbt-jmh-listbuffer/bench/target/scala-2.13/bench_2.13-0.1.0-SNAPSHOT-jmh.jar ...
[info] Done packaging.
[info] Running (fork) org.openjdk.jmh.Main bench.ListsBenchmark -f1 -wi 4 -i4
[error] WARNING: An illegal reflective access operation has occurred
[error] WARNING: Illegal reflective access by org.openjdk.jmh.util.Utils (file:/private/var/folders/22/g1sv634d11j1d_lqlnhz9p2r0000gn/T/sbt_55506d0e/target/44244710/jmh-core-1.21.jar) to field java.io.PrintStream.charOut
[error] WARNING: Please consider reporting this to the maintainers of org.openjdk.jmh.util.Utils
[error] WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
[error] WARNING: All illegal access operations will be denied in a future release
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.1, Java HotSpot(TM) 64-Bit Server VM, 12.0.1+12
[info] # VM invoker: /Users/jz/.jabba/jdk/1.12.0-1/Contents/Home/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 4 iterations, 1 s each
[info] # Measurement: 4 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.javaListBufferPlusEqAddOne
[info] # Parameters: (size = 10)
[info] # Run progress: 0.00% complete, ETA 00:00:40
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 19198131.662 ops/s
[info] # Warmup Iteration   2: 27520967.168 ops/s
[info] # Warmup Iteration   3: 40818747.387 ops/s
[info] # Warmup Iteration   4: 41058393.987 ops/s
[info] Iteration   1: 40955644.158 ops/s
[info] Iteration   2: 40994288.488 ops/s
[info] Iteration   3: 41268394.867 ops/s
[info] Iteration   4: 41079228.167 ops/s
[info] Result "bench.ListsBenchmark.javaListBufferPlusEqAddOne":
[info]   41074388.920 ±(99.9%) 899881.789 ops/s [Average]
[info]   (min, avg, max) = (40955644.158, 41074388.920, 41268394.867), stdev = 139257.703
[info]   CI (99.9%): [40174507.131, 41974270.709] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.1, Java HotSpot(TM) 64-Bit Server VM, 12.0.1+12
[info] # VM invoker: /Users/jz/.jabba/jdk/1.12.0-1/Contents/Home/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 4 iterations, 1 s each
[info] # Measurement: 4 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.scalaListBufferPlusEq
[info] # Parameters: (size = 10)
[info] # Run progress: 20.00% complete, ETA 00:00:33
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 14293334.718 ops/s
[info] # Warmup Iteration   2: 19406103.088 ops/s
[info] # Warmup Iteration   3: 22874763.948 ops/s
[info] # Warmup Iteration   4: 22814676.224 ops/s
[info] Iteration   1: 22405510.767 ops/s
[info] Iteration   2: 22758272.184 ops/s
[info] Iteration   3: 22775325.609 ops/s
[info] Iteration   4: 22680787.982 ops/s
[info] Result "bench.ListsBenchmark.scalaListBufferPlusEq":
[info]   22654974.135 ±(99.9%) 1107078.470 ops/s [Average]
[info]   (min, avg, max) = (22405510.767, 22654974.135, 22775325.609), stdev = 171321.619
[info]   CI (99.9%): [21547895.666, 23762052.605] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.1, Java HotSpot(TM) 64-Bit Server VM, 12.0.1+12
[info] # VM invoker: /Users/jz/.jabba/jdk/1.12.0-1/Contents/Home/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 4 iterations, 1 s each
[info] # Measurement: 4 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.scalaListBufferPlusEqAddOne
[info] # Parameters: (size = 10)
[info] # Run progress: 40.00% complete, ETA 00:00:25
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 20648000.777 ops/s
[info] # Warmup Iteration   2: 29404588.791 ops/s
[info] # Warmup Iteration   3: 41364744.719 ops/s
[info] # Warmup Iteration   4: 40922233.039 ops/s
[info] Iteration   1: 41060742.822 ops/s
[info] Iteration   2: 40625605.739 ops/s
[info] Iteration   3: 40297520.765 ops/s
[info] Iteration   4: 40870526.116 ops/s
[info] Result "bench.ListsBenchmark.scalaListBufferPlusEqAddOne":
[info]   40713598.860 ±(99.9%) 2130166.999 ops/s [Average]
[info]   (min, avg, max) = (40297520.765, 40713598.860, 41060742.822), stdev = 329645.701
[info]   CI (99.9%): [38583431.862, 42843765.859] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.1, Java HotSpot(TM) 64-Bit Server VM, 12.0.1+12
[info] # VM invoker: /Users/jz/.jabba/jdk/1.12.0-1/Contents/Home/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 4 iterations, 1 s each
[info] # Measurement: 4 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.skalaAddOne
[info] # Parameters: (size = 10)
[info] # Run progress: 60.00% complete, ETA 00:00:16
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 23167688.932 ops/s
[info] # Warmup Iteration   2: 29213659.446 ops/s
[info] # Warmup Iteration   3: 41049352.837 ops/s
[info] # Warmup Iteration   4: 40261310.766 ops/s
[info] Iteration   1: 41033599.659 ops/s
[info] Iteration   2: 40968351.698 ops/s
[info] Iteration   3: 40743892.191 ops/s
[info] Iteration   4: 41091855.368 ops/s
[info] Result "bench.ListsBenchmark.skalaAddOne":
[info]   40959424.729 ±(99.9%) 984075.334 ops/s [Average]
[info]   (min, avg, max) = (40743892.191, 40959424.729, 41091855.368), stdev = 152286.747
[info]   CI (99.9%): [39975349.395, 41943500.063] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.1, Java HotSpot(TM) 64-Bit Server VM, 12.0.1+12
[info] # VM invoker: /Users/jz/.jabba/jdk/1.12.0-1/Contents/Home/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 4 iterations, 1 s each
[info] # Measurement: 4 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.skalaPlusEq
[info] # Parameters: (size = 10)
[info] # Run progress: 80.00% complete, ETA 00:00:08
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 13927259.930 ops/s
[info] # Warmup Iteration   2: 18149372.957 ops/s
[info] # Warmup Iteration   3: 20668467.100 ops/s
[info] # Warmup Iteration   4: 20551360.852 ops/s
[info] Iteration   1: 20702420.844 ops/s
[info] Iteration   2: 20118629.193 ops/s
[info] Iteration   3: 20666795.828 ops/s
[info] Iteration   4: 20600793.171 ops/s
[info] Result "bench.ListsBenchmark.skalaPlusEq":
[info]   20522159.759 ±(99.9%) 1759567.702 ops/s [Average]
[info]   (min, avg, max) = (20118629.193, 20522159.759, 20702420.844), stdev = 272295.050
[info]   CI (99.9%): [18762592.057, 22281727.461] (assumes normal distribution)
[info] # Run complete. Total time: 00:00:41
[info] REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
[info] why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
[info] experiments, perform baseline and negative tests that provide experimental control, make sure
[info] the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
[info] Do not assume the numbers tell you what you want them to tell.
[info] Benchmark                                   (size)   Mode  Cnt         Score         Error  Units
[info] ListsBenchmark.javaListBufferPlusEqAddOne       10  thrpt    4  41074388.920 ±  899881.789  ops/s
[info] ListsBenchmark.scalaListBufferPlusEq            10  thrpt    4  22654974.135 ± 1107078.470  ops/s
[info] ListsBenchmark.scalaListBufferPlusEqAddOne      10  thrpt    4  40713598.860 ± 2130166.999  ops/s
[info] ListsBenchmark.skalaAddOne                      10  thrpt    4  40959424.729 ±  984075.334  ops/s
[info] ListsBenchmark.skalaPlusEq                      10  thrpt    4  20522159.759 ± 1759567.702  ops/s
```
