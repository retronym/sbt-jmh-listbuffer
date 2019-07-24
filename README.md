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

## Disasembly

```
sbt:sbt-jmh-template> bench/jmh:run bench.ListsBenchmark -f1 -wi 10 -i10 -prof perfasm
[info] Packaging /home/scala/code/sbt-jmh-listbuffer/bench/target/scala-2.13/bench_2.13-0.1.0-SNAPSHOT.jar ...
Processing 85 classes from /home/scala/code/sbt-jmh-listbuffer/bench/target/scala-2.13/classes with "reflection" generator
Writing out Java source to /home/scala/code/sbt-jmh-listbuffer/bench/target/scala-2.13/src_managed/jmh and resources to /home/scala/code/sbt-jmh-listbuffer/bench/target/scala-2.13/resource_managed/jmh
[info] Done packaging.
[info] Packaging /home/scala/code/sbt-jmh-listbuffer/bench/target/scala-2.13/bench_2.13-0.1.0-SNAPSHOT-jmh.jar ...
[info] Done packaging.
[info] Running (fork) org.openjdk.jmh.Main bench.ListsBenchmark -f1 -wi 10 -i10 -prof perfasm
[error] WARNING: An illegal reflective access operation has occurred
[error] WARNING: Illegal reflective access by org.openjdk.jmh.util.Utils (file:/tmp/sbt_72960668/target/44244710/jmh-core-1.21.jar) to field java.io.PrintStream.charOut
[error] WARNING: Please consider reporting this to the maintainers of org.openjdk.jmh.util.Utils
[error] WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
[error] WARNING: All illegal access operations will be denied in a future release
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.2, OpenJDK 64-Bit Server VM, 12.0.2+10
[info] # VM invoker: /usr/lib/jvm/jdk-12.0.2/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.all
[info] # Parameters: (size = 10)
[info] # Run progress: 0.00% complete, ETA 00:02:00
[info] # Fork: 1 of 1
[info] # Preparing profilers: LinuxPerfAsmProfiler
[info] # Profilers consume stdout and stderr from target VM, use -v EXTRA to copy to console
[info] # Warmup Iteration   1: 1842204.908 ops/s
[info] # Warmup Iteration   2: 3725499.514 ops/s
[info] # Warmup Iteration   3: 4372038.662 ops/s
[info] # Warmup Iteration   4: 4401353.929 ops/s
[info] # Warmup Iteration   5: 4385771.071 ops/s
[info] # Warmup Iteration   6: 4353629.822 ops/s
[info] # Warmup Iteration   7: 4380476.592 ops/s
[info] # Warmup Iteration   8: 4403334.695 ops/s
[info] # Warmup Iteration   9: 4400658.306 ops/s
[info] # Warmup Iteration  10: 4405863.878 ops/s
[info] Iteration   1: 4402009.423 ops/s
[info] Iteration   2: 4425876.482 ops/s
[info] Iteration   3: 4406340.538 ops/s
[info] Iteration   4: 4411486.645 ops/s
[info] Iteration   5: 4407087.984 ops/s
[info] Iteration   6: 4408087.366 ops/s
[info] Iteration   7: 4386599.222 ops/s
[info] Iteration   8: 4402834.624 ops/s
[info] Iteration   9: 4405176.046 ops/s
[info] Iteration  10: 4401720.956 ops/s
[info] # Processing profiler results: LinuxPerfAsmProfiler
[info] Result "bench.ListsBenchmark.all":
[info]   4405721.929 ±(99.9%) 14704.577 ops/s [Average]
[info]   (min, avg, max) = (4386599.222, 4405721.929, 4425876.482), stdev = 9726.167
[info]   CI (99.9%): [4391017.352, 4420426.506] (assumes normal distribution)
[info] Secondary result "bench.ListsBenchmark.all:·asm":
[info] PrintAssembly processed: 167920 total address lines.
[info] Perf output processed (skipped 11.412 seconds):
[info]  Column 1: cycles (10100 events)
[info] Hottest code regions (>10.00% "cycles" events):
[info] ....[Hottest Region 1]..............................................................................
[info] c2, level 4, bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub, version 657 (1710 bytes)
[info]                                                                                           ; - bench.ListsBenchmark::all@2 (line 86)
[info]                                                                                           ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                                                                                           ; implicit exception: dispatches to 0x00007f616785fb96
[info]                                 0x00007f616785ef28: test   r10d,r10d
[info]                                 0x00007f616785ef2b: jne    0x00007f616785f675             ;*if_icmpge {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                                           ; - bench.ListsBenchmark::skalaPlusEq@15 (line 77)
[info]                                                                                           ; - bench.ListsBenchmark::all@34 (line 90)
[info]                                                                                           ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                                 0x00007f616785ef31: mov    ebx,0x1
[info]          ╭                      0x00007f616785ef36: jmp    0x00007f616785ef84
[info]   0.01%  │                 ↗    0x00007f616785ef38: mov    r8d,DWORD PTR [rsp+0x4c]
[info]   0.07%  │                 │    0x00007f616785ef3d: mov    rdx,r8
[info]   0.16%  │                 │    0x00007f616785ef40: mov    r10d,DWORD PTR [rsp+0x48]
[info]   0.03%  │                 │    0x00007f616785ef45: cmp    r10d,0xffffffff
[info]          │                 │    0x00007f616785ef49: je     0x00007f616785f7fe             ;*invokevirtual asType {reexecute=0 rethrow=0 return_oop=0}
[info]          │                 │                                                              ; - java.lang.invoke.Invokers::checkGenericType@2 (line 495)
[info]          │                 │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@8
[info]          │                 │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]          │                 │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]          │                 │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]          │                 │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]          │                 │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]          │                 │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.01%  │                 │    0x00007f616785ef4f: mov    rsi,QWORD PTR [rsp+0x10]
[info]   0.07%  │                 │    0x00007f616785ef54: data16 xchg ax,ax
[info]   0.05%  │                 │    0x00007f616785ef57: call   0x00007f6157575980             ; ImmutableOopMap{[152]=Oop [160]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop }
[info]          │                 │                                                              ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]          │                 │                                                              ; - bench.ListsBenchmark::all@37 (line 90)
[info]          │                 │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]          │                 │                                                              ;   {optimized virtual_call}
[info]   0.12%  │                 │    0x00007f616785ef5c: mov    r8,QWORD PTR [rsp]
[info]   0.01%  │                 │    0x00007f616785ef60: movzx  r11d,BYTE PTR [r8+0x94]        ;*invokespecial last0 {reexecute=0 rethrow=0 return_oop=0}
[info]          │                 │                                                              ; - scala.collection.mutable.ListBuffer::addOne@33 (line 110)
[info]          │                 │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]          │                 │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]          │                 │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.01%  │                 │    0x00007f616785ef68: mov    rbx,QWORD PTR [rsp+0x8]
[info]   0.11%  │                 │    0x00007f616785ef6d: add    rbx,0x1                        ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]          │                 │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]          │                 │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]          │                 │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]          │                 │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]          │                 │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]          │                 │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]          │                 │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]          │                 │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]          │                 │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.02%  │                 │    0x00007f616785ef71: mov    r10,QWORD PTR [r15+0x108]      ; ImmutableOopMap{r8=Oop [152]=Oop [160]=Oop [16]=Oop [40]=Oop [56]=Oop }
[info]          │                 │                                                              ;*ifeq {reexecute=1 rethrow=0 return_oop=0}
[info]          │                 │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@30 (line 121)
[info]   0.03%  │                 │    0x00007f616785ef78: test   DWORD PTR [r10],eax            ;*ifeq {reexecute=0 rethrow=0 return_oop=0}
[info]          │                 │                                                              ; - scala.collection.mutable.ListBuffer::ensureUnaliased@4 (line 73)
[info]          │                 │                                                              ; - scala.collection.mutable.ListBuffer::addOne@1 (line 108)
[info]          │                 │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]          │                 │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]          │                 │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]          │                 │                                                              ;   {poll}
[info]   0.01%  │                 │    0x00007f616785ef7b: test   r11d,r11d
[info]          │                 │    0x00007f616785ef7e: jne    0x00007f616785f67a             ;*invokestatic internalMemberName {reexecute=0 rethrow=0 return_oop=0}
[info]          │                 │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@7
[info]          │                 │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]          │                 │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]          │                 │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]          │                 │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]          │                 │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]          │                 │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]          │                 │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.09%  ↘                 │    0x00007f616785ef84: mov    r11,QWORD PTR [rsp+0xa0]
[info]   0.04%                    │    0x00007f616785ef8c: mov    r10d,DWORD PTR [r11+0xc]
[info]   0.02%                    │    0x00007f616785ef90: test   r10d,r10d
[info]                            │    0x00007f616785ef93: jle    0x00007f616785f6d2             ;*ifeq {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - java.lang.invoke.Invokers::checkCustomized@4 (line 571)
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@13
[info]                            │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                            │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                            │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                            │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.03%                    │    0x00007f616785ef99: mov    QWORD PTR [rsp+0x8],rbx
[info]   0.07%                    │    0x00007f616785ef9e: mov    QWORD PTR [rsp],r8
[info]   0.05%                    │    0x00007f616785efa2: rex.W push QWORD PTR [rsp+0xa0]
[info]   0.04%                    │    0x00007f616785efaa: rex.W pop QWORD PTR [rsp+0x90]
[info]   0.50%                    │    0x00007f616785efb2: movabs rdx,0xf009cb58                 ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f009cb58})}
[info]   0.04%                    │    0x00007f616785efbc: xor    r9d,r9d
[info]                            │    0x00007f616785efbf: xor    r11d,r11d
[info]   0.01%                    │    0x00007f616785efc2: xor    r8d,r8d
[info]   0.09%                    │    0x00007f616785efc5: mov    r10d,0xf009cb58                ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f009cb58})}
[info]   0.02%                    │    0x00007f616785efcb: mov    QWORD PTR [rsp+0x60],r9
[info]                            │    0x00007f616785efd0: mov    DWORD PTR [rsp+0x24],r11d
[info]   0.01%                    │    0x00007f616785efd5: mov    DWORD PTR [rsp+0x58],r8d
[info]   0.15%                    │    0x00007f616785efda: mov    DWORD PTR [rsp+0x5c],r10d
[info]           ╭                │    0x00007f616785efdf: jmp    0x00007f616785f03f
[info]   0.21%   │ ↗              │    0x00007f616785efe1: mov    r10,QWORD PTR [rsp+0x60]
[info]   0.67%   │ │              │    0x00007f616785efe6: mov    DWORD PTR [r10+0x10],r11d      ;*invokevirtual invokeBasic {reexecute=0 rethrow=0 return_oop=0}
[info]           │ │              │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]           │ │              │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]           │ │              │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]           │ │              │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]           │ │              │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]           │ │              │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]           │ │              │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]           │ │              │                                                              ; implicit exception: dispatches to 0x00007f616785faea
[info]   2.79%   │ │              │    0x00007f616785efea: mov    r8d,DWORD PTR [rsp+0x5c]
[info]   0.06%   │ │              │    0x00007f616785efef: mov    rdx,r8                         ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]           │ │              │                                                              ; - skala.collection.mutable.AbstractBuffer::&lt;init&gt;@1 (line 2)
[info]           │ │              │                                                              ; - skala.collection.mutable.ListBuffer::&lt;init&gt;@1 (line 7)
[info]           │ │              │                                                              ; - bench.ListsBenchmark::skalaPlusEq@4 (line 75)
[info]           │ │              │                                                              ; - bench.ListsBenchmark::all@34 (line 90)
[info]           │ │              │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.04%   │ │              │    0x00007f616785eff2: shr    r10,0x9
[info]   0.13%   │ │              │    0x00007f616785eff6: movabs r11,0x7f61561a5000
[info]   0.87%   │ │              │    0x00007f616785f000: mov    BYTE PTR [r11+r10*1],0x0       ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]           │ │              │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]           │ │              │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]           │ │              │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]           │ │              │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]           │ │              │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]           │ │              │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]           │ │              │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]           │ │              │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]           │ │              │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.60%   │ │↗             │    0x00007f616785f005: mov    r9,QWORD PTR [r15+0x108]
[info]   0.20%   │ ││             │    0x00007f616785f00c: mov    r11d,DWORD PTR [rsp+0x24]
[info]   0.20%   │ ││             │    0x00007f616785f011: inc    r11d                           ;*invokeinterface isEmpty {reexecute=0 rethrow=0 return_oop=0}
[info]           │ ││             │                                                              ; - scala.collection.IterableOnceOps::nonEmpty@1 (line 819)
[info]           │ ││             │                                                              ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]           │ ││             │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]           │ ││             │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]           │ ││             │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]           │ ││             │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]           │ ││             │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]           │ ││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.51%   │ ││             │    0x00007f616785f014: mov    DWORD PTR [rsp+0x24],r11d
[info]   0.21%   │ ││             │    0x00007f616785f019: mov    r10,QWORD PTR [rsp+0x90]
[info]   0.15%   │ ││             │    0x00007f616785f021: mov    r10d,DWORD PTR [r10+0xc]
[info]   0.31%   │ ││             │    0x00007f616785f025: mov    r8d,DWORD PTR [rsp+0x58]
[info]   0.90%   │ ││             │    0x00007f616785f02a: inc    r8d                            ; ImmutableOopMap{rdx=Oop rax=Oop [144]=Oop [152]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop [92]=NarrowOop }
[info]           │ ││             │                                                              ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]           │ ││             │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@28 (line 35)
[info]           │ ││             │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]           │ ││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.24%   │ ││             │    0x00007f616785f02d: test   DWORD PTR [r9],eax             ;*invokestatic nonEmpty$ {reexecute=0 rethrow=0 return_oop=0}
[info]           │ ││             │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]           │ ││             │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]           │ ││             │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]           │ ││             │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]           │ ││             │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]           │ ││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]           │ ││             │                                                              ;   {poll}
[info]   0.20%   │ ││             │    0x00007f616785f030: cmp    r11d,r10d
[info]           │╭││             │    0x00007f616785f033: jge    0x00007f616785f0a8             ;*synchronization entry
[info]           ││││             │                                                              ; - scala.collection.mutable.ListBuffer::first@-1 (line 47)
[info]           ││││             │                                                              ; - scala.collection.mutable.ListBuffer::toList@12 (line 82)
[info]           ││││             │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]           ││││             │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]           ││││             │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]           ││││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.17%   ││││             │    0x00007f616785f035: mov    DWORD PTR [rsp+0x58],r8d
[info]   0.73%   ││││             │    0x00007f616785f03a: mov    QWORD PTR [rsp+0x60],rax       ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]           ││││             │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]           ││││             │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]           ││││             │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]           ││││             │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]           ││││             │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]           ││││             │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]           ││││             │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]           ││││             │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]           ││││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.17%   ↘│││             │    0x00007f616785f03f: mov    rax,QWORD PTR [r15+0x118]      ;*synchronization entry
[info]            │││             │                                                              ; - skala.collection.mutable.ListBuffer::addOne@-1 (line 7)
[info]            │││             │                                                              ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]            │││             │                                                              ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]            │││             │                                                              ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]            │││             │                                                              ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]            │││             │                                                              ; - bench.ListsBenchmark::all@34 (line 90)
[info]            │││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.24%    │││             │    0x00007f616785f046: mov    r10,rax
[info]   0.30%    │││             │    0x00007f616785f049: add    r10,0x18
[info]   0.74%    │││             │    0x00007f616785f04d: cmp    r10,QWORD PTR [r15+0x128]
[info]            │││             │    0x00007f616785f054: jae    0x00007f616785f5f0             ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]            │││             │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]            │││             │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]            │││             │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]            │││             │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]            │││             │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]            │││             │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]            │││             │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]            │││             │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]            │││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.27%    │││             │    0x00007f616785f05a: mov    QWORD PTR [r15+0x118],r10
[info]   0.19%    │││             │    0x00007f616785f061: prefetchw BYTE PTR [r10+0xc0]         ;*invokevirtual addOne {reexecute=0 rethrow=0 return_oop=0}
[info]            │││             │                                                              ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]            │││             │                                                              ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]            │││             │                                                              ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]            │││             │                                                              ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]            │││             │                                                              ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]            │││             │                                                              ; - bench.ListsBenchmark::all@34 (line 90)
[info]            │││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.35%    │││             │    0x00007f616785f069: mov    QWORD PTR [rax],0x1
[info]   0.84%    │││             │    0x00007f616785f070: mov    DWORD PTR [rax+0x8],0x237008   ;*aload_0 {reexecute=0 rethrow=0 return_oop=0}
[info]            │││             │                                                              ; - skala.collection.mutable.ListBuffer::addOne@0 (line 67)
[info]            │││             │                                                              ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]            │││             │                                                              ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]            │││             │                                                              ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]            │││             │                                                              ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]            │││             │                                                              ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]            │││             │                                                              ; - bench.ListsBenchmark::all@34 (line 90)
[info]            │││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]            │││             │                                                              ;   {metadata(&apos;scala/collection/immutable/$colon$colon&apos;)}
[info]   0.34%    │││             │    0x00007f616785f077: mov    DWORD PTR [rax+0x14],0x0       ;*invokevirtual invoke {reexecute=0 rethrow=0 return_oop=0}
[info]            │││             │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]            │││             │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]            │││             │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]            │││             │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]            │││             │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]            │││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.35%    │││             │    0x00007f616785f07e: mov    DWORD PTR [rax+0xc],0xf0051640  ;   {oop(&quot;&quot;{0x00000000f0051640})}
[info]   0.37%    │││             │    0x00007f616785f085: mov    DWORD PTR [rax+0x10],0xf009cb58  ;*invokestatic nonEmpty$ {reexecute=0 rethrow=0 return_oop=0}
[info]            │││             │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]            │││             │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]            │││             │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]            │││             │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]            │││             │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]            │││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]            │││             │                                                              ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f009cb58})}
[info]   0.61%    │││             │    0x00007f616785f08c: mov    r11,rax                        ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]            │││             │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 592)
[info]            │││             │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]            │││             │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]            │││             │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]            │││             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.15%    │││             │    0x00007f616785f08f: mov    ebp,DWORD PTR [rsp+0x58]
[info]   0.27%    │││             │    0x00007f616785f093: test   ebp,ebp
[info]            │╰│             │    0x00007f616785f095: jne    0x00007f616785efe1             ;*invokestatic checkCustomized {reexecute=0 rethrow=0 return_oop=0}
[info]            │ │             │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@13
[info]            │ │             │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]            │ │             │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]            │ │             │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]            │ │             │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]            │ │             │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]            │ │             │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.13%    │ │             │    0x00007f616785f09b: mov    DWORD PTR [rsp+0x5c],r11d
[info]   0.01%    │ │             │    0x00007f616785f0a0: mov    rdx,rax
[info]            │ ╰             │    0x00007f616785f0a3: jmp    0x00007f616785f005
[info]   0.01%    ↘               │    0x00007f616785f0a8: cmp    ebp,0xffffffff
[info]                            │    0x00007f616785f0ab: je     0x00007f616785f6b2             ;*invokestatic internalMemberName {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@7
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                            │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                            │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                            │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.13%                    │    0x00007f616785f0b1: mov    rsi,QWORD PTR [rsp+0x10]
[info]   0.05%                    │    0x00007f616785f0b6: nop
[info]   0.01%                    │    0x00007f616785f0b7: call   0x00007f6157575980             ; ImmutableOopMap{[144]=Oop [152]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop }
[info]                            │                                                              ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - bench.ListsBenchmark::all@5 (line 86)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                            │                                                              ;   {optimized virtual_call}
[info]   0.23%                    │    0x00007f616785f0bc: mov    r10,QWORD PTR [rsp+0x90]
[info]   0.08%                    │    0x00007f616785f0c4: mov    r11d,DWORD PTR [r10+0xc]
[info]   0.03%                    │    0x00007f616785f0c8: test   r11d,r11d
[info]                            │    0x00007f616785f0cb: jle    0x00007f616785f711             ;*invokevirtual invokeBasic {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                            │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                            │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                            │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                            │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.08%                    │    0x00007f616785f0d1: mov    rbp,r10
[info]   0.02%                    │    0x00007f616785f0d4: xor    r11d,r11d
[info]   0.02%                    │    0x00007f616785f0d7: xor    ecx,ecx
[info]   0.01%                    │    0x00007f616785f0d9: xor    r8d,r8d
[info]   0.07%                    │    0x00007f616785f0dc: movabs r9,0xf009cb58                  ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f009cb58})}
[info]                            │    0x00007f616785f0e6: mov    r10d,0xf009cb58                ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f009cb58})}
[info]   0.04%                    │    0x00007f616785f0ec: mov    QWORD PTR [rsp+0x60],r11
[info]   0.01%                    │    0x00007f616785f0f1: mov    DWORD PTR [rsp+0x24],ecx
[info]   0.06%                    │    0x00007f616785f0f5: mov    DWORD PTR [rsp+0x50],r8d
[info]   0.03%                    │    0x00007f616785f0fa: mov    QWORD PTR [rsp+0x58],r9
[info]   0.06%                    │    0x00007f616785f0ff: mov    DWORD PTR [rsp+0x54],r10d
[info]   0.01%       ╭            │    0x00007f616785f104: jmp    0x00007f616785f16d
[info]               │            │    0x00007f616785f106: data16 nop WORD PTR [rax+rax*1+0x0]
[info]   0.22%       │ ↗          │    0x00007f616785f110: mov    r11,QWORD PTR [rsp+0x60]
[info]   0.96%       │ │          │    0x00007f616785f115: mov    DWORD PTR [r11+0x10],r10d      ;*invokestatic internalMemberName {reexecute=0 rethrow=0 return_oop=0}
[info]               │ │          │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@7
[info]               │ │          │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]               │ │          │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]               │ │          │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]               │ │          │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]               │ │          │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]               │ │          │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]               │ │          │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]               │ │          │                                                              ; implicit exception: dispatches to 0x00007f616785fafa
[info]   3.45%       │ │          │    0x00007f616785f119: mov    r10,r11
[info]   0.03%       │ │          │    0x00007f616785f11c: shr    r10,0x9
[info]   0.14%       │ │          │    0x00007f616785f120: movabs r11,0x7f61561a5000
[info]   0.17%       │ │          │    0x00007f616785f12a: mov    BYTE PTR [r11+r10*1],0x0       ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]               │ │          │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]               │ │          │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]               │ │          │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]               │ │          │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]               │ │          │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]               │ │          │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]               │ │          │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]               │ │          │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]               │ │          │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   1.51%       │ │↗         │    0x00007f616785f12f: mov    r9,QWORD PTR [r15+0x108]
[info]   0.19%       │ ││         │    0x00007f616785f136: mov    r11d,DWORD PTR [rsp+0x24]
[info]   0.11%       │ ││         │    0x00007f616785f13b: inc    r11d                           ;*invokeinterface isEmpty {reexecute=0 rethrow=0 return_oop=0}
[info]               │ ││         │                                                              ; - scala.collection.IterableOnceOps::nonEmpty@1 (line 819)
[info]               │ ││         │                                                              ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]               │ ││         │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]               │ ││         │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]               │ ││         │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]               │ ││         │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]               │ ││         │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]               │ ││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.18%       │ ││         │    0x00007f616785f13e: mov    DWORD PTR [rsp+0x24],r11d
[info]   0.91%       │ ││         │    0x00007f616785f143: mov    r10d,DWORD PTR [rbp+0xc]       ;*invokevirtual scalaListBufferPlusEq {reexecute=0 rethrow=0 return_oop=0}
[info]               │ ││         │                                                              ; - bench.ListsBenchmark::all@18 (line 88)
[info]               │ ││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.19%       │ ││         │    0x00007f616785f147: inc    r8d                            ; ImmutableOopMap{rax=Oop rbp=Oop [152]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop [84]=NarrowOop [88]=Oop }
[info]               │ ││         │                                                              ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]               │ ││         │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@28 (line 46)
[info]               │ ││         │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]               │ ││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.03%       │ ││         │    0x00007f616785f14a: test   DWORD PTR [r9],eax             ;*invokespecial nonEmpty {reexecute=0 rethrow=0 return_oop=0}
[info]               │ ││         │                                                              ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]               │ ││         │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]               │ ││         │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]               │ ││         │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]               │ ││         │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]               │ ││         │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]               │ ││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]               │ ││         │                                                              ;   {poll}
[info]   0.32%       │ ││         │    0x00007f616785f14d: cmp    r11d,r10d
[info]               │╭││         │    0x00007f616785f150: jge    0x00007f616785f1da             ;*invokespecial first {reexecute=0 rethrow=0 return_oop=0}
[info]               ││││         │                                                              ; - scala.collection.mutable.ListBuffer::toList@12 (line 82)
[info]               ││││         │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]               ││││         │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]               ││││         │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]               ││││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   1.08%       ││││         │    0x00007f616785f156: mov    r11d,DWORD PTR [rsp+0x54]
[info]   0.17%       ││││         │    0x00007f616785f15b: mov    r10,r11                        ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]               ││││         │                                                              ; - skala.collection.immutable.$colon$colon::&lt;init&gt;@1 (line 26)
[info]               ││││         │                                                              ; - skala.collection.mutable.ListBuffer::addOne@12 (line 68)
[info]               ││││         │                                                              ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]               ││││         │                                                              ; - bench.ListsBenchmark::all@26 (line 89)
[info]               ││││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.13%       ││││         │    0x00007f616785f15e: mov    QWORD PTR [rsp+0x58],r10
[info]   0.31%       ││││         │    0x00007f616785f163: mov    DWORD PTR [rsp+0x50],r8d
[info]   0.72%       ││││         │    0x00007f616785f168: mov    QWORD PTR [rsp+0x60],rax
[info]   0.17%       ↘│││         │    0x00007f616785f16d: mov    rax,QWORD PTR [r15+0x118]
[info]   0.11%        │││         │    0x00007f616785f174: mov    r10,rax
[info]   0.24%        │││         │    0x00007f616785f177: add    r10,0x18
[info]   0.84%        │││         │    0x00007f616785f17b: cmp    r10,QWORD PTR [r15+0x128]
[info]                │││         │    0x00007f616785f182: jae    0x00007f616785f609             ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]                │││         │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]                │││         │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                │││         │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                │││         │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                │││         │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                │││         │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                │││         │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                │││         │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                │││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.22%        │││         │    0x00007f616785f188: mov    QWORD PTR [r15+0x118],r10      ;*invokeinterface plusEq {reexecute=0 rethrow=0 return_oop=0}
[info]                │││         │                                                              ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]                │││         │                                                              ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]                │││         │                                                              ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]                │││         │                                                              ; - bench.ListsBenchmark::all@34 (line 90)
[info]                │││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.09%        │││         │    0x00007f616785f18f: prefetchw BYTE PTR [r10+0xc0]         ;*aload_0 {reexecute=0 rethrow=0 return_oop=0}
[info]                │││         │                                                              ; - skala.collection.mutable.Growable::plusEq$@0 (line 8)
[info]                │││         │                                                              ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]                │││         │                                                              ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]                │││         │                                                              ; - bench.ListsBenchmark::all@34 (line 90)
[info]                │││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.48%        │││         │    0x00007f616785f197: mov    QWORD PTR [rax],0x1
[info]   1.26%        │││         │    0x00007f616785f19e: mov    DWORD PTR [rax+0x8],0x237008   ;   {metadata(&apos;scala/collection/immutable/$colon$colon&apos;)}
[info]   0.43%        │││         │    0x00007f616785f1a5: mov    DWORD PTR [rax+0x14],0x0
[info]   0.28%        │││         │    0x00007f616785f1ac: mov    DWORD PTR [rax+0xc],0xf0051640  ;   {oop(&quot;&quot;{0x00000000f0051640})}
[info]   0.54%        │││         │    0x00007f616785f1b3: mov    DWORD PTR [rax+0x10],0xf009cb58  ;*invokeinterface isEmpty {reexecute=0 rethrow=0 return_oop=0}
[info]                │││         │                                                              ; - scala.collection.IterableOnceOps::nonEmpty@1 (line 819)
[info]                │││         │                                                              ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]                │││         │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]                │││         │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]                │││         │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                │││         │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                │││         │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                │││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                │││         │                                                              ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f009cb58})}
[info]   0.87%        │││         │    0x00007f616785f1ba: mov    r10,rax                        ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]                │││         │                                                              ; - scala.collection.immutable.List::&lt;init&gt;@1 (line 83)
[info]                │││         │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 592)
[info]                │││         │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                │││         │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                │││         │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                │││         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.16%        │││         │    0x00007f616785f1bd: mov    r8d,DWORD PTR [rsp+0x50]
[info]   0.15%        │││         │    0x00007f616785f1c2: test   r8d,r8d
[info]                │╰│         │    0x00007f616785f1c5: jne    0x00007f616785f110             ;*synchronization entry
[info]                │ │         │                                                              ; - java.lang.invoke.DirectMethodHandle::internalMemberName@-1 (line 310)
[info]                │ │         │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@7
[info]                │ │         │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                │ │         │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                │ │         │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]                │ │         │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                │ │         │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                │ │         │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                │ │         │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.04%        │ │         │    0x00007f616785f1cb: mov    QWORD PTR [rsp+0x58],rax
[info]   0.02%        │ │         │    0x00007f616785f1d0: mov    DWORD PTR [rsp+0x54],r10d
[info]   0.07%        │ ╰         │    0x00007f616785f1d5: jmp    0x00007f616785f12f
[info]   0.10%        ↘           │    0x00007f616785f1da: mov    r10d,DWORD PTR [rsp+0x50]
[info]                            │    0x00007f616785f1df: cmp    r10d,0xffffffff
[info]                            │    0x00007f616785f1e3: je     0x00007f616785f6fa             ;*invokestatic linkToStatic {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                            │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                            │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                            │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                            │    0x00007f616785f1e9: mov    rsi,QWORD PTR [rsp+0x10]
[info]   0.04%                    │    0x00007f616785f1ee: mov    rdx,QWORD PTR [rsp+0x58]
[info]   0.08%                    │    0x00007f616785f1f3: call   0x00007f6157575980             ; ImmutableOopMap{rbp=Oop [152]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop }
[info]                            │                                                              ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - bench.ListsBenchmark::all@13 (line 87)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                            │                                                              ;   {optimized virtual_call}
[info]   0.36%                    │    0x00007f616785f1f8: mov    r11,rbp
[info]   0.01%                    │    0x00007f616785f1fb: mov    r10d,DWORD PTR [r11+0xc]
[info]                            │    0x00007f616785f1ff: test   r10d,r10d
[info]                            │    0x00007f616785f202: jle    0x00007f616785f76d             ;*invokestatic internalMemberName {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@7
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                            │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                            │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                            │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                            │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                            │    0x00007f616785f208: mov    QWORD PTR [rsp+0x90],r11
[info]   0.16%                    │    0x00007f616785f210: xor    r11d,r11d
[info]                            │    0x00007f616785f213: xor    ecx,ecx
[info]                            │    0x00007f616785f215: xor    r8d,r8d
[info]   0.07%                    │    0x00007f616785f218: movabs r9,0xf009cb58                  ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f009cb58})}
[info]                            │    0x00007f616785f222: mov    r10d,0xf009cb58                ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f009cb58})}
[info]                            │    0x00007f616785f228: mov    QWORD PTR [rsp+0x60],r11
[info]                            │    0x00007f616785f22d: mov    DWORD PTR [rsp+0x24],ecx
[info]   0.13%                    │    0x00007f616785f231: mov    DWORD PTR [rsp+0x50],r8d
[info]                            │    0x00007f616785f236: mov    QWORD PTR [rsp+0x58],r9
[info]                            │    0x00007f616785f23b: mov    DWORD PTR [rsp+0x54],r10d
[info]   0.02%           ╭        │    0x00007f616785f240: jmp    0x00007f616785f2c7
[info]                   │        │    0x00007f616785f245: data16 data16 nop WORD PTR [rax+rax*1+0x0]
[info]   0.36%           │ ↗      │    0x00007f616785f250: mov    r11,QWORD PTR [rsp+0x60]
[info]   0.24%           │ │      │    0x00007f616785f255: mov    DWORD PTR [r11+0x10],r10d      ;*synchronization entry
[info]                   │ │      │                                                              ; - scala.collection.mutable.ListBuffer::addOne@-1 (line 108)
[info]                   │ │      │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                   │ │      │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                   │ │      │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                   │ │      │                                                              ; implicit exception: dispatches to 0x00007f616785fb1a
[info]   1.85%           │ │      │    0x00007f616785f259: mov    r10,r11
[info]   0.19%           │ │      │    0x00007f616785f25c: mov    r8d,DWORD PTR [rsp+0x54]
[info]   0.13%           │ │      │    0x00007f616785f261: mov    r11,r8                         ;*synchronization entry
[info]                   │ │      │                                                              ; - skala.collection.mutable.ListBuffer::last0_$eq@-1 (line 30)
[info]                   │ │      │                                                              ; - skala.collection.mutable.ListBuffer::addOne@41 (line 74)
[info]                   │ │      │                                                              ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]                   │ │      │                                                              ; - bench.ListsBenchmark::all@26 (line 89)
[info]                   │ │      │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.12%           │ │      │    0x00007f616785f264: mov    QWORD PTR [rsp+0x58],r11
[info]   0.75%           │ │      │    0x00007f616785f269: shr    r10,0x9
[info]   0.20%           │ │      │    0x00007f616785f26d: movabs r11,0x7f61561a5000
[info]   0.13%           │ │      │    0x00007f616785f277: mov    BYTE PTR [r11+r10*1],0x0       ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]                   │ │      │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]                   │ │      │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                   │ │      │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                   │ │      │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                   │ │      │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                   │ │      │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                   │ │      │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                   │ │      │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                   │ │      │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.49%           │ │↗     │    0x00007f616785f27c: mov    r8,QWORD PTR [r15+0x108]
[info]   0.81%           │ ││     │    0x00007f616785f283: mov    r11d,DWORD PTR [rsp+0x24]
[info]   0.16%           │ ││     │    0x00007f616785f288: inc    r11d                           ;*invokestatic nonEmpty$ {reexecute=0 rethrow=0 return_oop=0}
[info]                   │ ││     │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]                   │ ││     │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]                   │ ││     │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                   │ ││     │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                   │ ││     │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                   │ ││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.15%           │ ││     │    0x00007f616785f28b: mov    DWORD PTR [rsp+0x24],r11d
[info]   0.30%           │ ││     │    0x00007f616785f290: mov    r10,QWORD PTR [rsp+0x90]
[info]   0.81%           │ ││     │    0x00007f616785f298: mov    r10d,DWORD PTR [r10+0xc]       ;*invokevirtual scalaListBufferPlusEq {reexecute=0 rethrow=0 return_oop=0}
[info]                   │ ││     │                                                              ; - bench.ListsBenchmark::all@18 (line 88)
[info]                   │ ││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.27%           │ ││     │    0x00007f616785f29c: mov    r11d,DWORD PTR [rsp+0x50]
[info]   0.14%           │ ││     │    0x00007f616785f2a1: inc    r11d                           ; ImmutableOopMap{[144]=Oop [152]=Oop [160]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop [84]=NarrowOop [88]=Oop }
[info]                   │ ││     │                                                              ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]                   │ ││     │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEq@28 (line 57)
[info]                   │ ││     │                                                              ; - bench.ListsBenchmark::all@18 (line 88)
[info]                   │ ││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.23%           │ ││     │    0x00007f616785f2a4: test   DWORD PTR [r8],eax             ;*if_icmpne {reexecute=0 rethrow=0 return_oop=0}
[info]                   │ ││     │                                                              ; - scala.collection.mutable.ListBuffer::isEmpty@5 (line 64)
[info]                   │ ││     │                                                              ; - scala.collection.IterableOnceOps::nonEmpty@1 (line 819)
[info]                   │ ││     │                                                              ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]                   │ ││     │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]                   │ ││     │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]                   │ ││     │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                   │ ││     │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                   │ ││     │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                   │ ││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                   │ ││     │                                                              ;   {poll}
[info]   0.66%           │ ││     │    0x00007f616785f2a7: mov    r9d,DWORD PTR [rsp+0x24]
[info]   0.22%           │ ││     │    0x00007f616785f2ac: cmp    r9d,r10d
[info]                   │╭││     │    0x00007f616785f2af: jge    0x00007f616785f34f             ;*aload_0 {reexecute=0 rethrow=0 return_oop=0}
[info]                   ││││     │                                                              ; - scala.collection.mutable.ListBuffer::first@0 (line 47)
[info]                   ││││     │                                                              ; - scala.collection.mutable.ListBuffer::toList@12 (line 82)
[info]                   ││││     │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                   ││││     │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                   ││││     │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                   ││││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.13%           ││││     │    0x00007f616785f2b5: mov    DWORD PTR [rsp+0x50],r11d
[info]   0.18%           ││││     │    0x00007f616785f2ba: mov    r10,QWORD PTR [rsp+0xa0]
[info]   0.62%           ││││     │    0x00007f616785f2c2: mov    QWORD PTR [rsp+0x60],r10
[info]   0.26%           ↘│││     │    0x00007f616785f2c7: mov    rax,QWORD PTR [r15+0x118]
[info]   0.20%            │││     │    0x00007f616785f2ce: mov    r10,rax
[info]   0.15%            │││     │    0x00007f616785f2d1: add    r10,0x18
[info]   0.70%            │││     │    0x00007f616785f2d5: cmp    r10,QWORD PTR [r15+0x128]
[info]                    │││     │    0x00007f616785f2dc: jae    0x00007f616785f635             ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]                    │││     │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]                    │││     │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                    │││     │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                    │││     │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                    │││     │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                    │││     │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                    │││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.43%            │││     │    0x00007f616785f2e2: mov    QWORD PTR [r15+0x118],r10
[info]   0.14%            │││     │    0x00007f616785f2e9: prefetchw BYTE PTR [r10+0xc0]
[info]   0.90%            │││     │    0x00007f616785f2f1: mov    QWORD PTR [rax],0x1
[info]   0.82%            │││     │    0x00007f616785f2f8: mov    DWORD PTR [rax+0x8],0x237008   ;*aload_1 {reexecute=0 rethrow=0 return_oop=0}
[info]                    │││     │                                                              ; - bench.ListsBenchmark::skalaPlusEq@18 (line 78)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::all@34 (line 90)
[info]                    │││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                    │││     │                                                              ;   {metadata(&apos;scala/collection/immutable/$colon$colon&apos;)}
[info]   0.64%            │││     │    0x00007f616785f2ff: mov    DWORD PTR [rax+0x14],0x0
[info]   0.60%            │││     │    0x00007f616785f306: mov    DWORD PTR [rax+0xc],0xf0051640  ;   {oop(&quot;&quot;{0x00000000f0051640})}
[info]   0.66%            │││     │    0x00007f616785f30d: mov    DWORD PTR [rax+0x10],0xf009cb58  ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]                    │││     │                                                              ; - scala.collection.immutable.AbstractSeq::&lt;init&gt;@1 (line 159)
[info]                    │││     │                                                              ; - scala.collection.immutable.List::&lt;init&gt;@1 (line 83)
[info]                    │││     │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 592)
[info]                    │││     │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                    │││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                    │││     │                                                              ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f009cb58})}
[info]   0.60%            │││     │    0x00007f616785f314: mov    QWORD PTR [rsp+0xa0],rax       ;*invokestatic linkToStatic {reexecute=0 rethrow=0 return_oop=0}
[info]                    │││     │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                    │││     │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                    │││     │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                    │││     │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                    │││     │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                    │││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.34%            │││     │    0x00007f616785f31c: mov    rsi,rax
[info]   0.17%            │││     │    0x00007f616785f31f: call   0x00007f6157575980             ; ImmutableOopMap{[144]=Oop [152]=Oop [160]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop [84]=NarrowOop [88]=Oop [96]=Oop }
[info]                    │││     │                                                              ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]                    │││     │                                                              ; - scala.collection.immutable.AbstractSeq::&lt;init&gt;@1 (line 159)
[info]                    │││     │                                                              ; - scala.collection.immutable.List::&lt;init&gt;@1 (line 83)
[info]                    │││     │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 592)
[info]                    │││     │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                    │││     │                                                              ; - scala.collection.mutable.ListBuffer::addOne@2 (line 39)
[info]                    │││     │                                                              ; - scala.collection.mutable.Growable::$plus$eq@2 (line 38)
[info]                    │││     │                                                              ; - scala.collection.mutable.Growable::$plus$eq$@2 (line 38)
[info]                    │││     │                                                              ; - scala.collection.mutable.AbstractBuffer::$plus$eq@2 (line 232)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEq@21 (line 56)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::all@18 (line 88)
[info]                    │││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                    │││     │                                                              ;   {optimized virtual_call}
[info]   0.46%            │││     │    0x00007f616785f324: mov    r10,QWORD PTR [rsp+0xa0]       ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]                    │││     │                                                              ; - scala.collection.immutable.List::&lt;init&gt;@1 (line 83)
[info]                    │││     │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 592)
[info]                    │││     │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                    │││     │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                    │││     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.45%            │││     │    0x00007f616785f32c: mov    ebp,DWORD PTR [rsp+0x50]
[info]   0.51%            │││     │    0x00007f616785f330: test   ebp,ebp
[info]                    │╰│     │    0x00007f616785f332: jne    0x00007f616785f250             ;*invokevirtual storeFence {reexecute=0 rethrow=0 return_oop=0}
[info]                    │ │     │                                                              ; - java.lang.invoke.VarHandle::releaseFence@3 (line 2099)
[info]                    │ │     │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                    │ │     │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                    │ │     │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                    │ │     │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]                    │ │     │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                    │ │     │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                    │ │     │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                    │ │     │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.02%            │ │     │    0x00007f616785f338: mov    DWORD PTR [rsp+0x54],r10d
[info]   0.07%            │ │     │    0x00007f616785f33d: mov    r10,QWORD PTR [rsp+0xa0]
[info]   0.01%            │ │     │    0x00007f616785f345: mov    QWORD PTR [rsp+0x58],r10
[info]   0.03%            │ ╰     │    0x00007f616785f34a: jmp    0x00007f616785f27c
[info]                    ↘       │    0x00007f616785f34f: mov    r10d,DWORD PTR [rsp+0x54]
[info]   0.04%                    │    0x00007f616785f354: mov    rdx,r10
[info]   0.07%                    │    0x00007f616785f357: cmp    ebp,0xffffffff
[info]                            │    0x00007f616785f35a: je     0x00007f616785f74e             ;*invokestatic linkToStatic {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                            │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                            │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                            │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.05%                    │    0x00007f616785f360: mov    rsi,QWORD PTR [rsp+0x10]
[info]   0.01%                    │    0x00007f616785f365: xchg   ax,ax
[info]   0.05%                    │    0x00007f616785f367: call   0x00007f6157575980             ; ImmutableOopMap{[144]=Oop [152]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop }
[info]                            │                                                              ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - bench.ListsBenchmark::all@21 (line 88)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                            │                                                              ;   {optimized virtual_call}
[info]   0.24%                    │    0x00007f616785f36c: mov    r11,QWORD PTR [rsp+0x90]
[info]   0.02%                    │    0x00007f616785f374: mov    r10d,DWORD PTR [r11+0xc]
[info]   0.01%                    │    0x00007f616785f378: test   r10d,r10d
[info]                            │    0x00007f616785f37b: jle    0x00007f616785f7c1             ;*synchronization entry
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::addOne@-1 (line 108)
[info]                            │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                            │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.08%                    │    0x00007f616785f381: movabs r9,0xf0096d38                  ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x00000000f0096d38})}
[info]   0.07%                    │    0x00007f616785f38b: xor    ecx,ecx
[info]   0.01%                    │    0x00007f616785f38d: xor    r11d,r11d
[info]                            │    0x00007f616785f390: xor    r8d,r8d
[info]   0.09%                    │    0x00007f616785f393: mov    r10d,0xf0096d38                ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x00000000f0096d38})}
[info]   0.03%                    │    0x00007f616785f399: mov    QWORD PTR [rsp+0x60],rcx
[info]   0.01%                    │    0x00007f616785f39e: mov    DWORD PTR [rsp+0x24],r11d
[info]                            │    0x00007f616785f3a3: mov    DWORD PTR [rsp+0x58],r8d
[info]   0.11%                    │    0x00007f616785f3a8: mov    DWORD PTR [rsp+0x5c],r10d
[info]   0.04%               ╭    │    0x00007f616785f3ad: jmp    0x00007f616785f413
[info]                       │    │    0x00007f616785f3af: nop
[info]   0.56%               │ ↗  │    0x00007f616785f3b0: mov    r10,QWORD PTR [rsp+0x60]
[info]   0.34%               │ │  │    0x00007f616785f3b5: mov    DWORD PTR [r10+0x10],r11d      ;*invokespecial first_$eq {reexecute=0 rethrow=0 return_oop=0}
[info]                       │ │  │                                                              ; - scala.collection.mutable.ListBuffer::addOne@26 (line 110)
[info]                       │ │  │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                       │ │  │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                       │ │  │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                       │ │  │                                                              ; implicit exception: dispatches to 0x00007f616785fb0a
[info]   2.93%               │ │  │    0x00007f616785f3b9: mov    r11d,DWORD PTR [rsp+0x5c]
[info]   0.02%               │ │  │    0x00007f616785f3be: mov    r9,r11                         ;*getfield last0 {reexecute=0 rethrow=0 return_oop=0}
[info]                       │ │  │                                                              ; - skala.collection.mutable.ListBuffer::last0@1 (line 26)
[info]                       │ │  │                                                              ; - skala.collection.mutable.ListBuffer::addOne@32 (line 72)
[info]                       │ │  │                                                              ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]                       │ │  │                                                              ; - bench.ListsBenchmark::all@26 (line 89)
[info]                       │ │  │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.22%               │ │  │    0x00007f616785f3c1: shr    r10,0x9
[info]   0.18%               │ │  │    0x00007f616785f3c5: movabs r11,0x7f61561a5000
[info]   0.78%               │ │  │    0x00007f616785f3cf: mov    BYTE PTR [r11+r10*1],0x0       ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]                       │ │  │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]                       │ │  │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                       │ │  │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                       │ │  │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                       │ │  │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                       │ │  │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                       │ │  │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                       │ │  │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                       │ │  │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.47%               │ │↗ │    0x00007f616785f3d4: mov    r11,QWORD PTR [r15+0x108]
[info]   0.32%               │ ││ │    0x00007f616785f3db: mov    r10d,DWORD PTR [rsp+0x24]
[info]   0.08%               │ ││ │    0x00007f616785f3e0: inc    r10d                           ;*invokevirtual invoke {reexecute=0 rethrow=0 return_oop=0}
[info]                       │ ││ │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                       │ ││ │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                       │ ││ │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                       │ ││ │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                       │ ││ │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                       │ ││ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.63%               │ ││ │    0x00007f616785f3e3: mov    DWORD PTR [rsp+0x24],r10d
[info]   0.21%               │ ││ │    0x00007f616785f3e8: mov    r10,QWORD PTR [rsp+0x90]
[info]   0.26%               │ ││ │    0x00007f616785f3f0: mov    r8d,DWORD PTR [r10+0xc]        ;*new {reexecute=0 rethrow=0 return_oop=0}
[info]                       │ ││ │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEq@0 (line 53)
[info]                       │ ││ │                                                              ; - bench.ListsBenchmark::all@18 (line 88)
[info]                       │ ││ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.19%               │ ││ │    0x00007f616785f3f4: mov    r10d,DWORD PTR [rsp+0x58]
[info]   0.64%               │ ││ │    0x00007f616785f3f9: inc    r10d                           ; ImmutableOopMap{r9=Oop rax=Oop [144]=Oop [152]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop [92]=NarrowOop }
[info]                       │ ││ │                                                              ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]                       │ ││ │                                                              ; - bench.ListsBenchmark::skalaAddOne@28 (line 68)
[info]                       │ ││ │                                                              ; - bench.ListsBenchmark::all@26 (line 89)
[info]                       │ ││ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.13%               │ ││ │    0x00007f616785f3fc: test   DWORD PTR [r11],eax            ;*ifne {reexecute=0 rethrow=0 return_oop=0}
[info]                       │ ││ │                                                              ; - scala.collection.IterableOnceOps::nonEmpty@6 (line 819)
[info]                       │ ││ │                                                              ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]                       │ ││ │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]                       │ ││ │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]                       │ ││ │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                       │ ││ │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                       │ ││ │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                       │ ││ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                       │ ││ │                                                              ;   {poll}
[info]   0.34%               │ ││ │    0x00007f616785f3ff: mov    r11d,DWORD PTR [rsp+0x24]
[info]   0.14%               │ ││ │    0x00007f616785f404: cmp    r11d,r8d
[info]                       │╭││ │    0x00007f616785f407: jge    0x00007f616785f47c             ;*getfield first {reexecute=0 rethrow=0 return_oop=0}
[info]                       ││││ │                                                              ; - scala.collection.mutable.ListBuffer::first@1 (line 47)
[info]                       ││││ │                                                              ; - scala.collection.mutable.ListBuffer::toList@12 (line 82)
[info]                       ││││ │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                       ││││ │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                       ││││ │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                       ││││ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.61%               ││││ │    0x00007f616785f409: mov    DWORD PTR [rsp+0x58],r10d
[info]   0.11%               ││││ │    0x00007f616785f40e: mov    QWORD PTR [rsp+0x60],rax
[info]   0.26%               ↘│││ │    0x00007f616785f413: mov    rax,QWORD PTR [r15+0x118]
[info]   0.17%                │││ │    0x00007f616785f41a: mov    r10,rax
[info]   0.64%                │││ │    0x00007f616785f41d: add    r10,0x18
[info]   0.25%                │││ │    0x00007f616785f421: cmp    r10,QWORD PTR [r15+0x128]
[info]                        │││ │    0x00007f616785f428: jae    0x00007f616785f61d             ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]                        │││ │                                                              ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]                        │││ │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                        │││ │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                        │││ │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                        │││ │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                        │││ │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                        │││ │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                        │││ │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                        │││ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.37%                │││ │    0x00007f616785f42e: mov    QWORD PTR [r15+0x118],r10      ;*invokevirtual skalaPlusEq {reexecute=0 rethrow=0 return_oop=0}
[info]                        │││ │                                                              ; - bench.ListsBenchmark::all@34 (line 90)
[info]                        │││ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.17%                │││ │    0x00007f616785f435: prefetchw BYTE PTR [r10+0xc0]
[info]   0.82%                │││ │    0x00007f616785f43d: mov    QWORD PTR [rax],0x1
[info]   0.39%                │││ │    0x00007f616785f444: mov    DWORD PTR [rax+0x8],0x239463   ;   {metadata(&apos;skala/collection/immutable/$colon$colon&apos;)}
[info]   0.25%                │││ │    0x00007f616785f44b: mov    DWORD PTR [rax+0x14],0x0
[info]   0.37%                │││ │    0x00007f616785f452: mov    DWORD PTR [rax+0xc],0xf0051640  ;   {oop(&quot;&quot;{0x00000000f0051640})}
[info]   0.72%                │││ │    0x00007f616785f459: mov    DWORD PTR [rax+0x10],0xf0096d38  ;*invokespecial nonEmpty {reexecute=0 rethrow=0 return_oop=0}
[info]                        │││ │                                                              ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]                        │││ │                                                              ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]                        │││ │                                                              ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]                        │││ │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                        │││ │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                        │││ │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                        │││ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                        │││ │                                                              ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x00000000f0096d38})}
[info]   0.36%                │││ │    0x00007f616785f460: mov    r11,rax                        ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]                        │││ │                                                              ; - scala.collection.immutable.AbstractSeq::&lt;init&gt;@1 (line 159)
[info]                        │││ │                                                              ; - scala.collection.immutable.List::&lt;init&gt;@1 (line 83)
[info]                        │││ │                                                              ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 592)
[info]                        │││ │                                                              ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                        │││ │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                        │││ │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                        │││ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.24%                │││ │    0x00007f616785f463: mov    ebp,DWORD PTR [rsp+0x58]
[info]   0.16%                │││ │    0x00007f616785f467: test   ebp,ebp
[info]                        │╰│ │    0x00007f616785f469: jne    0x00007f616785f3b0             ;*invokespecial first_$eq {reexecute=0 rethrow=0 return_oop=0}
[info]                        │ │ │                                                              ; - scala.collection.mutable.ListBuffer::addOne@26 (line 110)
[info]                        │ │ │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                        │ │ │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                        │ │ │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.03%                │ │ │    0x00007f616785f46f: mov    DWORD PTR [rsp+0x5c],r11d
[info]   0.04%                │ │ │    0x00007f616785f474: mov    r9,rax
[info]   0.02%                │ ╰ │    0x00007f616785f477: jmp    0x00007f616785f3d4
[info]   0.06%                ↘   │    0x00007f616785f47c: mov    r8d,DWORD PTR [rsp+0x5c]
[info]   0.03%                    │    0x00007f616785f481: mov    rdx,r8
[info]                            │    0x00007f616785f484: cmp    ebp,0xffffffff
[info]                            │    0x00007f616785f487: je     0x00007f616785f7aa             ;*invokevirtual storeFence {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - java.lang.invoke.VarHandle::releaseFence@3 (line 2099)
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                            │                                                              ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                            │                                                              ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                            │                                                              ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                            │                                                              ; - bench.ListsBenchmark::all@2 (line 86)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.03%                    │    0x00007f616785f48d: mov    rsi,QWORD PTR [rsp+0x10]
[info]   0.09%                    │    0x00007f616785f492: nop
[info]   0.07%                    │    0x00007f616785f493: call   0x00007f6157575980             ; ImmutableOopMap{[144]=Oop [152]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop }
[info]                            │                                                              ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - bench.ListsBenchmark::all@29 (line 89)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                            │                                                              ;   {optimized virtual_call}
[info]   0.27%                    │    0x00007f616785f498: mov    r10,QWORD PTR [rsp+0x90]
[info]   0.02%                    │    0x00007f616785f4a0: mov    r11d,DWORD PTR [r10+0xc]
[info]   0.01%                    │    0x00007f616785f4a4: test   r11d,r11d
[info]                            │    0x00007f616785f4a7: jle    0x00007f616785f815             ;*putfield first {reexecute=0 rethrow=0 return_oop=0}
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::first_$eq@2 (line 47)
[info]                            │                                                              ; - scala.collection.mutable.ListBuffer::addOne@26 (line 110)
[info]                            │                                                              ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                            │                                                              ; - bench.ListsBenchmark::all@10 (line 87)
[info]                            │                                                              ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.07%                    │    0x00007f616785f4ad: mov    QWORD PTR [rsp+0xa0],r10
[info]   0.01%                    │    0x00007f616785f4b5: xor    r11d,r11d
[info]   0.01%                    │    0x00007f616785f4b8: xor    r9d,r9d
[info]   0.04%                    │    0x00007f616785f4bb: xor    r10d,r10d
[info]   0.08%                    │    0x00007f616785f4be: movabs r8,0xf0096d38                  ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x00000000f0096d38})}
[info]   0.02%                    │    0x00007f616785f4c8: mov    ebp,0xf0096d38                 ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x00000000f0096d38})}
[info]   0.01%                    │    0x00007f616785f4cd: mov    QWORD PTR [rsp+0x58],r11
[info]   0.04%                    │    0x00007f616785f4d2: mov    DWORD PTR [rsp+0x24],r9d
[info]   0.08%                    │    0x00007f616785f4d7: mov    DWORD PTR [rsp+0x48],r10d
[info]   0.05%                    │    0x00007f616785f4dc: mov    QWORD PTR [rsp+0x50],r8
[info]   0.03%                    │    0x00007f616785f4e1: mov    DWORD PTR [rsp+0x4c],ebp
[info]   0.07%                   ╭│    0x00007f616785f4e5: jmp    0x00007f616785f559
[info]                           ││    0x00007f616785f4e7: nop    WORD PTR [rax+rax*1+0x0]
[info]   0.84%                   ││↗   0x00007f616785f4f0: mov    r10,QWORD PTR [rsp+0x58]
[info]   0.20%                   │││   0x00007f616785f4f5: mov    DWORD PTR [r10+0x10],r11d      ;*invokespecial last0 {reexecute=0 rethrow=0 return_oop=0}
[info]                           │││                                                             ; - scala.collection.mutable.ListBuffer::addOne@33 (line 110)
[info]                           │││                                                             ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                           │││                                                             ; - bench.ListsBenchmark::all@10 (line 87)
[info]                           │││                                                             ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                           │││                                                             ; implicit exception: dispatches to 0x00007f616785fb2e
[info]   0.19%                   │││   0x00007f616785f4f9: mov    r11d,DWORD PTR [rsp+0x4c]      ;*ifne {reexecute=0 rethrow=0 return_oop=0}
[info]                           │││                                                             ; - skala.collection.mutable.ListBuffer::addOne@20 (line 69)
[info]                           │││                                                             ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]                           │││                                                             ; - bench.ListsBenchmark::all@26 (line 89)
[info]                           │││                                                             ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.27%                   │││   0x00007f616785f4fe: mov    QWORD PTR [rsp+0x50],r11
[info]   0.83%                   │││   0x00007f616785f503: shr    r10,0x9
[info]   0.14%                   │││   0x00007f616785f507: movabs r11,0x7f61561a5000
[info]   0.05%                   │││   0x00007f616785f511: mov    BYTE PTR [r11+r10*1],0x0       ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]                           │││                                                             ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]                           │││                                                             ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                           │││                                                             ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                           │││                                                             ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                           │││                                                             ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                           │││                                                             ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                           │││                                                             ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                           │││                                                             ; - bench.ListsBenchmark::all@10 (line 87)
[info]                           │││                                                             ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.26%                   │││↗  0x00007f616785f516: mov    r8,QWORD PTR [r15+0x108]
[info]   0.96%                   ││││  0x00007f616785f51d: mov    r11d,DWORD PTR [rsp+0x24]
[info]   0.28%                   ││││  0x00007f616785f522: inc    r11d                           ;*invokevirtual asType {reexecute=0 rethrow=0 return_oop=0}
[info]                           ││││                                                            ; - java.lang.invoke.Invokers::checkGenericType@2 (line 495)
[info]                           ││││                                                            ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@8
[info]                           ││││                                                            ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                           ││││                                                            ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                           ││││                                                            ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                           ││││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                           ││││                                                            ; - bench.ListsBenchmark::all@2 (line 86)
[info]                           ││││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.14%                   ││││  0x00007f616785f525: mov    DWORD PTR [rsp+0x24],r11d
[info]   0.14%                   ││││  0x00007f616785f52a: mov    r10,QWORD PTR [rsp+0xa0]
[info]   0.95%                   ││││  0x00007f616785f532: mov    r10d,DWORD PTR [r10+0xc]       ;*new {reexecute=0 rethrow=0 return_oop=0}
[info]                           ││││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@0 (line 53)
[info]                           ││││                                                            ; - bench.ListsBenchmark::all@18 (line 88)
[info]                           ││││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.22%                   ││││  0x00007f616785f536: mov    r11d,DWORD PTR [rsp+0x48]
[info]   0.06%                   ││││  0x00007f616785f53b: inc    r11d                           ; ImmutableOopMap{rbp=Oop [152]=Oop [160]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop [76]=NarrowOop [80]=Oop }
[info]                           ││││                                                            ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]                           ││││                                                            ; - bench.ListsBenchmark::skalaPlusEq@28 (line 79)
[info]                           ││││                                                            ; - bench.ListsBenchmark::all@34 (line 90)
[info]                           ││││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.21%                   ││││  0x00007f616785f53e: test   DWORD PTR [r8],eax             ;*invokestatic nonEmpty$ {reexecute=0 rethrow=0 return_oop=0}
[info]                           ││││                                                            ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]                           ││││                                                            ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]                           ││││                                                            ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                           ││││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                           ││││                                                            ; - bench.ListsBenchmark::all@10 (line 87)
[info]                           ││││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                           ││││                                                            ;   {poll}
[info]   1.02%                   ││││  0x00007f616785f541: mov    r8d,DWORD PTR [rsp+0x24]
[info]   0.30%                   ││││  0x00007f616785f546: cmp    r8d,r10d
[info]                           │╰││  0x00007f616785f549: jge    0x00007f616785ef38             ;*getfield first {reexecute=0 rethrow=0 return_oop=0}
[info]                           │ ││                                                            ; - scala.collection.mutable.ListBuffer::first@1 (line 47)
[info]                           │ ││                                                            ; - scala.collection.mutable.ListBuffer::toList@12 (line 82)
[info]                           │ ││                                                            ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                           │ ││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                           │ ││                                                            ; - bench.ListsBenchmark::all@2 (line 86)
[info]                           │ ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.06%                   │ ││  0x00007f616785f54f: mov    DWORD PTR [rsp+0x48],r11d
[info]   0.15%                   │ ││  0x00007f616785f554: mov    QWORD PTR [rsp+0x58],rbp
[info]   0.82%                   ↘ ││  0x00007f616785f559: mov    rax,QWORD PTR [r15+0x118]
[info]   0.10%                     ││  0x00007f616785f560: mov    r10,rax
[info]   0.05%                     ││  0x00007f616785f563: add    r10,0x18
[info]   0.27%                     ││  0x00007f616785f567: cmp    r10,QWORD PTR [r15+0x128]
[info]                             ││  0x00007f616785f56e: jae    0x00007f616785f65d             ;*getstatic UNSAFE {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - java.lang.invoke.VarHandle::releaseFence@0 (line 2099)
[info]                             ││                                                            ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]                             ││                                                            ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                             ││                                                            ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                             ││                                                            ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                             ││                                                            ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                             ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@10 (line 87)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.83%                     ││  0x00007f616785f574: mov    QWORD PTR [r15+0x118],r10      ;*putfield len {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - skala.collection.mutable.ListBuffer::&lt;init&gt;@23 (line 14)
[info]                             ││                                                            ; - bench.ListsBenchmark::skalaPlusEq@4 (line 75)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@34 (line 90)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.11%                     ││  0x00007f616785f57b: prefetchw BYTE PTR [r10+0xc0]         ;*putfield aliased {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - skala.collection.mutable.ListBuffer::&lt;init&gt;@18 (line 13)
[info]                             ││                                                            ; - bench.ListsBenchmark::skalaPlusEq@4 (line 75)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@34 (line 90)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.09%                     ││  0x00007f616785f583: mov    QWORD PTR [rax],0x1            ;*putfield len {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - skala.collection.mutable.ListBuffer::&lt;init&gt;@23 (line 14)
[info]                             ││                                                            ; - bench.ListsBenchmark::skalaPlusEq@4 (line 75)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@34 (line 90)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.28%                     ││  0x00007f616785f58a: mov    DWORD PTR [rax+0x8],0x239463   ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - bench.ListsBenchmark::skalaPlusEq@4 (line 75)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@34 (line 90)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                             ││                                                            ;   {metadata(&apos;skala/collection/immutable/$colon$colon&apos;)}
[info]   0.89%                     ││  0x00007f616785f591: mov    DWORD PTR [rax+0xc],0x0
[info]   0.21%                     ││  0x00007f616785f598: mov    QWORD PTR [rax+0x10],0x0       ;*invokevirtual invoke {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                             ││                                                            ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@14 (line 593)
[info]                             ││                                                            ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                             ││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@2 (line 86)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.16%                     ││  0x00007f616785f5a0: mov    rbp,rax                        ;*invokespecial first {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - scala.collection.mutable.ListBuffer::toList@12 (line 82)
[info]                             ││                                                            ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                             ││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@2 (line 86)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.30%                     ││  0x00007f616785f5a3: mov    rsi,rax
[info]   0.84%                     ││  0x00007f616785f5a6: nop
[info]   0.18%                     ││  0x00007f616785f5a7: call   0x00007f6157575980             ; ImmutableOopMap{rbp=Oop [152]=Oop [160]=Oop [0]=Oop [16]=Oop [40]=Oop [56]=Oop [76]=NarrowOop [80]=Oop [88]=Oop }
[info]                             ││                                                            ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - skala.collection.immutable.AbstractSeq::&lt;init&gt;@1 (line 1)
[info]                             ││                                                            ; - skala.collection.immutable.List::&lt;init&gt;@1 (line 1)
[info]                             ││                                                            ; - skala.collection.immutable.$colon$colon::&lt;init&gt;@1 (line 26)
[info]                             ││                                                            ; - skala.collection.mutable.ListBuffer::addOne@12 (line 68)
[info]                             ││                                                            ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]                             ││                                                            ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]                             ││                                                            ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]                             ││                                                            ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]                             ││                                                            ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@34 (line 90)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                             ││                                                            ;   {optimized virtual_call}
[info]   0.18%                     ││  0x00007f616785f5ac: mov    DWORD PTR [rbp+0x10],0xf0096d38  ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x00000000f0096d38})}
[info]   3.82%                     ││  0x00007f616785f5b3: mov    DWORD PTR [rbp+0xc],0xf0051640  ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - scala.collection.mutable.AbstractSeq::&lt;init&gt;@1 (line 69)
[info]                             ││                                                            ; - scala.collection.mutable.AbstractBuffer::&lt;init&gt;@1 (line 232)
[info]                             ││                                                            ; - scala.collection.mutable.ListBuffer::&lt;init&gt;@1 (line 40)
[info]                             ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@4 (line 53)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@18 (line 88)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                             ││                                                            ;   {oop(&quot;&quot;{0x00000000f0051640})}
[info]   1.41%                     ││  0x00007f616785f5ba: mov    r11,rbp                        ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - scala.collection.immutable.AbstractSeq::&lt;init&gt;@1 (line 159)
[info]                             ││                                                            ; - scala.collection.immutable.List::&lt;init&gt;@1 (line 83)
[info]                             ││                                                            ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 592)
[info]                             ││                                                            ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]                             ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@10 (line 87)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.08%                     ││  0x00007f616785f5bd: mov    r10,rbp
[info]   0.03%                     ││  0x00007f616785f5c0: shr    r10,0x9
[info]   0.17%                     ││  0x00007f616785f5c4: movabs r8,0x7f61561a5000
[info]   0.83%                     ││  0x00007f616785f5ce: mov    BYTE PTR [r8+r10*1],0x0        ;*invokevirtual nonEmpty {reexecute=0 rethrow=0 return_oop=0}
[info]                             ││                                                            ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]                             ││                                                            ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                             ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]                             ││                                                            ; - bench.ListsBenchmark::all@10 (line 87)
[info]                             ││                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.21%                     ││  0x00007f616785f5d3: mov    r8d,DWORD PTR [rsp+0x48]
[info]   0.32%                     ││  0x00007f616785f5d8: test   r8d,r8d
[info]                             ╰│  0x00007f616785f5db: jne    0x00007f616785f4f0             ;*invokespecial last0 {reexecute=0 rethrow=0 return_oop=0}
[info]                              │                                                            ; - scala.collection.mutable.ListBuffer::addOne@33 (line 110)
[info]                              │                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                              │                                                            ; - bench.ListsBenchmark::all@10 (line 87)
[info]                              │                                                            ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]   0.10%                      │  0x00007f616785f5e1: mov    DWORD PTR [rsp+0x4c],r11d
[info]   0.01%                      │  0x00007f616785f5e6: mov    QWORD PTR [rsp+0x50],rbp
[info]                              ╰  0x00007f616785f5eb: jmp    0x00007f616785f516             ;*invokestatic internalMemberName {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                                           ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@7
[info]                                                                                           ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]                                                                                           ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]                                                                                           ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]                                                                                           ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]                                                                                           ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]                                                                                           ; - bench.ListsBenchmark::all@2 (line 86)
[info]                                                                                           ; - bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub@17 (line 119)
[info]                                 0x00007f616785f5f0: mov    rbp,rdx
[info] ....................................................................................................
[info]  88.19%  <total for region 1>
[info] ....[Hottest Regions]...............................................................................
[info]  88.19%         c2, level 4  bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub, version 657 (1710 bytes)
[info]   3.97%         c2, level 4  scala.collection.AbstractSeq::&lt;init&gt;, version 584 (27 bytes)
[info]   3.36%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 611 (75 bytes)
[info]   2.92%         c2, level 4  skala.collection.AbstractSeq::&lt;init&gt;, version 604 (27 bytes)
[info]   0.24%           libjvm.so  SpinPause+0x0 (2 bytes)
[info]   0.14%   [kernel.kallsyms]  native_write_msr+0x6 (0 bytes)
[info]   0.06%           libjvm.so  ElfSymbolTable::lookup+0xf0 (41 bytes)
[info]   0.05%   [kernel.kallsyms]  copy_user_enhanced_fast_string+0x3 (9 bytes)
[info]   0.04%   [kernel.kallsyms]  __intel_pmu_enable_all+0x47 (13 bytes)
[info]   0.04%   [kernel.kallsyms]  entry_SYSCALL_64+0x0 (31 bytes)
[info]   0.03%   [kernel.kallsyms]  _raw_spin_lock+0x0 (16 bytes)
[info]   0.02%   [kernel.kallsyms]  __switch_to+0x3bd (0 bytes)
[info]   0.02%   [kernel.kallsyms]  current_kernel_time64+0x15 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  perf_ctx_unlock+0x0 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  __sb_start_write+0x11 (19 bytes)
[info]   0.02%   [kernel.kallsyms]  fsnotify+0x4a (14 bytes)
[info]   0.02%   [kernel.kallsyms]  _raw_spin_lock_irqsave+0x22 (0 bytes)
[info]   0.02%           libjvm.so  xmlStream::write_text+0x48 (0 bytes)
[info]   0.02%        libc-2.19.so  _IO_fwrite+0x119 (28 bytes)
[info]   0.02%        libc-2.19.so  _IO_default_xsputn+0xc6 (12 bytes)
[info]   0.78%  <...other 76 warm regions...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Hottest Methods (after inlining)]..............................................................
[info]  88.19%         c2, level 4  bench.generated.ListsBenchmark_all_jmhTest::all_thrpt_jmhStub, version 657
[info]   3.97%         c2, level 4  scala.collection.AbstractSeq::&lt;init&gt;, version 584
[info]   3.36%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 611
[info]   2.92%         c2, level 4  skala.collection.AbstractSeq::&lt;init&gt;, version 604
[info]   0.24%           libjvm.so  SpinPause+0x0
[info]   0.14%   [kernel.kallsyms]  native_write_msr+0x6
[info]   0.06%           libjvm.so  ElfSymbolTable::lookup+0xf0
[info]   0.06%        libc-2.19.so  _IO_default_xsputn+0xc6
[info]   0.05%   [kernel.kallsyms]  copy_user_enhanced_fast_string+0x3
[info]   0.04%   [kernel.kallsyms]  __intel_pmu_enable_all+0x47
[info]   0.04%   [kernel.kallsyms]  entry_SYSCALL_64+0x0
[info]   0.03%   [kernel.kallsyms]  _raw_spin_lock+0x0
[info]   0.02%   [kernel.kallsyms]  fsnotify+0x4a
[info]   0.02%        libc-2.19.so  _IO_fwrite+0x119
[info]   0.02%  libpthread-2.19.so  __pthread_disable_asynccancel+0x22
[info]   0.02%   [kernel.kallsyms]  __sb_start_write+0x11
[info]   0.02%   [kernel.kallsyms]  perf_ctx_unlock+0x0
[info]   0.02%  libpthread-2.19.so  pthread_cond_wait@@GLIBC_2.3.2+0xd7
[info]   0.02%   [kernel.kallsyms]  current_kernel_time64+0x15
[info]   0.02%   [kernel.kallsyms]  _raw_spin_lock_irqsave+0x22
[info]   0.74%  <...other 73 warm methods...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Distribution by Source]........................................................................
[info]  98.44%         c2, level 4
[info]   0.70%   [kernel.kallsyms]
[info]   0.51%           libjvm.so
[info]   0.15%        libc-2.19.so
[info]   0.06%  libpthread-2.19.so
[info]   0.05%         interpreter
[info]   0.04%              [ext4]
[info]   0.02%              [jbd2]
[info]   0.01%
[info]   0.01%       perf-8712.map
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.2, OpenJDK 64-Bit Server VM, 12.0.2+10
[info] # VM invoker: /usr/lib/jvm/jdk-12.0.2/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.javaListBufferPlusEqAddOne
[info] # Parameters: (size = 10)
[info] # Run progress: 16.67% complete, ETA 00:01:51
[info] # Fork: 1 of 1
[info] # Preparing profilers: LinuxPerfAsmProfiler
[info] # Profilers consume stdout and stderr from target VM, use -v EXTRA to copy to console
[info] # Warmup Iteration   1: 13639307.799 ops/s
[info] # Warmup Iteration   2: 22736349.822 ops/s
[info] # Warmup Iteration   3: 24378464.198 ops/s
[info] # Warmup Iteration   4: 32437748.327 ops/s
[info] # Warmup Iteration   5: 32516792.657 ops/s
[info] # Warmup Iteration   6: 31481231.166 ops/s
[info] # Warmup Iteration   7: 32523965.047 ops/s
[info] # Warmup Iteration   8: 32537502.728 ops/s
[info] # Warmup Iteration   9: 32570831.439 ops/s
[info] # Warmup Iteration  10: 32243062.962 ops/s
[info] Iteration   1: 32468934.021 ops/s
[info] Iteration   2: 32449344.438 ops/s
[info] Iteration   3: 32451569.167 ops/s
[info] Iteration   4: 32010947.090 ops/s
[info] Iteration   5: 32433874.301 ops/s
[info] Iteration   6: 32445929.156 ops/s
[info] Iteration   7: 32460194.413 ops/s
[info] Iteration   8: 32426090.888 ops/s
[info] Iteration   9: 32452645.447 ops/s
[info] Iteration  10: 32463112.308 ops/s
[info] # Processing profiler results: LinuxPerfAsmProfiler
[info] Result "bench.ListsBenchmark.javaListBufferPlusEqAddOne":
[info]   32406264.123 ±(99.9%) 210897.736 ops/s [Average]
[info]   (min, avg, max) = (32010947.090, 32406264.123, 32468934.021), stdev = 139495.795
[info]   CI (99.9%): [32195366.387, 32617161.859] (assumes normal distribution)
[info] Secondary result "bench.ListsBenchmark.javaListBufferPlusEqAddOne:·asm":
[info] PrintAssembly processed: 163370 total address lines.
[info] Perf output processed (skipped 11.424 seconds):
[info]  Column 1: cycles (10130 events)
[info] Hottest code regions (>10.00% "cycles" events):
[info] ....[Hottest Region 1]..............................................................................
[info] c2, level 4, bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub, version 619 (281 bytes)
[info]                                                                            ;   {optimized virtual_call}
[info]                  0x00007f7283e81d58: mov    rbx,rbp
[info]                  0x00007f7283e81d5b: movzx  r10d,BYTE PTR [rbx+0x94]       ;*getfield isDone {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@30 (line 121)
[info]                                                                            ; implicit exception: dispatches to 0x00007f7283e82052
[info]                  0x00007f7283e81d63: test   r10d,r10d
[info]                  0x00007f7283e81d66: jne    0x00007f7283e81ef1             ;*ifeq {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@33 (line 121)
[info]                  0x00007f7283e81d6c: mov    ebp,0x1
[info]          ╭       0x00007f7283e81d71: jmp    0x00007f7283e81db8
[info]   0.38%  │ ↗     0x00007f7283e81d73: cmp    ecx,0xffffffff
[info]          │ │     0x00007f7283e81d76: je     0x00007f7283e81f2d             ;*if_icmpne {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::isEmpty@5 (line 64)
[info]          │ │                                                               ; - scala.collection.IterableOnceOps::nonEmpty@1 (line 819)
[info]          │ │                                                               ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]          │ │                                                               ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]          │ │                                                               ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.08%  │ │     0x00007f7283e81d7c: mov    QWORD PTR [rsp+0x70],rbx
[info]   0.10%  │ │     0x00007f7283e81d81: mov    QWORD PTR [rsp+0x80],r8        ;*invokevirtual storeFence {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - java.lang.invoke.VarHandle::releaseFence@3 (line 2099)
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]          │ │                                                               ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]          │ │                                                               ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.21%  │ │     0x00007f7283e81d89: mov    rsi,QWORD PTR [rsp+0x8]
[info]   0.45%  │ │     0x00007f7283e81d8e: nop
[info]   0.16%  │ │     0x00007f7283e81d8f: call   0x00007f7273ba6980             ; ImmutableOopMap{[112]=Oop [120]=Oop [128]=Oop [8]=Oop [24]=Oop }
[info]          │ │                                                               ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@20 (line 119)
[info]          │ │                                                               ;   {optimized virtual_call}
[info]   3.13%  │ │     0x00007f7283e81d94: mov    rbx,QWORD PTR [rsp+0x70]
[info]   0.12%  │ │     0x00007f7283e81d99: movzx  r11d,BYTE PTR [rbx+0x94]       ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@28 (line 35)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.19%  │ │     0x00007f7283e81da1: mov    r10,QWORD PTR [r15+0x108]
[info]   0.67%  │ │     0x00007f7283e81da8: add    rbp,0x1                        ; ImmutableOopMap{rbx=Oop [120]=Oop [128]=Oop [8]=Oop [24]=Oop }
[info]          │ │                                                               ;*ifeq {reexecute=1 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@33 (line 121)
[info]   0.04%  │ │     0x00007f7283e81dac: test   DWORD PTR [r10],eax            ;   {poll}
[info]   0.06%  │ │     0x00007f7283e81daf: test   r11d,r11d
[info]          │ │     0x00007f7283e81db2: jne    0x00007f7283e81ef6             ;*aload_1 {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@36 (line 122)
[info]   0.15%  ↘ │     0x00007f7283e81db8: mov    r8,QWORD PTR [rsp+0x80]
[info]   0.61%    │     0x00007f7283e81dc0: mov    r10d,DWORD PTR [r8+0xc]
[info]   0.05%    │     0x00007f7283e81dc4: test   r10d,r10d
[info]            │     0x00007f7283e81dc7: jle    0x00007f7283e81f28             ;*if_icmpge {reexecute=0 rethrow=0 return_oop=0}
[info]            │                                                               ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@15 (line 33)
[info]            │                                                               ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.02%    │     0x00007f7283e81dcd: movabs rdx,0x80116558                 ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x0000000080116558})}
[info]   0.30%    │     0x00007f7283e81dd7: xor    edi,edi
[info]   0.71%    │     0x00007f7283e81dd9: mov    r9d,0x80116558                 ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x0000000080116558})}
[info]   0.02%    │     0x00007f7283e81ddf: xor    r11d,r11d
[info]   0.06%    │     0x00007f7283e81de2: xor    ecx,ecx
[info]   0.22%   ╭│     0x00007f7283e81de4: jmp    0x00007f7283e81e32
[info]           ││     0x00007f7283e81de6: data16 nop WORD PTR [rax+rax*1+0x0]
[info]   3.28%   ││ ↗   0x00007f7283e81df0: mov    DWORD PTR [rdi+0x10],r10d      ;*putfield next {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - scala.collection.immutable.$colon$colon::next_$eq@2 (line 591)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::addOne@37 (line 110)
[info]           ││ │                                                             ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]           ││ │                                                             ; implicit exception: dispatches to 0x00007f7283e82026
[info]   2.90%   ││ │   0x00007f7283e81df4: mov    r10,rdi
[info]   1.47%   ││ │   0x00007f7283e81df7: mov    rdx,r9                         ;*getfield first {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::first@1 (line 47)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::toList@12 (line 82)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]           ││ │                                                             ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@32 (line 37)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.51%   ││ │   0x00007f7283e81dfa: shr    r10,0x9
[info]   3.03%   ││ │   0x00007f7283e81dfe: movabs rdi,0x7f72a1928000
[info]   2.49%   ││ │   0x00007f7283e81e08: mov    BYTE PTR [rdi+r10*1],0x0       ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@28 (line 35)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.54%   ││ │↗  0x00007f7283e81e0d: mov    rsi,QWORD PTR [r15+0x108]
[info]   2.18%   ││ ││  0x00007f7283e81e14: mov    r10d,ecx
[info]   3.25%   ││ ││  0x00007f7283e81e17: inc    r10d                           ;*iadd {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - scala.collection.mutable.ListBuffer::addOne@51 (line 112)
[info]           ││ ││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   3.53%   ││ ││  0x00007f7283e81e1a: mov    edi,DWORD PTR [r8+0xc]         ;*getfield size {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@12 (line 33)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.70%   ││ ││  0x00007f7283e81e1e: inc    r11d                           ; ImmutableOopMap{r8=Oop r9=NarrowOop rbx=Oop rdx=Oop rax=Oop [120]=Oop [8]=Oop [24]=Oop }
[info]           ││ ││                                                            ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@28 (line 35)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.67%   ││ ││  0x00007f7283e81e21: test   DWORD PTR [rsi],eax            ;   {poll}
[info]   3.95%   ││ ││  0x00007f7283e81e23: cmp    r11d,edi
[info]           │╰ ││  0x00007f7283e81e26: jge    0x00007f7283e81d73
[info]   2.53%   │  ││  0x00007f7283e81e2c: mov    rdi,rax
[info]   1.43%   │  ││  0x00007f7283e81e2f: mov    ecx,r10d
[info]   2.29%   ↘  ││  0x00007f7283e81e32: mov    rax,QWORD PTR [r15+0x118]
[info]   3.46%      ││  0x00007f7283e81e39: mov    r10,rax
[info]   2.84%      ││  0x00007f7283e81e3c: add    r10,0x18
[info]   1.70%      ││  0x00007f7283e81e40: cmp    r10,QWORD PTR [r15+0x128]
[info]             ╭││  0x00007f7283e81e47: jae    0x00007f7283e81e91             ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@28 (line 35)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   2.32%     │││  0x00007f7283e81e49: mov    QWORD PTR [r15+0x118],r10
[info]   3.24%     │││  0x00007f7283e81e50: prefetchw BYTE PTR [r10+0xc0]
[info]   5.00%     │││  0x00007f7283e81e58: mov    QWORD PTR [rax],0x1
[info]   6.09%     │││  0x00007f7283e81e5f: mov    DWORD PTR [rax+0x8],0x237008   ;   {metadata(&apos;scala/collection/immutable/$colon$colon&apos;)}
[info]   5.76%     │││  0x00007f7283e81e66: mov    DWORD PTR [rax+0x14],0x0       ;*new {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@4 (line 109)
[info]             │││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   3.26%     │││  0x00007f7283e81e6d: mov    DWORD PTR [rax+0xc],0x80013160  ;*putfield head {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@2 (line 591)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]             │││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {oop(&quot;&quot;{0x0000000080013160})}
[info]   4.72%     │││  0x00007f7283e81e74: mov    DWORD PTR [rax+0x10],0x80116558  ;*synchronization entry
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@-1 (line 108)
[info]             │││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x0000000080116558})}
[info]   3.66%     │││  0x00007f7283e81e7b: mov    r10,rax                        ;*putfield first {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::first_$eq@2 (line 47)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@26 (line 110)
[info]             │││                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.60%     │││  0x00007f7283e81e7e: test   ecx,ecx
[info]   1.75%     │╰│  0x00007f7283e81e80: jne    0x00007f7283e81df0             ;*if_icmpne {reexecute=0 rethrow=0 return_oop=0}
[info]             │ │                                                            ; - scala.collection.mutable.ListBuffer::addOne@21 (line 110)
[info]             │ │                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]             │ │                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.11%     │ │  0x00007f7283e81e86: mov    rdx,rax
[info]   0.21%     │ │  0x00007f7283e81e89: mov    r9d,r10d
[info]   0.53%     │ ╰  0x00007f7283e81e8c: jmp    0x00007f7283e81e0d
[info]             ↘    0x00007f7283e81e91: mov    DWORD PTR [rsp+0x30],ecx
[info]                  0x00007f7283e81e95: mov    DWORD PTR [rsp+0x2c],r11d
[info]                  0x00007f7283e81e9a: mov    DWORD PTR [rsp+0x28],r9d
[info]                  0x00007f7283e81e9f: mov    QWORD PTR [rsp+0x10],rdi
[info]                  0x00007f7283e81ea4: mov    QWORD PTR [rsp],rbp
[info]                  0x00007f7283e81ea8: mov    QWORD PTR [rsp+0x80],rbx
[info]                  0x00007f7283e81eb0: mov    QWORD PTR [rsp+0x70],r8        ;*invokespecial ensureUnaliased {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - scala.collection.mutable.ListBuffer::addOne@1 (line 108)
[info]                                                                            ; - bench.ListsBenchmark::javaListBufferPlusEqAddOne@21 (line 34)
[info]                                                                            ; - bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info] ....................................................................................................
[info]  92.70%  <total for region 1>
[info] ....[Hottest Regions]...............................................................................
[info]  92.70%         c2, level 4  bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub, version 619 (281 bytes)
[info]   5.15%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 585 (75 bytes)
[info]   0.28%           libjvm.so  SpinPause+0x2 (0 bytes)
[info]   0.24%   [kernel.kallsyms]  native_write_msr+0x6 (0 bytes)
[info]   0.06%   [kernel.kallsyms]  __intel_pmu_enable_all+0x47 (0 bytes)
[info]   0.06%           libjvm.so  ElfSymbolTable::lookup+0xf0 (54 bytes)
[info]   0.05%   [kernel.kallsyms]  entry_SYSCALL_64+0x0 (35 bytes)
[info]   0.04%   [kernel.kallsyms]  mutex_unlock+0x10 (0 bytes)
[info]   0.03%   [kernel.kallsyms]  handle_mm_fault+0x1378 (0 bytes)
[info]   0.03%   [kernel.kallsyms]  mutex_lock+0x11 (0 bytes)
[info]   0.03%        libc-2.19.so  _IO_file_xsputn+0x1a (28 bytes)
[info]   0.02%   [kernel.kallsyms]  native_sched_clock+0x7 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  finish_task_switch+0x92 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  fput+0xa (0 bytes)
[info]   0.02%   [kernel.kallsyms]  __fget+0x52 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  _raw_spin_lock_irqsave+0x7 (9 bytes)
[info]   0.02%   [kernel.kallsyms]  system_call_fast_compare_end+0x45 (0 bytes)
[info]   0.02%           libjvm.so  defaultStream::write+0x41 (17 bytes)
[info]   0.02%           libjvm.so  OWSTTaskTerminator::do_spin_master_work+0x1a8 (9 bytes)
[info]   0.02%           libjvm.so  PSCardTable::scavenge_contents_parallel+0x21e (0 bytes)
[info]   1.15%  <...other 112 warm regions...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Hottest Methods (after inlining)]..............................................................
[info]  92.70%         c2, level 4  bench.generated.ListsBenchmark_javaListBufferPlusEqAddOne_jmhTest::javaListBufferPlusEqAddOne_thrpt_jmhStub, version 619
[info]   5.15%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 585
[info]   0.28%           libjvm.so  SpinPause+0x2
[info]   0.24%   [kernel.kallsyms]  native_write_msr+0x6
[info]   0.07%        libc-2.19.so  _IO_file_xsputn+0x1a
[info]   0.06%   [kernel.kallsyms]  __intel_pmu_enable_all+0x47
[info]   0.06%           libjvm.so  ElfSymbolTable::lookup+0xf0
[info]   0.05%   [kernel.kallsyms]  entry_SYSCALL_64+0x0
[info]   0.04%   [kernel.kallsyms]  mutex_unlock+0x10
[info]   0.03%   [kernel.kallsyms]  handle_mm_fault+0x1378
[info]   0.03%                      <unknown>
[info]   0.03%   [kernel.kallsyms]  mutex_lock+0x11
[info]   0.03%         interpreter  method entry point (kind = zerolocals)
[info]   0.02%           libjvm.so  RelocIterator::initialize+0x187
[info]   0.02%           libjvm.so  OWSTTaskTerminator::do_spin_master_work+0x1a8
[info]   0.02%        libc-2.19.so  strchrnul+0x3b
[info]   0.02%           libjvm.so  defaultStream::write+0x41
[info]   0.02%           libjvm.so  PSCardTable::scavenge_contents_parallel+0x21e
[info]   0.02%   [kernel.kallsyms]  native_sched_clock+0x7
[info]   0.02%   [kernel.kallsyms]  fput+0xa
[info]   1.09%  <...other 103 warm methods...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Distribution by Source]........................................................................
[info]  97.86%         c2, level 4
[info]   0.91%   [kernel.kallsyms]
[info]   0.81%           libjvm.so
[info]   0.22%        libc-2.19.so
[info]   0.07%      hsdis-amd64.so
[info]   0.05%         interpreter
[info]   0.03%
[info]   0.02%              [ext4]
[info]   0.01%       perf-8768.map
[info]   0.01%              [jbd2]
[info]   0.01%               [igb]
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.2, OpenJDK 64-Bit Server VM, 12.0.2+10
[info] # VM invoker: /usr/lib/jvm/jdk-12.0.2/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.scalaListBufferPlusEq
[info] # Parameters: (size = 10)
[info] # Run progress: 33.33% complete, ETA 00:01:29
[info] # Fork: 1 of 1
[info] # Preparing profilers: LinuxPerfAsmProfiler
[info] # Profilers consume stdout and stderr from target VM, use -v EXTRA to copy to console
[info] # Warmup Iteration   1: 9487829.068 ops/s
[info] # Warmup Iteration   2: 15923528.069 ops/s
[info] # Warmup Iteration   3: 17325538.213 ops/s
[info] # Warmup Iteration   4: 17272584.049 ops/s
[info] # Warmup Iteration   5: 17321611.245 ops/s
[info] # Warmup Iteration   6: 17299256.377 ops/s
[info] # Warmup Iteration   7: 17263209.808 ops/s
[info] # Warmup Iteration   8: 17285260.643 ops/s
[info] # Warmup Iteration   9: 17305029.035 ops/s
[info] # Warmup Iteration  10: 17293987.751 ops/s
[info] Iteration   1: 17317121.710 ops/s
[info] Iteration   2: 17282315.121 ops/s
[info] Iteration   3: 17292273.238 ops/s
[info] Iteration   4: 17353364.244 ops/s
[info] Iteration   5: 17310991.639 ops/s
[info] Iteration   6: 16938214.319 ops/s
[info] Iteration   7: 17299199.078 ops/s
[info] Iteration   8: 17299340.559 ops/s
[info] Iteration   9: 17297918.026 ops/s
[info] Iteration  10: 17302011.310 ops/s
[info] # Processing profiler results: LinuxPerfAsmProfiler
[info] Result "bench.ListsBenchmark.scalaListBufferPlusEq":
[info]   17269274.924 ±(99.9%) 178239.792 ops/s [Average]
[info]   (min, avg, max) = (16938214.319, 17269274.924, 17353364.244), stdev = 117894.587
[info]   CI (99.9%): [17091035.132, 17447514.717] (assumes normal distribution)
[info] Secondary result "bench.ListsBenchmark.scalaListBufferPlusEq:·asm":
[info] PrintAssembly processed: 157623 total address lines.
[info] Perf output processed (skipped 11.445 seconds):
[info]  Column 1: cycles (10056 events)
[info] Hottest code regions (>10.00% "cycles" events):
[info] ....[Hottest Region 1]..............................................................................
[info] c2, level 4, bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub, version 610 (360 bytes)
[info]                                                                            ;   {optimized virtual_call}
[info]                  0x00007f198342ed3c: mov    rcx,QWORD PTR [rsp+0x70]
[info]                  0x00007f198342ed41: movzx  r11d,BYTE PTR [rcx+0x94]       ;*getfield isDone {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@30 (line 121)
[info]                                                                            ; implicit exception: dispatches to 0x00007f198342f062
[info]                  0x00007f198342ed49: test   r11d,r11d
[info]                  0x00007f198342ed4c: jne    0x00007f198342eefe             ;*ifeq {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@33 (line 121)
[info]                  0x00007f198342ed52: mov    ebx,0x1
[info]          ╭       0x00007f198342ed57: jmp    0x00007f198342ed9c
[info]   0.13%  │ ↗     0x00007f198342ed59: cmp    ebp,0xffffffff
[info]          │ │     0x00007f198342ed5c: je     0x00007f198342ef3d             ;*if_icmpne {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::isEmpty@5 (line 64)
[info]          │ │                                                               ; - scala.collection.IterableOnceOps::nonEmpty@1 (line 819)
[info]          │ │                                                               ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]          │ │                                                               ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]          │ │                                                               ; - bench.ListsBenchmark::scalaListBufferPlusEq@32 (line 59)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]          │ │     0x00007f198342ed62: mov    rbp,QWORD PTR [rsp+0x70]       ;*invokevirtual storeFence {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - java.lang.invoke.VarHandle::releaseFence@3 (line 2099)
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]          │ │                                                               ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]          │ │                                                               ; - bench.ListsBenchmark::scalaListBufferPlusEq@32 (line 59)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.25%  │ │     0x00007f198342ed67: mov    rsi,QWORD PTR [rsp+0x78]
[info]   0.12%  │ │     0x00007f198342ed6c: data16 xchg ax,ax
[info]   0.17%  │ │     0x00007f198342ed6f: call   0x00007f1973152980             ; ImmutableOopMap{rbp=Oop [112]=Oop [120]=Oop [128]=Oop [0]=Oop [24]=Oop }
[info]          │ │                                                               ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@20 (line 119)
[info]          │ │                                                               ;   {optimized virtual_call}
[info]   0.49%  │ │     0x00007f198342ed74: mov    rcx,QWORD PTR [rsp]
[info]   0.18%  │ │     0x00007f198342ed78: movzx  r10d,BYTE PTR [rcx+0x94]       ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.ListsBenchmark::scalaListBufferPlusEq@28 (line 57)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.12%  │ │     0x00007f198342ed80: mov    r11,QWORD PTR [r15+0x108]
[info]   0.15%  │ │     0x00007f198342ed87: mov    rbx,QWORD PTR [rsp+0x8]
[info]   0.02%  │ │     0x00007f198342ed8c: add    rbx,0x1                        ; ImmutableOopMap{rcx=Oop rbp=Oop [112]=Oop [120]=Oop [128]=Oop [0]=Oop [24]=Oop }
[info]          │ │                                                               ;*ifeq {reexecute=1 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@33 (line 121)
[info]   0.10%  │ │     0x00007f198342ed90: test   DWORD PTR [r11],eax            ;   {poll}
[info]   0.10%  │ │     0x00007f198342ed93: test   r10d,r10d
[info]          │ │     0x00007f198342ed96: jne    0x00007f198342ef03             ;*aload_1 {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@36 (line 122)
[info]   0.22%  ↘ │     0x00007f198342ed9c: mov    r11,rbp
[info]   0.03%    │     0x00007f198342ed9f: mov    r8d,DWORD PTR [rbp+0xc]
[info]   0.15%    │     0x00007f198342eda3: test   r8d,r8d
[info]            │     0x00007f198342eda6: jle    0x00007f198342ef38             ;*if_icmpge {reexecute=0 rethrow=0 return_oop=0}
[info]            │                                                               ; - bench.ListsBenchmark::scalaListBufferPlusEq@15 (line 55)
[info]            │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.18%    │     0x00007f198342edac: xor    edi,edi
[info]   0.24%    │     0x00007f198342edae: xor    r9d,r9d
[info]   0.02%    │     0x00007f198342edb1: xor    ebp,ebp
[info]   0.14%    │     0x00007f198342edb3: movabs rdx,0xf005b988                 ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f005b988})}
[info]   0.18%    │     0x00007f198342edbd: mov    r8d,0xf005b988                 ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f005b988})}
[info]   0.17%   ╭│     0x00007f198342edc3: jmp    0x00007f198342ee2e
[info]           ││     0x00007f198342edc5: data16 data16 nop WORD PTR [rax+rax*1+0x0]
[info]   2.55%   ││ ↗   0x00007f198342edd0: mov    r10,QWORD PTR [rsp+0x10]
[info]   0.10%   ││ │   0x00007f198342edd5: mov    DWORD PTR [r10+0x10],r8d       ;*putfield next {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - scala.collection.immutable.$colon$colon::next_$eq@2 (line 591)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::addOne@37 (line 110)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::addOne@2 (line 39)
[info]           ││ │                                                             ; - scala.collection.mutable.Growable::$plus$eq@2 (line 38)
[info]           ││ │                                                             ; - scala.collection.mutable.Growable::$plus$eq$@2 (line 38)
[info]           ││ │                                                             ; - scala.collection.mutable.AbstractBuffer::$plus$eq@2 (line 232)
[info]           ││ │                                                             ; - bench.ListsBenchmark::scalaListBufferPlusEq@21 (line 56)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]           ││ │                                                             ; implicit exception: dispatches to 0x00007f198342f036
[info]   9.05%   ││ │   0x00007f198342edd9: mov    r8d,DWORD PTR [rsp+0x38]
[info]   0.50%   ││ │   0x00007f198342edde: mov    rdx,r8                         ;*getfield first {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::first@1 (line 47)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::toList@12 (line 82)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]           ││ │                                                             ; - bench.ListsBenchmark::scalaListBufferPlusEq@32 (line 59)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   1.62%   ││ │   0x00007f198342ede1: shr    r10,0x9
[info]   0.03%   ││ │   0x00007f198342ede5: movabs r11,0x7f1971d82000
[info]   2.54%   ││ │   0x00007f198342edef: mov    BYTE PTR [r11+r10*1],0x0       ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - bench.ListsBenchmark::scalaListBufferPlusEq@28 (line 57)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   2.73%   ││ │↗  0x00007f198342edf4: mov    rdi,QWORD PTR [r15+0x108]
[info]   1.44%   ││ ││  0x00007f198342edfb: mov    r9d,DWORD PTR [rsp+0x28]
[info]   0.30%   ││ ││  0x00007f198342ee00: inc    r9d                            ;*iinc {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@25 (line 57)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   2.01%   ││ ││  0x00007f198342ee03: mov    r11,QWORD PTR [rsp+0x70]
[info]   1.26%   ││ ││  0x00007f198342ee08: mov    ebx,DWORD PTR [r11+0xc]        ;*getfield size {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@12 (line 55)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   1.73%   ││ ││  0x00007f198342ee0c: mov    r10d,DWORD PTR [rsp+0x2c]
[info]   0.25%   ││ ││  0x00007f198342ee11: inc    r10d                           ; ImmutableOopMap{r11=Oop r8=NarrowOop rcx=Oop rdx=Oop [112]=Oop [120]=Oop [128]=Oop [0]=Oop [24]=Oop }
[info]           ││ ││                                                            ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@28 (line 57)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   2.21%   ││ ││  0x00007f198342ee14: test   DWORD PTR [rdi],eax            ;   {poll}
[info]   1.25%   ││ ││  0x00007f198342ee16: cmp    r9d,ebx
[info]           │╰ ││  0x00007f198342ee19: jge    0x00007f198342ed59
[info]   1.34%   │  ││  0x00007f198342ee1f: mov    rdi,rcx
[info]   0.17%   │  ││  0x00007f198342ee22: mov    rcx,QWORD PTR [rsp]
[info]   1.97%   │  ││  0x00007f198342ee26: mov    rbx,QWORD PTR [rsp+0x8]
[info]   1.20%   │  ││  0x00007f198342ee2b: mov    ebp,r10d
[info]   1.31%   ↘  ││  0x00007f198342ee2e: mov    rax,QWORD PTR [r15+0x118]
[info]   0.35%      ││  0x00007f198342ee35: mov    r10,rax
[info]   1.97%      ││  0x00007f198342ee38: add    r10,0x18
[info]   1.47%      ││  0x00007f198342ee3c: cmp    r10,QWORD PTR [r15+0x128]
[info]             ╭││  0x00007f198342ee43: jae    0x00007f198342eec6             ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@28 (line 57)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   1.59%     │││  0x00007f198342ee49: mov    QWORD PTR [r15+0x118],r10
[info]   0.34%     │││  0x00007f198342ee50: prefetchw BYTE PTR [r10+0xc0]
[info]   2.17%     │││  0x00007f198342ee58: mov    QWORD PTR [rax],0x1
[info]   1.82%     │││  0x00007f198342ee5f: mov    DWORD PTR [rax+0x8],0x237008   ;   {metadata(&apos;scala/collection/immutable/$colon$colon&apos;)}
[info]   2.00%     │││  0x00007f198342ee66: mov    DWORD PTR [rax+0x14],0x0
[info]   0.54%     │││  0x00007f198342ee6d: mov    QWORD PTR [rsp+0x70],r11
[info]   2.03%     │││  0x00007f198342ee72: mov    QWORD PTR [rsp],rcx
[info]   1.26%     │││  0x00007f198342ee76: mov    QWORD PTR [rsp+0x8],rbx
[info]   1.51%     │││  0x00007f198342ee7b: mov    QWORD PTR [rsp+0x10],rdi
[info]   0.53%     │││  0x00007f198342ee80: mov    DWORD PTR [rsp+0x28],r9d
[info]   2.19%     │││  0x00007f198342ee85: mov    DWORD PTR [rsp+0x2c],ebp
[info]   1.25%     │││  0x00007f198342ee89: mov    QWORD PTR [rsp+0x30],rdx
[info]   2.22%     │││  0x00007f198342ee8e: mov    DWORD PTR [rsp+0x38],r8d       ;*new {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@4 (line 109)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@2 (line 39)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq$@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.AbstractBuffer::$plus$eq@2 (line 232)
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@21 (line 56)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   1.16%     │││  0x00007f198342ee93: mov    DWORD PTR [rax+0xc],0xf004d730  ;*putfield head {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@2 (line 591)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@2 (line 39)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq$@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.AbstractBuffer::$plus$eq@2 (line 232)
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@21 (line 56)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {oop(&quot;&quot;{0x00000000f004d730})}
[info]   1.96%     │││  0x00007f198342ee9a: mov    DWORD PTR [rax+0x10],0xf005b988  ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x00000000f005b988})}
[info]   1.90%     │││  0x00007f198342eea1: mov    rbp,rax                        ;*synchronization entry
[info]             │││                                                            ; - scala.collection.AbstractSeq::&lt;init&gt;@-1 (line 1154)
[info]             │││                                                            ; - scala.collection.immutable.AbstractSeq::&lt;init&gt;@1 (line 159)
[info]             │││                                                            ; - scala.collection.immutable.List::&lt;init&gt;@1 (line 83)
[info]             │││                                                            ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 592)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@2 (line 39)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq$@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.AbstractBuffer::$plus$eq@2 (line 232)
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@21 (line 56)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.94%     │││  0x00007f198342eea4: mov    rsi,rbp
[info]   0.52%     │││  0x00007f198342eea7: call   0x00007f1973152980             ; ImmutableOopMap{rbp=Oop [112]=Oop [120]=Oop [128]=Oop [0]=Oop [16]=Oop [24]=Oop [48]=Oop [56]=NarrowOop }
[info]             │││                                                            ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.AbstractSeq::&lt;init&gt;@1 (line 1154)
[info]             │││                                                            ; - scala.collection.immutable.AbstractSeq::&lt;init&gt;@1 (line 159)
[info]             │││                                                            ; - scala.collection.immutable.List::&lt;init&gt;@1 (line 83)
[info]             │││                                                            ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 592)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@2 (line 39)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq$@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.AbstractBuffer::$plus$eq@2 (line 232)
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@21 (line 56)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {optimized virtual_call}
[info]   1.67%     │││  0x00007f198342eeac: mov    rcx,rbp
[info]   3.00%     │││  0x00007f198342eeaf: mov    r8,rbp                         ;*putfield first {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::first_$eq@2 (line 47)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@26 (line 110)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@2 (line 39)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.Growable::$plus$eq$@2 (line 38)
[info]             │││                                                            ; - scala.collection.mutable.AbstractBuffer::$plus$eq@2 (line 232)
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@21 (line 56)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.12%     │││  0x00007f198342eeb2: mov    ebp,DWORD PTR [rsp+0x2c]
[info]   2.29%     │││  0x00007f198342eeb6: test   ebp,ebp
[info]             │╰│  0x00007f198342eeb8: jne    0x00007f198342edd0             ;*if_icmpne {reexecute=0 rethrow=0 return_oop=0}
[info]             │ │                                                            ; - scala.collection.mutable.ListBuffer::addOne@21 (line 110)
[info]             │ │                                                            ; - scala.collection.mutable.ListBuffer::addOne@2 (line 39)
[info]             │ │                                                            ; - scala.collection.mutable.Growable::$plus$eq@2 (line 38)
[info]             │ │                                                            ; - scala.collection.mutable.Growable::$plus$eq$@2 (line 38)
[info]             │ │                                                            ; - scala.collection.mutable.AbstractBuffer::$plus$eq@2 (line 232)
[info]             │ │                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEq@21 (line 56)
[info]             │ │                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.17%     │ │  0x00007f198342eebe: mov    rdx,rcx
[info]   0.10%     │ ╰  0x00007f198342eec1: jmp    0x00007f198342edf4
[info]             ↘    0x00007f198342eec6: mov    DWORD PTR [rsp+0x38],r8d
[info]                  0x00007f198342eecb: mov    QWORD PTR [rsp+0x30],rdx
[info]                  0x00007f198342eed0: mov    DWORD PTR [rsp+0x2c],ebp
[info]                  0x00007f198342eed4: mov    DWORD PTR [rsp+0x28],r9d
[info]                  0x00007f198342eed9: mov    QWORD PTR [rsp+0x10],rdi
[info]                  0x00007f198342eede: mov    QWORD PTR [rsp+0x8],rbx
[info]                  0x00007f198342eee3: mov    QWORD PTR [rsp],rcx
[info]                  0x00007f198342eee7: mov    QWORD PTR [rsp+0x70],r11       ;*invokespecial ensureUnaliased {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - scala.collection.mutable.ListBuffer::addOne@1 (line 108)
[info]                                                                            ; - scala.collection.mutable.ListBuffer::addOne@2 (line 39)
[info] ....................................................................................................
[info]  75.77%  <total for region 1>
[info] ....[Hottest Region 2]..............................................................................
[info] c2, level 4, scala.collection.AbstractIterable::&lt;init&gt;, version 586 (27 bytes)
[info]            0x00007f198342ad24: shl    r10,0x3
[info]            0x00007f198342ad28: movabs r12,0x800000000
[info]            0x00007f198342ad32: add    r10,r12
[info]            0x00007f198342ad35: xor    r12,r12
[info]            0x00007f198342ad38: cmp    rax,r10
[info]            0x00007f198342ad3b: jne    0x00007f1973152700             ;   {runtime_call ic_miss_stub}
[info]            0x00007f198342ad41: data16 xchg ax,ax
[info]            0x00007f198342ad44: nop    DWORD PTR [rax+rax*1+0x0]
[info]            0x00007f198342ad4c: data16 data16 xchg ax,ax
[info]          [Verified Entry Point]
[info]   3.54%    0x00007f198342ad50: sub    rsp,0x18
[info]   1.40%    0x00007f198342ad57: mov    QWORD PTR [rsp+0x10],rbp       ;*synchronization entry
[info]                                                                      ; - scala.collection.AbstractIterable::&lt;init&gt;@-1 (line 904)
[info]   3.02%    0x00007f198342ad5c: add    rsp,0x10
[info]   0.82%    0x00007f198342ad60: pop    rbp
[info]   9.70%    0x00007f198342ad61: mov    r10,QWORD PTR [r15+0x108]
[info]   0.40%    0x00007f198342ad68: test   DWORD PTR [r10],eax            ;   {poll_return}
[info]   1.50%    0x00007f198342ad6b: ret
[info]            0x00007f198342ad6c: hlt
[info]            0x00007f198342ad6d: hlt
[info]            0x00007f198342ad6e: hlt
[info]            0x00007f198342ad6f: hlt
[info]            0x00007f198342ad70: hlt
[info]            0x00007f198342ad71: hlt
[info]            0x00007f198342ad72: hlt
[info]            0x00007f198342ad73: hlt
[info]            0x00007f198342ad74: hlt
[info]            0x00007f198342ad75: hlt
[info] ....................................................................................................
[info]  20.38%  <total for region 2>
[info] ....[Hottest Regions]...............................................................................
[info]  75.77%         c2, level 4  bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub, version 610 (360 bytes)
[info]  20.38%         c2, level 4  scala.collection.AbstractIterable::&lt;init&gt;, version 586 (27 bytes)
[info]   2.69%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 581 (75 bytes)
[info]   0.20%   [kernel.kallsyms]  native_write_msr+0x6 (5 bytes)
[info]   0.19%           libjvm.so  SpinPause+0x2 (0 bytes)
[info]   0.13%   [kernel.kallsyms]  __intel_pmu_enable_all+0x7b (1 bytes)
[info]   0.04%   [kernel.kallsyms]  __perf_event_task_sched_in+0x85 (0 bytes)
[info]   0.04%           libjvm.so  ElfSymbolTable::lookup+0xf0 (36 bytes)
[info]   0.03%   [kernel.kallsyms]  __intel_pmu_enable_all+0x47 (0 bytes)
[info]   0.03%         interpreter  method entry point (kind = zerolocals)  (8 bytes)
[info]   0.02%   [kernel.kallsyms]  mutex_unlock+0x10 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  _raw_spin_lock+0x10 (0 bytes)
[info]   0.02%           libjvm.so  defaultStream::write+0x52 (26 bytes)
[info]   0.02%        libc-2.19.so  _IO_default_xsputn+0x54 (19 bytes)
[info]   0.02%        libc-2.19.so  syscall+0x19 (0 bytes)
[info]   0.01%   [kernel.kallsyms]  __task_pid_nr_ns+0x6e (0 bytes)
[info]   0.01%   [kernel.kallsyms]  finish_task_switch+0x69 (0 bytes)
[info]   0.01%   [kernel.kallsyms]  put_prev_entity+0x9d (0 bytes)
[info]   0.01%   [kernel.kallsyms]  cpuacct_charge+0x2c (0 bytes)
[info]   0.01%   [kernel.kallsyms]  generic_perform_write+0x11 (0 bytes)
[info]   0.35%  <...other 35 warm regions...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Hottest Methods (after inlining)]..............................................................
[info]  75.77%         c2, level 4  bench.generated.ListsBenchmark_scalaListBufferPlusEq_jmhTest::scalaListBufferPlusEq_thrpt_jmhStub, version 610
[info]  20.38%         c2, level 4  scala.collection.AbstractIterable::&lt;init&gt;, version 586
[info]   2.69%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 581
[info]   0.20%   [kernel.kallsyms]  native_write_msr+0x6
[info]   0.19%           libjvm.so  SpinPause+0x2
[info]   0.13%   [kernel.kallsyms]  __intel_pmu_enable_all+0x7b
[info]   0.04%   [kernel.kallsyms]  __perf_event_task_sched_in+0x85
[info]   0.04%           libjvm.so  ElfSymbolTable::lookup+0xf0
[info]   0.04%        libc-2.19.so  _IO_default_xsputn+0x54
[info]   0.03%   [kernel.kallsyms]  __intel_pmu_enable_all+0x47
[info]   0.03%         interpreter  method entry point (kind = zerolocals)
[info]   0.02%   [kernel.kallsyms]  _raw_spin_lock+0x10
[info]   0.02%   [kernel.kallsyms]  mutex_unlock+0x10
[info]   0.02%           libjvm.so  defaultStream::write+0x52
[info]   0.02%        libc-2.19.so  syscall+0x19
[info]   0.02%        libc-2.19.so  [unknown]
[info]   0.01%       perf-8812.map  [unknown]
[info]   0.01%           libjvm.so  event_to_env+0x11f
[info]   0.01%           libjvm.so  nmethod::print_code_comment_on+0x55d
[info]   0.01%   [kernel.kallsyms]  put_prev_entity+0x9d
[info]   0.32%  <...other 32 warm methods...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Distribution by Source]........................................................................
[info]  98.84%         c2, level 4
[info]   0.57%   [kernel.kallsyms]
[info]   0.42%           libjvm.so
[info]   0.11%        libc-2.19.so
[info]   0.03%         interpreter
[info]   0.01%
[info]   0.01%              [ext4]
[info]   0.01%       perf-8812.map
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.2, OpenJDK 64-Bit Server VM, 12.0.2+10
[info] # VM invoker: /usr/lib/jvm/jdk-12.0.2/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.scalaListBufferPlusEqAddOne
[info] # Parameters: (size = 10)
[info] # Run progress: 50.00% complete, ETA 00:01:06
[info] # Fork: 1 of 1
[info] # Preparing profilers: LinuxPerfAsmProfiler
[info] # Profilers consume stdout and stderr from target VM, use -v EXTRA to copy to console
[info] # Warmup Iteration   1: 14071473.653 ops/s
[info] # Warmup Iteration   2: 22764744.655 ops/s
[info] # Warmup Iteration   3: 23891083.770 ops/s
[info] # Warmup Iteration   4: 32389657.118 ops/s
[info] # Warmup Iteration   5: 32379860.523 ops/s
[info] # Warmup Iteration   6: 31629176.201 ops/s
[info] # Warmup Iteration   7: 32367264.209 ops/s
[info] # Warmup Iteration   8: 32421715.451 ops/s
[info] # Warmup Iteration   9: 32318364.703 ops/s
[info] # Warmup Iteration  10: 31311877.992 ops/s
[info] Iteration   1: 32365754.435 ops/s
[info] Iteration   2: 32386160.799 ops/s
[info] Iteration   3: 32224645.250 ops/s
[info] Iteration   4: 32330535.365 ops/s
[info] Iteration   5: 32361813.755 ops/s
[info] Iteration   6: 32315498.746 ops/s
[info] Iteration   7: 32532427.083 ops/s
[info] Iteration   8: 32438195.110 ops/s
[info] Iteration   9: 32298287.507 ops/s
[info] Iteration  10: 32399128.077 ops/s
[info] # Processing profiler results: LinuxPerfAsmProfiler
[info] Result "bench.ListsBenchmark.scalaListBufferPlusEqAddOne":
[info]   32365244.613 ±(99.9%) 126290.298 ops/s [Average]
[info]   (min, avg, max) = (32224645.250, 32365244.613, 32532427.083), stdev = 83533.212
[info]   CI (99.9%): [32238954.315, 32491534.910] (assumes normal distribution)
[info] Secondary result "bench.ListsBenchmark.scalaListBufferPlusEqAddOne:·asm":
[info] PrintAssembly processed: 157720 total address lines.
[info] Perf output processed (skipped 11.322 seconds):
[info]  Column 1: cycles (10120 events)
[info] Hottest code regions (>10.00% "cycles" events):
[info] ....[Hottest Region 1]..............................................................................
[info] c2, level 4, bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub, version 600 (281 bytes)
[info]                                                                            ;   {optimized virtual_call}
[info]                  0x00007f7c0fe827d8: mov    rbx,rbp
[info]                  0x00007f7c0fe827db: movzx  r10d,BYTE PTR [rbx+0x94]       ;*getfield isDone {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@30 (line 121)
[info]                                                                            ; implicit exception: dispatches to 0x00007f7c0fe82ad2
[info]                  0x00007f7c0fe827e3: test   r10d,r10d
[info]                  0x00007f7c0fe827e6: jne    0x00007f7c0fe82971             ;*ifeq {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@33 (line 121)
[info]                  0x00007f7c0fe827ec: mov    ebp,0x1
[info]          ╭       0x00007f7c0fe827f1: jmp    0x00007f7c0fe82838
[info]   0.69%  │ ↗     0x00007f7c0fe827f3: cmp    ecx,0xffffffff
[info]          │ │     0x00007f7c0fe827f6: je     0x00007f7c0fe829ad             ;*if_icmpne {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::isEmpty@5 (line 64)
[info]          │ │                                                               ; - scala.collection.IterableOnceOps::nonEmpty@1 (line 819)
[info]          │ │                                                               ; - scala.collection.IterableOnceOps::nonEmpty$@1 (line 819)
[info]          │ │                                                               ; - scala.collection.AbstractIterable::nonEmpty@1 (line 904)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::toList@2 (line 77)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]          │ │                                                               ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.20%  │ │     0x00007f7c0fe827fc: mov    QWORD PTR [rsp+0x70],rbx
[info]   0.13%  │ │     0x00007f7c0fe82801: mov    QWORD PTR [rsp+0x80],r8        ;*invokevirtual storeFence {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - java.lang.invoke.VarHandle::releaseFence@3 (line 2099)
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]          │ │                                                               ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::toList@8 (line 81)
[info]          │ │                                                               ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]          │ │                                                               ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.21%  │ │     0x00007f7c0fe82809: mov    rsi,QWORD PTR [rsp+0x8]
[info]   0.53%  │ │     0x00007f7c0fe8280e: nop
[info]   0.20%  │ │     0x00007f7c0fe8280f: call   0x00007f7bffba6980             ; ImmutableOopMap{[112]=Oop [120]=Oop [128]=Oop [8]=Oop [24]=Oop }
[info]          │ │                                                               ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@20 (line 119)
[info]          │ │                                                               ;   {optimized virtual_call}
[info]   3.11%  │ │     0x00007f7c0fe82814: mov    rbx,QWORD PTR [rsp+0x70]
[info]   0.15%  │ │     0x00007f7c0fe82819: movzx  r11d,BYTE PTR [rbx+0x94]       ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@28 (line 46)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.28%  │ │     0x00007f7c0fe82821: mov    r10,QWORD PTR [r15+0x108]
[info]   0.76%  │ │     0x00007f7c0fe82828: add    rbp,0x1                        ; ImmutableOopMap{rbx=Oop [120]=Oop [128]=Oop [8]=Oop [24]=Oop }
[info]          │ │                                                               ;*ifeq {reexecute=1 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@33 (line 121)
[info]   0.03%  │ │     0x00007f7c0fe8282c: test   DWORD PTR [r10],eax            ;   {poll}
[info]   0.10%  │ │     0x00007f7c0fe8282f: test   r11d,r11d
[info]          │ │     0x00007f7c0fe82832: jne    0x00007f7c0fe82976             ;*aload_1 {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@36 (line 122)
[info]   0.22%  ↘ │     0x00007f7c0fe82838: mov    r8,QWORD PTR [rsp+0x80]
[info]   0.48%    │     0x00007f7c0fe82840: mov    r10d,DWORD PTR [r8+0xc]
[info]   0.02%    │     0x00007f7c0fe82844: test   r10d,r10d
[info]            │     0x00007f7c0fe82847: jle    0x00007f7c0fe829a8             ;*if_icmpge {reexecute=0 rethrow=0 return_oop=0}
[info]            │                                                               ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@15 (line 44)
[info]            │                                                               ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.08%    │     0x00007f7c0fe8284d: movabs rdx,0x80094748                 ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x0000000080094748})}
[info]   0.24%    │     0x00007f7c0fe82857: xor    edi,edi
[info]   0.66%    │     0x00007f7c0fe82859: mov    r9d,0x80094748                 ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x0000000080094748})}
[info]   0.10%    │     0x00007f7c0fe8285f: xor    r11d,r11d
[info]   0.15%    │     0x00007f7c0fe82862: xor    ecx,ecx
[info]   0.18%   ╭│     0x00007f7c0fe82864: jmp    0x00007f7c0fe828b2
[info]           ││     0x00007f7c0fe82866: data16 nop WORD PTR [rax+rax*1+0x0]
[info]   3.10%   ││ ↗   0x00007f7c0fe82870: mov    DWORD PTR [rdi+0x10],r10d      ;*putfield next {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - scala.collection.immutable.$colon$colon::next_$eq@2 (line 591)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::addOne@37 (line 110)
[info]           ││ │                                                             ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]           ││ │                                                             ; implicit exception: dispatches to 0x00007f7c0fe82aa6
[info]   2.63%   ││ │   0x00007f7c0fe82874: mov    r10,rdi
[info]   1.12%   ││ │   0x00007f7c0fe82877: mov    rdx,r9                         ;*getfield first {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::first@1 (line 47)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::toList@12 (line 82)
[info]           ││ │                                                             ; - scala.collection.mutable.ListBuffer::result@1 (line 85)
[info]           ││ │                                                             ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@32 (line 48)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.62%   ││ │   0x00007f7c0fe8287a: shr    r10,0x9
[info]   3.03%   ││ │   0x00007f7c0fe8287e: movabs rdi,0x7f7c2c47a000
[info]   2.53%   ││ │   0x00007f7c0fe82888: mov    BYTE PTR [rdi+r10*1],0x0       ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@28 (line 46)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.57%   ││ │↗  0x00007f7c0fe8288d: mov    rsi,QWORD PTR [r15+0x108]
[info]   1.93%   ││ ││  0x00007f7c0fe82894: mov    r10d,ecx
[info]   3.31%   ││ ││  0x00007f7c0fe82897: inc    r10d                           ;*iadd {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - scala.collection.mutable.ListBuffer::addOne@51 (line 112)
[info]           ││ ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   3.59%   ││ ││  0x00007f7c0fe8289a: mov    edi,DWORD PTR [r8+0xc]         ;*getfield size {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@12 (line 44)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.47%   ││ ││  0x00007f7c0fe8289e: inc    r11d                           ; ImmutableOopMap{r8=Oop r9=NarrowOop rbx=Oop rdx=Oop rax=Oop [120]=Oop [8]=Oop [24]=Oop }
[info]           ││ ││                                                            ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@28 (line 46)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.55%   ││ ││  0x00007f7c0fe828a1: test   DWORD PTR [rsi],eax            ;   {poll}
[info]   3.92%   ││ ││  0x00007f7c0fe828a3: cmp    r11d,edi
[info]           │╰ ││  0x00007f7c0fe828a6: jge    0x00007f7c0fe827f3
[info]   2.91%   │  ││  0x00007f7c0fe828ac: mov    rdi,rax
[info]   1.33%   │  ││  0x00007f7c0fe828af: mov    ecx,r10d
[info]   2.16%   ↘  ││  0x00007f7c0fe828b2: mov    rax,QWORD PTR [r15+0x118]
[info]   3.34%      ││  0x00007f7c0fe828b9: mov    r10,rax
[info]   2.82%      ││  0x00007f7c0fe828bc: add    r10,0x18
[info]   1.78%      ││  0x00007f7c0fe828c0: cmp    r10,QWORD PTR [r15+0x128]
[info]             ╭││  0x00007f7c0fe828c7: jae    0x00007f7c0fe82911             ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@28 (line 46)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   2.28%     │││  0x00007f7c0fe828c9: mov    QWORD PTR [r15+0x118],r10
[info]   3.42%     │││  0x00007f7c0fe828d0: prefetchw BYTE PTR [r10+0xc0]
[info]   4.40%     │││  0x00007f7c0fe828d8: mov    QWORD PTR [rax],0x1
[info]   6.42%     │││  0x00007f7c0fe828df: mov    DWORD PTR [rax+0x8],0x237008   ;   {metadata(&apos;scala/collection/immutable/$colon$colon&apos;)}
[info]   5.48%     │││  0x00007f7c0fe828e6: mov    DWORD PTR [rax+0x14],0x0       ;*new {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@4 (line 109)
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   3.29%     │││  0x00007f7c0fe828ed: mov    DWORD PTR [rax+0xc],0x80046340  ;*putfield head {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.immutable.$colon$colon::&lt;init&gt;@2 (line 591)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@12 (line 109)
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {oop(&quot;&quot;{0x0000000080046340})}
[info]   4.58%     │││  0x00007f7c0fe828f4: mov    DWORD PTR [rax+0x10],0x80094748  ;*synchronization entry
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@-1 (line 108)
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {oop(a &apos;scala/collection/immutable/Nil$&apos;{0x0000000080094748})}
[info]   3.45%     │││  0x00007f7c0fe828fb: mov    r10,rax                        ;*putfield first {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::first_$eq@2 (line 47)
[info]             │││                                                            ; - scala.collection.mutable.ListBuffer::addOne@26 (line 110)
[info]             │││                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.75%     │││  0x00007f7c0fe828fe: test   ecx,ecx
[info]   1.90%     │╰│  0x00007f7c0fe82900: jne    0x00007f7c0fe82870             ;*if_icmpne {reexecute=0 rethrow=0 return_oop=0}
[info]             │ │                                                            ; - scala.collection.mutable.ListBuffer::addOne@21 (line 110)
[info]             │ │                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]             │ │                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.08%     │ │  0x00007f7c0fe82906: mov    rdx,rax
[info]   0.26%     │ │  0x00007f7c0fe82909: mov    r9d,r10d
[info]   0.62%     │ ╰  0x00007f7c0fe8290c: jmp    0x00007f7c0fe8288d
[info]             ↘    0x00007f7c0fe82911: mov    DWORD PTR [rsp+0x30],ecx
[info]                  0x00007f7c0fe82915: mov    DWORD PTR [rsp+0x2c],r11d
[info]                  0x00007f7c0fe8291a: mov    DWORD PTR [rsp+0x28],r9d
[info]                  0x00007f7c0fe8291f: mov    QWORD PTR [rsp+0x10],rdi
[info]                  0x00007f7c0fe82924: mov    QWORD PTR [rsp],rbp
[info]                  0x00007f7c0fe82928: mov    QWORD PTR [rsp+0x80],rbx
[info]                  0x00007f7c0fe82930: mov    QWORD PTR [rsp+0x70],r8        ;*invokespecial ensureUnaliased {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - scala.collection.mutable.ListBuffer::addOne@1 (line 108)
[info]                                                                            ; - bench.ListsBenchmark::scalaListBufferPlusEqAddOne@21 (line 45)
[info]                                                                            ; - bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub@17 (line 119)
[info] ....................................................................................................
[info]  92.15%  <total for region 1>
[info] ....[Hottest Regions]...............................................................................
[info]  92.15%         c2, level 4  bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub, version 600 (281 bytes)
[info]   5.08%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 570 (75 bytes)
[info]   0.49%   [kernel.kallsyms]  native_write_msr+0x6 (5 bytes)
[info]   0.44%           libjvm.so  SpinPause+0x2 (7 bytes)
[info]   0.14%   [kernel.kallsyms]  __intel_pmu_enable_all+0x47 (0 bytes)
[info]   0.07%   [kernel.kallsyms]  __intel_pmu_enable_all+0x7b (1 bytes)
[info]   0.06%   [kernel.kallsyms]  __perf_event_task_sched_in+0x77 (5 bytes)
[info]   0.05%  libpthread-2.19.so  [unknown] (4 bytes)
[info]   0.04%   [kernel.kallsyms]  finish_task_switch+0x8d (5 bytes)
[info]   0.04%           libjvm.so  ElfSymbolTable::lookup+0xf0 (18 bytes)
[info]   0.03%   [kernel.kallsyms]  futex_wait_queue_me+0xd3 (0 bytes)
[info]   0.03%   [kernel.kallsyms]  mutex_lock+0x11 (0 bytes)
[info]   0.03%        libc-2.19.so  strchrnul+0x27 (31 bytes)
[info]   0.02%   [kernel.kallsyms]  update_curr+0x13 (17 bytes)
[info]   0.02%   [kernel.kallsyms]  cpuacct_charge+0x38 (12 bytes)
[info]   0.02%   [kernel.kallsyms]  sys_write+0x7 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  __sb_start_write+0x24 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  __irqentry_text_start+0x0 (0 bytes)
[info]   0.02%         interpreter  getstatic  178 getstatic  (0 bytes)
[info]   0.02%           libjvm.so  Monitor::unlock+0x10 (24 bytes)
[info]   1.20%  <...other 115 warm regions...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Hottest Methods (after inlining)]..............................................................
[info]  92.15%         c2, level 4  bench.generated.ListsBenchmark_scalaListBufferPlusEqAddOne_jmhTest::scalaListBufferPlusEqAddOne_thrpt_jmhStub, version 600
[info]   5.08%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 570
[info]   0.49%   [kernel.kallsyms]  native_write_msr+0x6
[info]   0.44%           libjvm.so  SpinPause+0x2
[info]   0.14%   [kernel.kallsyms]  __intel_pmu_enable_all+0x47
[info]   0.07%   [kernel.kallsyms]  __intel_pmu_enable_all+0x7b
[info]   0.06%   [kernel.kallsyms]  __perf_event_task_sched_in+0x77
[info]   0.05%  libpthread-2.19.so  [unknown]
[info]   0.04%   [kernel.kallsyms]  finish_task_switch+0x8d
[info]   0.04%           libjvm.so  ElfSymbolTable::lookup+0xf0
[info]   0.03%        libc-2.19.so  [unknown]
[info]   0.03%        libc-2.19.so  strchrnul+0x27
[info]   0.03%   [kernel.kallsyms]  mutex_lock+0x11
[info]   0.03%   [kernel.kallsyms]  futex_wait_queue_me+0xd3
[info]   0.02%         interpreter  getstatic  178 getstatic
[info]   0.02%           libjvm.so  xmlTextStream::write+0x24
[info]   0.02%   [kernel.kallsyms]  __sb_start_write+0x24
[info]   0.02%           libjvm.so  Monitor::unlock+0x10
[info]   0.02%           libjvm.so  defaultStream::write+0x52
[info]   0.02%   [kernel.kallsyms]  sys_write+0x7
[info]   1.19%  <...other 113 warm methods...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Distribution by Source]........................................................................
[info]  97.23%         c2, level 4
[info]   1.38%   [kernel.kallsyms]
[info]   0.96%           libjvm.so
[info]   0.13%        libc-2.19.so
[info]   0.08%  libpthread-2.19.so
[info]   0.06%         interpreter
[info]   0.05%      hsdis-amd64.so
[info]   0.03%              [ext4]
[info]   0.03%          ld-2.19.so
[info]   0.01%         c1, level 3
[info]   0.01%              [jbd2]
[info]   0.01%               [kvm]
[info]   0.01%    Unknown, level 0
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.2, OpenJDK 64-Bit Server VM, 12.0.2+10
[info] # VM invoker: /usr/lib/jvm/jdk-12.0.2/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.skalaAddOne
[info] # Parameters: (size = 10)
[info] # Run progress: 66.67% complete, ETA 00:00:44
[info] # Fork: 1 of 1
[info] # Preparing profilers: LinuxPerfAsmProfiler
[info] # Profilers consume stdout and stderr from target VM, use -v EXTRA to copy to console
[info] # Warmup Iteration   1: 16676353.236 ops/s
[info] # Warmup Iteration   2: 22993916.812 ops/s
[info] # Warmup Iteration   3: 24297157.604 ops/s
[info] # Warmup Iteration   4: 32380511.231 ops/s
[info] # Warmup Iteration   5: 32385300.199 ops/s
[info] # Warmup Iteration   6: 32384550.804 ops/s
[info] # Warmup Iteration   7: 32359390.038 ops/s
[info] # Warmup Iteration   8: 32376703.629 ops/s
[info] # Warmup Iteration   9: 32544675.024 ops/s
[info] # Warmup Iteration  10: 32495734.938 ops/s
[info] Iteration   1: 32329835.995 ops/s
[info] Iteration   2: 32386440.658 ops/s
[info] Iteration   3: 32402367.517 ops/s
[info] Iteration   4: 32399038.542 ops/s
[info] Iteration   5: 32258599.768 ops/s
[info] Iteration   6: 32400830.345 ops/s
[info] Iteration   7: 32383080.964 ops/s
[info] Iteration   8: 32386302.460 ops/s
[info] Iteration   9: 32334107.391 ops/s
[info] Iteration  10: 32388109.853 ops/s
[info] # Processing profiler results: LinuxPerfAsmProfiler
[info] Result "bench.ListsBenchmark.skalaAddOne":
[info]   32366871.349 ±(99.9%) 69629.561 ops/s [Average]
[info]   (min, avg, max) = (32258599.768, 32366871.349, 32402367.517), stdev = 46055.644
[info]   CI (99.9%): [32297241.788, 32436500.911] (assumes normal distribution)
[info] Secondary result "bench.ListsBenchmark.skalaAddOne:·asm":
[info] PrintAssembly processed: 147682 total address lines.
[info] Perf output processed (skipped 11.428 seconds):
[info]  Column 1: cycles (10096 events)
[info] Hottest code regions (>10.00% "cycles" events):
[info] ....[Hottest Region 1]..............................................................................
[info] c2, level 4, bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub, version 583 (281 bytes)
[info]                                                                            ;   {optimized virtual_call}
[info]                  0x00007fc90be7ee58: mov    rbx,rbp
[info]                  0x00007fc90be7ee5b: movzx  r10d,BYTE PTR [rbx+0x94]       ;*getfield isDone {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@30 (line 121)
[info]                                                                            ; implicit exception: dispatches to 0x00007fc90be7f152
[info]                  0x00007fc90be7ee63: test   r10d,r10d
[info]                  0x00007fc90be7ee66: jne    0x00007fc90be7eff1             ;*ifeq {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@33 (line 121)
[info]                  0x00007fc90be7ee6c: mov    ebp,0x1
[info]          ╭       0x00007fc90be7ee71: jmp    0x00007fc90be7eeb8
[info]   0.72%  │ ↗     0x00007fc90be7ee73: cmp    ecx,0xffffffff
[info]          │ │     0x00007fc90be7ee76: je     0x00007fc90be7f02d             ;*ifeq {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - skala.collection.mutable.ListBuffer::toList@5 (line 52)
[info]          │ │                                                               ; - skala.collection.mutable.ListBuffer::result@1 (line 62)
[info]          │ │                                                               ; - bench.ListsBenchmark::skalaAddOne@32 (line 70)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.17%  │ │     0x00007fc90be7ee7c: mov    QWORD PTR [rsp+0x70],rbx
[info]   0.11%  │ │     0x00007fc90be7ee81: mov    QWORD PTR [rsp+0x80],r8        ;*invokevirtual storeFence {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - java.lang.invoke.VarHandle::releaseFence@3 (line 2099)
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]          │ │                                                               ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]          │ │                                                               ; - skala.collection.mutable.ListBuffer::toList@16 (line 54)
[info]          │ │                                                               ; - skala.collection.mutable.ListBuffer::result@1 (line 62)
[info]          │ │                                                               ; - bench.ListsBenchmark::skalaAddOne@32 (line 70)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.26%  │ │     0x00007fc90be7ee89: mov    rsi,QWORD PTR [rsp+0x8]
[info]   0.62%  │ │     0x00007fc90be7ee8e: nop
[info]   0.20%  │ │     0x00007fc90be7ee8f: call   0x00007fc8fbba6980             ; ImmutableOopMap{[112]=Oop [120]=Oop [128]=Oop [8]=Oop [24]=Oop }
[info]          │ │                                                               ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@20 (line 119)
[info]          │ │                                                               ;   {optimized virtual_call}
[info]   3.42%  │ │     0x00007fc90be7ee94: mov    rbx,QWORD PTR [rsp+0x70]
[info]   0.07%  │ │     0x00007fc90be7ee99: movzx  r11d,BYTE PTR [rbx+0x94]       ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.ListsBenchmark::skalaAddOne@28 (line 68)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.28%  │ │     0x00007fc90be7eea1: mov    r10,QWORD PTR [r15+0x108]
[info]   0.82%  │ │     0x00007fc90be7eea8: add    rbp,0x1                        ; ImmutableOopMap{rbx=Oop [120]=Oop [128]=Oop [8]=Oop [24]=Oop }
[info]          │ │                                                               ;*ifeq {reexecute=1 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@33 (line 121)
[info]   0.04%  │ │     0x00007fc90be7eeac: test   DWORD PTR [r10],eax            ;   {poll}
[info]   0.08%  │ │     0x00007fc90be7eeaf: test   r11d,r11d
[info]          │ │     0x00007fc90be7eeb2: jne    0x00007fc90be7eff6             ;*aload_1 {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@36 (line 122)
[info]   0.28%  ↘ │     0x00007fc90be7eeb8: mov    r8,QWORD PTR [rsp+0x80]
[info]   0.65%    │     0x00007fc90be7eec0: mov    r10d,DWORD PTR [r8+0xc]
[info]   0.05%    │     0x00007fc90be7eec4: test   r10d,r10d
[info]            │     0x00007fc90be7eec7: jle    0x00007fc90be7f028             ;*if_icmpge {reexecute=0 rethrow=0 return_oop=0}
[info]            │                                                               ; - bench.ListsBenchmark::skalaAddOne@15 (line 66)
[info]            │                                                               ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.11%    │     0x00007fc90be7eecd: movabs rdx,0x80108b10                 ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x0000000080108b10})}
[info]   0.25%    │     0x00007fc90be7eed7: xor    edi,edi
[info]   0.59%    │     0x00007fc90be7eed9: mov    r9d,0x80108b10                 ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x0000000080108b10})}
[info]   0.03%    │     0x00007fc90be7eedf: xor    r11d,r11d
[info]   0.07%    │     0x00007fc90be7eee2: xor    ecx,ecx
[info]   0.19%   ╭│     0x00007fc90be7eee4: jmp    0x00007fc90be7ef32
[info]           ││     0x00007fc90be7eee6: data16 nop WORD PTR [rax+rax*1+0x0]
[info]   3.16%   ││ ↗   0x00007fc90be7eef0: mov    DWORD PTR [rdi+0x10],r10d      ;*putfield next {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - skala.collection.immutable.$colon$colon::next_$eq@2 (line 23)
[info]           ││ │                                                             ; - skala.collection.mutable.ListBuffer::addOne@36 (line 72)
[info]           ││ │                                                             ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]           ││ │                                                             ; implicit exception: dispatches to 0x00007fc90be7f126
[info]   2.66%   ││ │   0x00007fc90be7eef4: mov    r10,rdi
[info]   1.25%   ││ │   0x00007fc90be7eef7: mov    rdx,r9                         ;*getfield first {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - skala.collection.mutable.ListBuffer::first@1 (line 18)
[info]           ││ │                                                             ; - skala.collection.mutable.ListBuffer::toList@28 (line 58)
[info]           ││ │                                                             ; - skala.collection.mutable.ListBuffer::result@1 (line 62)
[info]           ││ │                                                             ; - bench.ListsBenchmark::skalaAddOne@32 (line 70)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.64%   ││ │   0x00007fc90be7eefa: shr    r10,0x9
[info]   2.95%   ││ │   0x00007fc90be7eefe: movabs rdi,0x7fc92862f000
[info]   2.61%   ││ │   0x00007fc90be7ef08: mov    BYTE PTR [rdi+r10*1],0x0       ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - bench.ListsBenchmark::skalaAddOne@28 (line 68)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.51%   ││ │↗  0x00007fc90be7ef0d: mov    rsi,QWORD PTR [r15+0x108]
[info]   2.13%   ││ ││  0x00007fc90be7ef14: mov    r10d,ecx
[info]   2.97%   ││ ││  0x00007fc90be7ef17: inc    r10d                           ;*iadd {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - skala.collection.mutable.ListBuffer::addOne@50 (line 75)
[info]           ││ ││                                                            ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   2.90%   ││ ││  0x00007fc90be7ef1a: mov    edi,DWORD PTR [r8+0xc]         ;*getfield size {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::skalaAddOne@12 (line 66)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.29%   ││ ││  0x00007fc90be7ef1e: inc    r11d                           ; ImmutableOopMap{r8=Oop r9=NarrowOop rbx=Oop rdx=Oop rax=Oop [120]=Oop [8]=Oop [24]=Oop }
[info]           ││ ││                                                            ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::skalaAddOne@28 (line 68)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.86%   ││ ││  0x00007fc90be7ef21: test   DWORD PTR [rsi],eax            ;   {poll}
[info]   4.12%   ││ ││  0x00007fc90be7ef23: cmp    r11d,edi
[info]           │╰ ││  0x00007fc90be7ef26: jge    0x00007fc90be7ee73
[info]   2.37%   │  ││  0x00007fc90be7ef2c: mov    rdi,rax
[info]   1.13%   │  ││  0x00007fc90be7ef2f: mov    ecx,r10d
[info]   2.09%   ↘  ││  0x00007fc90be7ef32: mov    rax,QWORD PTR [r15+0x118]
[info]   3.50%      ││  0x00007fc90be7ef39: mov    r10,rax
[info]   2.89%      ││  0x00007fc90be7ef3c: add    r10,0x18
[info]   1.76%      ││  0x00007fc90be7ef40: cmp    r10,QWORD PTR [r15+0x128]
[info]             ╭││  0x00007fc90be7ef47: jae    0x00007fc90be7ef91             ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - bench.ListsBenchmark::skalaAddOne@28 (line 68)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   2.30%     │││  0x00007fc90be7ef49: mov    QWORD PTR [r15+0x118],r10
[info]   3.36%     │││  0x00007fc90be7ef50: prefetchw BYTE PTR [r10+0xc0]
[info]   4.73%     │││  0x00007fc90be7ef58: mov    QWORD PTR [rax],0x1
[info]   6.42%     │││  0x00007fc90be7ef5f: mov    DWORD PTR [rax+0x8],0x233f18   ;   {metadata(&apos;skala/collection/immutable/$colon$colon&apos;)}
[info]   5.87%     │││  0x00007fc90be7ef66: mov    DWORD PTR [rax+0x14],0x0       ;*new {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@4 (line 68)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   3.64%     │││  0x00007fc90be7ef6d: mov    DWORD PTR [rax+0xc],0x800a5078  ;*putfield head {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - skala.collection.immutable.$colon$colon::&lt;init&gt;@6 (line 27)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@12 (line 68)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {oop(&quot;&quot;{0x00000000800a5078})}
[info]   4.73%     │││  0x00007fc90be7ef74: mov    DWORD PTR [rax+0x10],0x80108b10  ;*synchronization entry
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@-1 (line 67)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x0000000080108b10})}
[info]   3.50%     │││  0x00007fc90be7ef7b: mov    r10,rax                        ;*putfield first {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::first_$eq@2 (line 22)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@25 (line 70)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   1.74%     │││  0x00007fc90be7ef7e: test   ecx,ecx
[info]   1.70%     │╰│  0x00007fc90be7ef80: jne    0x00007fc90be7eef0             ;*ifne {reexecute=0 rethrow=0 return_oop=0}
[info]             │ │                                                            ; - skala.collection.mutable.ListBuffer::addOne@20 (line 69)
[info]             │ │                                                            ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]             │ │                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info]   0.06%     │ │  0x00007fc90be7ef86: mov    rdx,rax
[info]   0.18%     │ │  0x00007fc90be7ef89: mov    r9d,r10d
[info]   0.78%     │ ╰  0x00007fc90be7ef8c: jmp    0x00007fc90be7ef0d
[info]             ↘    0x00007fc90be7ef91: mov    DWORD PTR [rsp+0x30],ecx
[info]                  0x00007fc90be7ef95: mov    DWORD PTR [rsp+0x2c],r11d
[info]                  0x00007fc90be7ef9a: mov    DWORD PTR [rsp+0x28],r9d
[info]                  0x00007fc90be7ef9f: mov    QWORD PTR [rsp+0x10],rdi
[info]                  0x00007fc90be7efa4: mov    QWORD PTR [rsp],rbp
[info]                  0x00007fc90be7efa8: mov    QWORD PTR [rsp+0x80],rbx
[info]                  0x00007fc90be7efb0: mov    QWORD PTR [rsp+0x70],r8        ;*invokevirtual ensureUnaliased {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - skala.collection.mutable.ListBuffer::addOne@1 (line 67)
[info]                                                                            ; - bench.ListsBenchmark::skalaAddOne@21 (line 67)
[info]                                                                            ; - bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub@17 (line 119)
[info] ....................................................................................................
[info]  92.82%  <total for region 1>
[info] ....[Hottest Regions]...............................................................................
[info]  92.82%         c2, level 4  bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub, version 583 (281 bytes)
[info]   5.58%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 544 (75 bytes)
[info]   0.42%           libjvm.so  SpinPause+0x2 (7 bytes)
[info]   0.08%   [kernel.kallsyms]  native_write_msr+0x6 (0 bytes)
[info]   0.03%   [kernel.kallsyms]  finish_task_switch+0x5c (30 bytes)
[info]   0.03%   [kernel.kallsyms]  entry_SYSCALL_64+0x0 (12 bytes)
[info]   0.03%           libjvm.so  ElfSymbolTable::lookup+0x108 (30 bytes)
[info]   0.02%   [kernel.kallsyms]  mark_buffer_dirty+0x25 (14 bytes)
[info]   0.02%   [kernel.kallsyms]  mutex_lock+0x11 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  _raw_spin_lock_irqsave+0x22 (0 bytes)
[info]   0.02%      hsdis-amd64.so  print_insn+0x332 (0 bytes)
[info]   0.02%           libjvm.so  Monitor::unlock+0x18 (16 bytes)
[info]   0.02%           libjvm.so  fileStream::write+0x4d (8 bytes)
[info]   0.02%           libjvm.so  stringStream::write+0x8 (21 bytes)
[info]   0.01%   [kernel.kallsyms]  __switch_to+0x3bd (0 bytes)
[info]   0.01%   [kernel.kallsyms]  native_apic_msr_write+0x27 (0 bytes)
[info]   0.01%   [kernel.kallsyms]  try_to_wake_up+0x25 (0 bytes)
[info]   0.01%   [kernel.kallsyms]  try_to_wake_up+0x120 (0 bytes)
[info]   0.01%   [kernel.kallsyms]  update_cfs_shares+0x1e (0 bytes)
[info]   0.01%   [kernel.kallsyms]  put_prev_entity+0xd (0 bytes)
[info]   0.81%  <...other 82 warm regions...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Hottest Methods (after inlining)]..............................................................
[info]  92.82%         c2, level 4  bench.generated.ListsBenchmark_skalaAddOne_jmhTest::skalaAddOne_thrpt_jmhStub, version 583
[info]   5.58%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 544
[info]   0.42%           libjvm.so  SpinPause+0x2
[info]   0.08%   [kernel.kallsyms]  native_write_msr+0x6
[info]   0.03%           libjvm.so  ElfSymbolTable::lookup+0x108
[info]   0.03%   [kernel.kallsyms]  finish_task_switch+0x5c
[info]   0.03%   [kernel.kallsyms]  entry_SYSCALL_64+0x0
[info]   0.02%           libjvm.so  fileStream::write+0x4d
[info]   0.02%           libjvm.so  stringStream::write+0x8
[info]   0.02%           libjvm.so  Monitor::unlock+0x18
[info]   0.02%   [kernel.kallsyms]  _raw_spin_lock_irqsave+0x22
[info]   0.02%   [kernel.kallsyms]  mutex_lock+0x11
[info]   0.02%      hsdis-amd64.so  print_insn+0x332
[info]   0.02%   [kernel.kallsyms]  mark_buffer_dirty+0x25
[info]   0.01%           libjvm.so  VMError::is_error_reported+0x8
[info]   0.01%      hsdis-amd64.so  print_insn_i386+0xb
[info]   0.01%         interpreter  getstatic  178 getstatic
[info]   0.01%   [kernel.kallsyms]  put_prev_entity+0x2de
[info]   0.01%   [kernel.kallsyms]  do_futex+0x4dd
[info]   0.01%   [kernel.kallsyms]  __wake_up+0x24
[info]   0.81%  <...other 82 warm methods...>
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] ....[Distribution by Source]........................................................................
[info]  98.40%         c2, level 4
[info]   0.83%           libjvm.so
[info]   0.55%   [kernel.kallsyms]
[info]   0.06%        libc-2.19.so
[info]   0.04%      hsdis-amd64.so
[info]   0.04%  libpthread-2.19.so
[info]   0.03%         interpreter
[info]   0.01%         c1, level 3
[info]   0.01%              [jbd2]
[info]   0.01%              [ext4]
[info]   0.01%          ld-2.19.so
[info] ....................................................................................................
[info]  99.99%  <totals>
[info] # JMH version: 1.21
[info] # VM version: JDK 12.0.2, OpenJDK 64-Bit Server VM, 12.0.2+10
[info] # VM invoker: /usr/lib/jvm/jdk-12.0.2/bin/java
[info] # VM options: -server -Xms2g -Xmx2g -XX:NewSize=1g -XX:MaxNewSize=1g -XX:InitialCodeCacheSize=512m -XX:ReservedCodeCacheSize=512m -XX:+UseParallelGC -XX:-UseBiasedLocking
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: bench.ListsBenchmark.skalaPlusEq
[info] # Parameters: (size = 10)
[info] # Run progress: 83.33% complete, ETA 00:00:22
[info] # Fork: 1 of 1
[info] # Preparing profilers: LinuxPerfAsmProfiler
[info] # Profilers consume stdout and stderr from target VM, use -v EXTRA to copy to console
[info] # Warmup Iteration   1: 10122496.030 ops/s
[info] # Warmup Iteration   2: 13921394.796 ops/s
[info] # Warmup Iteration   3: 14642539.675 ops/s
[info] # Warmup Iteration   4: 15501461.729 ops/s
[info] # Warmup Iteration   5: 15511020.274 ops/s
[info] # Warmup Iteration   6: 15522540.984 ops/s
[info] # Warmup Iteration   7: 15485719.313 ops/s
[info] # Warmup Iteration   8: 15478781.596 ops/s
[info] # Warmup Iteration   9: 15540872.082 ops/s
[info] # Warmup Iteration  10: 15544873.153 ops/s
[info] Iteration   1: 15458123.243 ops/s
[info] Iteration   2: 15531504.913 ops/s
[info] Iteration   3: 15501176.147 ops/s
[info] Iteration   4: 15529709.731 ops/s
[info] Iteration   5: 15503441.506 ops/s
[info] Iteration   6: 15501190.875 ops/s
[info] Iteration   7: 15524210.700 ops/s
[info] Iteration   8: 15545109.121 ops/s
[info] Iteration   9: 15531550.164 ops/s
[info] Iteration  10: 15545334.538 ops/s
[info] # Processing profiler results: LinuxPerfAsmProfiler
[info] Result "bench.ListsBenchmark.skalaPlusEq":
[info]   15517135.094 ±(99.9%) 40250.140 ops/s [Average]
[info]   (min, avg, max) = (15458123.243, 15517135.094, 15545334.538), stdev = 26622.976
[info]   CI (99.9%): [15476884.954, 15557385.234] (assumes normal distribution)
[info] Secondary result "bench.ListsBenchmark.skalaPlusEq:·asm":
[info] PrintAssembly processed: 149904 total address lines.
[info] Perf output processed (skipped 11.409 seconds):
[info]  Column 1: cycles (10131 events)
[info] Hottest code regions (>10.00% "cycles" events):
[info] ....[Hottest Region 1]..............................................................................
[info] c2, level 4, bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub, version 585 (372 bytes)
[info]                                                                            ;   {optimized virtual_call}
[info]                  0x00007f26bbe804e4: mov    r9,QWORD PTR [rsp+0x70]
[info]                  0x00007f26bbe804e9: movzx  r11d,BYTE PTR [r9+0x94]        ;*getfield isDone {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@30 (line 121)
[info]                                                                            ; implicit exception: dispatches to 0x00007f26bbe80816
[info]                  0x00007f26bbe804f1: test   r11d,r11d
[info]                  0x00007f26bbe804f4: jne    0x00007f26bbe806b5             ;*ifeq {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@33 (line 121)
[info]                  0x00007f26bbe804fa: mov    ebx,0x1
[info]          ╭       0x00007f26bbe804ff: jmp    0x00007f26bbe80544
[info]   0.03%  │ ↗     0x00007f26bbe80501: cmp    ebp,0xffffffff
[info]          │ │     0x00007f26bbe80504: je     0x00007f26bbe806f4             ;*ifeq {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - skala.collection.mutable.ListBuffer::toList@5 (line 52)
[info]          │ │                                                               ; - skala.collection.mutable.ListBuffer::result@1 (line 62)
[info]          │ │                                                               ; - bench.ListsBenchmark::skalaPlusEq@32 (line 81)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.18%  │ │     0x00007f26bbe8050a: mov    rbp,QWORD PTR [rsp+0x70]       ;*invokevirtual storeFence {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - java.lang.invoke.VarHandle::releaseFence@3 (line 2099)
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$DMH/0x00000008011a7c40::invokeStatic@15
[info]          │ │                                                               ; - java.lang.invoke.LambdaForm$MH/0x00000008011a7840::invoke_MT@17
[info]          │ │                                                               ; - scala.runtime.Statics::releaseFence@3 (line 148)
[info]          │ │                                                               ; - skala.collection.mutable.ListBuffer::toList@16 (line 54)
[info]          │ │                                                               ; - skala.collection.mutable.ListBuffer::result@1 (line 62)
[info]          │ │                                                               ; - bench.ListsBenchmark::skalaPlusEq@32 (line 81)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.11%  │ │     0x00007f26bbe8050f: mov    rsi,QWORD PTR [rsp+0x78]
[info]   0.04%  │ │     0x00007f26bbe80514: data16 xchg ax,ax
[info]   0.04%  │ │     0x00007f26bbe80517: call   0x00007f26abba6980             ; ImmutableOopMap{rbp=Oop [112]=Oop [120]=Oop [128]=Oop [0]=Oop [24]=Oop }
[info]          │ │                                                               ;*invokevirtual consume {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@20 (line 119)
[info]          │ │                                                               ;   {optimized virtual_call}
[info]   0.07%  │ │     0x00007f26bbe8051c: mov    r9,QWORD PTR [rsp]
[info]   0.35%  │ │     0x00007f26bbe80520: movzx  r11d,BYTE PTR [r9+0x94]        ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.ListsBenchmark::skalaPlusEq@28 (line 79)
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.08%  │ │     0x00007f26bbe80528: mov    r10,QWORD PTR [r15+0x108]
[info]   0.08%  │ │     0x00007f26bbe8052f: mov    rbx,QWORD PTR [rsp+0x8]
[info]   0.23%  │ │     0x00007f26bbe80534: add    rbx,0x1                        ; ImmutableOopMap{r9=Oop rbp=Oop [112]=Oop [120]=Oop [128]=Oop [0]=Oop [24]=Oop }
[info]          │ │                                                               ;*ifeq {reexecute=1 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@33 (line 121)
[info]   0.20%  │ │     0x00007f26bbe80538: test   DWORD PTR [r10],eax            ;   {poll}
[info]   0.11%  │ │     0x00007f26bbe8053b: test   r11d,r11d
[info]          │ │     0x00007f26bbe8053e: jne    0x00007f26bbe806ba             ;*aload_1 {reexecute=0 rethrow=0 return_oop=0}
[info]          │ │                                                               ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@36 (line 122)
[info]   0.04%  ↘ │     0x00007f26bbe80544: mov    r11,rbp
[info]   0.20%    │     0x00007f26bbe80547: mov    r10d,DWORD PTR [rbp+0xc]
[info]   0.15%    │     0x00007f26bbe8054b: test   r10d,r10d
[info]            │     0x00007f26bbe8054e: jle    0x00007f26bbe806ef             ;*if_icmpge {reexecute=0 rethrow=0 return_oop=0}
[info]            │                                                               ; - bench.ListsBenchmark::skalaPlusEq@15 (line 77)
[info]            │                                                               ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.10%    │     0x00007f26bbe80554: xor    edi,edi
[info]   0.09%    │     0x00007f26bbe80556: mov    ecx,0x8008a048                 ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x000000008008a048})}
[info]   0.15%    │     0x00007f26bbe8055b: xor    r8d,r8d
[info]   0.20%    │     0x00007f26bbe8055e: xor    ebp,ebp
[info]   0.10%    │     0x00007f26bbe80560: movabs rdx,0x8008a048                 ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x000000008008a048})}
[info]   0.07%   ╭│     0x00007f26bbe8056a: jmp    0x00007f26bbe805c3
[info]           ││     0x00007f26bbe8056c: nop    DWORD PTR [rax+0x0]
[info]   1.79%   ││ ↗   0x00007f26bbe80570: mov    r10,QWORD PTR [rsp+0x10]
[info]   1.97%   ││ │   0x00007f26bbe80575: mov    DWORD PTR [r10+0x10],ecx       ;*putfield next {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - skala.collection.immutable.$colon$colon::next_$eq@2 (line 23)
[info]           ││ │                                                             ; - skala.collection.mutable.ListBuffer::addOne@36 (line 72)
[info]           ││ │                                                             ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]           ││ │                                                             ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]           ││ │                                                             ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]           ││ │                                                             ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]           ││ │                                                             ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]           ││ │                                                             ; implicit exception: dispatches to 0x00007f26bbe807ea
[info]   0.96%   ││ │   0x00007f26bbe80579: mov    ecx,DWORD PTR [rsp+0x28]
[info]   0.51%   ││ │   0x00007f26bbe8057d: mov    rdx,rcx                        ;*getfield first {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - skala.collection.mutable.ListBuffer::first@1 (line 18)
[info]           ││ │                                                             ; - skala.collection.mutable.ListBuffer::toList@28 (line 58)
[info]           ││ │                                                             ; - skala.collection.mutable.ListBuffer::result@1 (line 62)
[info]           ││ │                                                             ; - bench.ListsBenchmark::skalaPlusEq@32 (line 81)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   1.40%   ││ │   0x00007f26bbe80580: shr    r10,0x9
[info]   1.71%   ││ │   0x00007f26bbe80584: mov    BYTE PTR [r11+r10*1],0x0       ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ │                                                             ; - bench.ListsBenchmark::skalaPlusEq@28 (line 79)
[info]           ││ │                                                             ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.93%   ││ │↗  0x00007f26bbe80589: mov    rdi,QWORD PTR [r15+0x108]
[info]   0.54%   ││ ││  0x00007f26bbe80590: mov    r8d,DWORD PTR [rsp+0x2c]
[info]   1.76%   ││ ││  0x00007f26bbe80595: inc    r8d                            ;*iinc {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::skalaPlusEq@25 (line 79)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   1.58%   ││ ││  0x00007f26bbe80598: mov    r11,QWORD PTR [rsp+0x70]
[info]   0.95%   ││ ││  0x00007f26bbe8059d: mov    r9d,DWORD PTR [r11+0xc]        ;*getfield size {reexecute=0 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::skalaPlusEq@12 (line 77)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.80%   ││ ││  0x00007f26bbe805a1: mov    r10d,DWORD PTR [rsp+0x30]
[info]   1.70%   ││ ││  0x00007f26bbe805a6: inc    r10d                           ; ImmutableOopMap{r11=Oop rcx=NarrowOop rbx=Oop rdx=Oop [112]=Oop [120]=Oop [128]=Oop [0]=Oop [24]=Oop }
[info]           ││ ││                                                            ;*goto {reexecute=1 rethrow=0 return_oop=0}
[info]           ││ ││                                                            ; - bench.ListsBenchmark::skalaPlusEq@28 (line 79)
[info]           ││ ││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   1.70%   ││ ││  0x00007f26bbe805a9: test   DWORD PTR [rdi],eax            ;   {poll}
[info]   0.86%   ││ ││  0x00007f26bbe805ab: cmp    r8d,r9d
[info]           │╰ ││  0x00007f26bbe805ae: jge    0x00007f26bbe80501
[info]   0.61%   │  ││  0x00007f26bbe805b4: mov    rdi,rbx
[info]   1.22%   │  ││  0x00007f26bbe805b7: mov    r9,QWORD PTR [rsp]
[info]   1.56%   │  ││  0x00007f26bbe805bb: mov    rbx,QWORD PTR [rsp+0x8]
[info]   0.79%   │  ││  0x00007f26bbe805c0: mov    ebp,r10d
[info]   0.61%   ↘  ││  0x00007f26bbe805c3: mov    rax,QWORD PTR [r15+0x118]
[info]   1.82%      ││  0x00007f26bbe805ca: mov    r10,rax
[info]   1.60%      ││  0x00007f26bbe805cd: add    r10,0x18
[info]   0.80%      ││  0x00007f26bbe805d1: cmp    r10,QWORD PTR [r15+0x128]
[info]             ╭││  0x00007f26bbe805d8: jae    0x00007f26bbe8067a             ;*goto {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - bench.ListsBenchmark::skalaPlusEq@28 (line 79)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.89%     │││  0x00007f26bbe805de: mov    QWORD PTR [r15+0x118],r10
[info]   1.66%     │││  0x00007f26bbe805e5: prefetchw BYTE PTR [r10+0xc0]
[info]   1.78%     │││  0x00007f26bbe805ed: mov    QWORD PTR [rax],0x1
[info]   0.99%     │││  0x00007f26bbe805f4: mov    DWORD PTR [rax+0x8],0x233f18   ;   {metadata(&apos;skala/collection/immutable/$colon$colon&apos;)}
[info]   0.54%     │││  0x00007f26bbe805fb: mov    DWORD PTR [rax+0xc],0x0
[info]   1.64%     │││  0x00007f26bbe80602: mov    QWORD PTR [rax+0x10],0x0
[info]   1.53%     │││  0x00007f26bbe8060a: mov    QWORD PTR [rsp+0x70],r11
[info]   0.75%     │││  0x00007f26bbe8060f: mov    QWORD PTR [rsp],r9
[info]   0.70%     │││  0x00007f26bbe80613: mov    QWORD PTR [rsp+0x8],rbx
[info]   1.69%     │││  0x00007f26bbe80618: mov    QWORD PTR [rsp+0x10],rdi
[info]   1.59%     │││  0x00007f26bbe8061d: mov    DWORD PTR [rsp+0x28],ecx
[info]   0.70%     │││  0x00007f26bbe80621: mov    DWORD PTR [rsp+0x2c],r8d
[info]   0.70%     │││  0x00007f26bbe80626: mov    DWORD PTR [rsp+0x30],ebp
[info]   1.99%     │││  0x00007f26bbe8062a: mov    QWORD PTR [rsp+0x38],rdx
[info]   2.02%     │││  0x00007f26bbe8062f: mov    rbp,rax                        ;*synchronization entry
[info]             │││                                                            ; - skala.collection.AbstractSeq::&lt;init&gt;@-1 (line 1)
[info]             │││                                                            ; - skala.collection.immutable.AbstractSeq::&lt;init&gt;@1 (line 1)
[info]             │││                                                            ; - skala.collection.immutable.List::&lt;init&gt;@1 (line 1)
[info]             │││                                                            ; - skala.collection.immutable.$colon$colon::&lt;init&gt;@1 (line 26)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@12 (line 68)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]             │││                                                            ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.54%     │││  0x00007f26bbe80632: mov    rsi,rbp
[info]   0.65%     │││  0x00007f26bbe80635: xchg   ax,ax
[info]   1.20%     │││  0x00007f26bbe80637: call   0x00007f26abba6980             ; ImmutableOopMap{rbp=Oop [112]=Oop [120]=Oop [128]=Oop [0]=Oop [16]=Oop [24]=Oop [40]=NarrowOop [56]=Oop }
[info]             │││                                                            ;*invokespecial &lt;init&gt; {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - skala.collection.AbstractSeq::&lt;init&gt;@1 (line 1)
[info]             │││                                                            ; - skala.collection.immutable.AbstractSeq::&lt;init&gt;@1 (line 1)
[info]             │││                                                            ; - skala.collection.immutable.List::&lt;init&gt;@1 (line 1)
[info]             │││                                                            ; - skala.collection.immutable.$colon$colon::&lt;init&gt;@1 (line 26)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@12 (line 68)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]             │││                                                            ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {optimized virtual_call}
[info]   0.68%     │││  0x00007f26bbe8063c: mov    rbx,rbp
[info]   0.75%     │││  0x00007f26bbe8063f: mov    DWORD PTR [rbp+0x10],0x8008a048  ;*putfield next {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - skala.collection.immutable.$colon$colon::&lt;init&gt;@11 (line 28)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@12 (line 68)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]             │││                                                            ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {oop(a &apos;skala/collection/immutable/Nil$&apos;{0x000000008008a048})}
[info]  16.64%     │││  0x00007f26bbe80646: mov    DWORD PTR [rbp+0xc],0x8003e7b0  ;*putfield head {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - skala.collection.immutable.$colon$colon::&lt;init&gt;@6 (line 27)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@12 (line 68)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]             │││                                                            ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]             │││                                                            ;   {oop(&quot;&quot;{0x000000008003e7b0})}
[info]   4.97%     │││  0x00007f26bbe8064d: mov    rcx,rbp                        ;*putfield first {reexecute=0 rethrow=0 return_oop=0}
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::first_$eq@2 (line 22)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@25 (line 70)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]             │││                                                            ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.10%     │││  0x00007f26bbe80650: mov    r10,rbp
[info]   0.06%     │││  0x00007f26bbe80653: shr    r10,0x9
[info]   1.35%     │││  0x00007f26bbe80657: movabs r11,0x7f26d9202000
[info]   3.07%     │││  0x00007f26bbe80661: mov    BYTE PTR [r11+r10*1],0x0       ;*synchronization entry
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@-1 (line 67)
[info]             │││                                                            ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]             │││                                                            ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]             │││                                                            ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]             │││                                                            ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]             │││                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   3.06%     │││  0x00007f26bbe80666: mov    ebp,DWORD PTR [rsp+0x30]
[info]   0.70%     │││  0x00007f26bbe8066a: test   ebp,ebp
[info]             │╰│  0x00007f26bbe8066c: jne    0x00007f26bbe80570             ;*ifne {reexecute=0 rethrow=0 return_oop=0}
[info]             │ │                                                            ; - skala.collection.mutable.ListBuffer::addOne@20 (line 69)
[info]             │ │                                                            ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info]             │ │                                                            ; - skala.collection.mutable.Growable::plusEq@2 (line 12)
[info]             │ │                                                            ; - skala.collection.mutable.Growable::plusEq$@2 (line 8)
[info]             │ │                                                            ; - skala.collection.mutable.AbstractBuffer::plusEq1@2 (line 4)
[info]             │ │                                                            ; - bench.ListsBenchmark::skalaPlusEq@21 (line 78)
[info]             │ │                                                            ; - bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub@17 (line 119)
[info]   0.28%     │ │  0x00007f26bbe80672: mov    rdx,rbx
[info]   0.12%     │ ╰  0x00007f26bbe80675: jmp    0x00007f26bbe80589
[info]             ↘    0x00007f26bbe8067a: mov    QWORD PTR [rsp+0x38],rdx
[info]                  0x00007f26bbe8067f: mov    DWORD PTR [rsp+0x30],ebp
[info]                  0x00007f26bbe80683: mov    DWORD PTR [rsp+0x2c],r8d
[info]                  0x00007f26bbe80688: mov    DWORD PTR [rsp+0x28],ecx
[info]                  0x00007f26bbe8068c: mov    QWORD PTR [rsp+0x10],rdi
[info]                  0x00007f26bbe80691: mov    QWORD PTR [rsp+0x8],rbx
[info]                  0x00007f26bbe80696: mov    QWORD PTR [rsp],r9
[info]                  0x00007f26bbe8069a: mov    QWORD PTR [rsp+0x70],r11       ;*invokevirtual ensureUnaliased {reexecute=0 rethrow=0 return_oop=0}
[info]                                                                            ; - skala.collection.mutable.ListBuffer::addOne@1 (line 67)
[info]                                                                            ; - skala.collection.mutable.ListBuffer::addOne@2 (line 7)
[info] ....................................................................................................
[info]  84.10%  <total for region 1>
[info] ....[Hottest Region 2]..............................................................................
[info] c2, level 4, skala.collection.AbstractIterable::&lt;init&gt;, version 545 (27 bytes)
[info]            0x00007f26bbe7bca4: shl    r10,0x3
[info]            0x00007f26bbe7bca8: movabs r12,0x800000000
[info]            0x00007f26bbe7bcb2: add    r10,r12
[info]            0x00007f26bbe7bcb5: xor    r12,r12
[info]            0x00007f26bbe7bcb8: cmp    rax,r10
[info]            0x00007f26bbe7bcbb: jne    0x00007f26abba6700             ;   {runtime_call ic_miss_stub}
[info]            0x00007f26bbe7bcc1: data16 xchg ax,ax
[info]            0x00007f26bbe7bcc4: nop    DWORD PTR [rax+rax*1+0x0]
[info]            0x00007f26bbe7bccc: data16 data16 xchg ax,ax
[info]          [Verified Entry Point]
[info]   2.46%    0x00007f26bbe7bcd0: sub    rsp,0x18
[info]   2.11%    0x00007f26bbe7bcd7: mov    QWORD PTR [rsp+0x10],rbp       ;*synchronization entry
[info]                                                                      ; - skala.collection.AbstractIterable::&lt;init&gt;@-1 (line 1)
[info]   1.69%    0x00007f26bbe7bcdc: add    rsp,0x10
[info]   0.53%    0x00007f26bbe7bce0: pop    rbp
[info]   1.16%    0x00007f26bbe7bce1: mov    r10,QWORD PTR [r15+0x108]
[info]   1.23%    0x00007f26bbe7bce8: test   DWORD PTR [r10],eax            ;   {poll_return}
[info]   2.25%    0x00007f26bbe7bceb: ret
[info]            0x00007f26bbe7bcec: hlt
[info]            0x00007f26bbe7bced: hlt
[info]            0x00007f26bbe7bcee: hlt
[info]            0x00007f26bbe7bcef: hlt
[info]            0x00007f26bbe7bcf0: hlt
[info]            0x00007f26bbe7bcf1: hlt
[info]            0x00007f26bbe7bcf2: hlt
[info]            0x00007f26bbe7bcf3: hlt
[info]            0x00007f26bbe7bcf4: hlt
[info]            0x00007f26bbe7bcf5: hlt
[info] ....................................................................................................
[info]  11.44%  <total for region 2>
[info] ....[Hottest Regions]...............................................................................
[info]  84.10%         c2, level 4  bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub, version 585 (372 bytes)
[info]  11.44%         c2, level 4  skala.collection.AbstractIterable::&lt;init&gt;, version 545 (27 bytes)
[info]   2.61%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 540 (75 bytes)
[info]   0.14%           libjvm.so  SpinPause+0x2 (0 bytes)
[info]   0.12%   [kernel.kallsyms]  native_write_msr+0x6 (0 bytes)
[info]   0.05%   [kernel.kallsyms]  entry_SYSCALL_64+0x0 (0 bytes)
[info]   0.05%  libpthread-2.19.so  [unknown] (4 bytes)
[info]   0.04%   [kernel.kallsyms]  __perf_event_task_sched_in+0x7c (9 bytes)
[info]   0.04%   [kernel.kallsyms]  _raw_spin_lock_irqsave+0x11 (17 bytes)
[info]   0.04%           libjvm.so  Monitor::unlock+0x28 (0 bytes)
[info]   0.03%   [kernel.kallsyms]  mutex_unlock+0x10 (0 bytes)
[info]   0.03%           libjvm.so  ElfSymbolTable::lookup+0x10c (16 bytes)
[info]   0.03%           libjvm.so  xmlStream::write_text+0x30 (27 bytes)
[info]   0.03%        libc-2.19.so  fclose+0x94 (0 bytes)
[info]   0.02%   [kernel.kallsyms]  perf_ctx_unlock+0xf (11 bytes)
[info]   0.02%   [kernel.kallsyms]  __perf_event_task_sched_in+0x15a (0 bytes)
[info]   0.02%   [kernel.kallsyms]  vfs_write+0x1b (0 bytes)
[info]   0.02%   [kernel.kallsyms]  __sb_end_write+0x26 (31 bytes)
[info]   0.02%   [kernel.kallsyms]  copy_user_enhanced_fast_string+0x3 (4 bytes)
[info]   0.02%           libjvm.so  VM_HandshakeAllThreads::doit+0x358 (12 bytes)
[info]   1.15%  <...other 109 warm regions...>
[info] ....................................................................................................
[info] 100.00%  <totals>
[info] ....[Hottest Methods (after inlining)]..............................................................
[info]  84.10%         c2, level 4  bench.generated.ListsBenchmark_skalaPlusEq_jmhTest::skalaPlusEq_thrpt_jmhStub, version 585
[info]  11.44%         c2, level 4  skala.collection.AbstractIterable::&lt;init&gt;, version 545
[info]   2.61%         c2, level 4  org.openjdk.jmh.infra.Blackhole::consume, version 540
[info]   0.14%           libjvm.so  SpinPause+0x2
[info]   0.12%   [kernel.kallsyms]  native_write_msr+0x6
[info]   0.05%  libpthread-2.19.so  [unknown]
[info]   0.05%   [kernel.kallsyms]  entry_SYSCALL_64+0x0
[info]   0.04%           libjvm.so  Monitor::unlock+0x28
[info]   0.04%   [kernel.kallsyms]  _raw_spin_lock_irqsave+0x11
[info]   0.04%        libc-2.19.so  _IO_default_xsputn+0x57
[info]   0.04%        libc-2.19.so  strlen+0x2f
[info]   0.04%   [kernel.kallsyms]  __perf_event_task_sched_in+0x7c
[info]   0.03%        libc-2.19.so  fclose+0x94
[info]   0.03%   [kernel.kallsyms]  mutex_unlock+0x10
[info]   0.03%           libjvm.so  xmlStream::write_text+0x30
[info]   0.03%           libjvm.so  ElfSymbolTable::lookup+0x10c
[info]   0.02%           libjvm.so  RelocIterator::initialize+0x1ea
[info]   0.02%  libpthread-2.19.so  __pthread_disable_asynccancel+0x22
[info]   0.02%           libjvm.so  VM_HandshakeAllThreads::doit+0x358
[info]   0.02%   [kernel.kallsyms]  copy_user_enhanced_fast_string+0x3
[info]   1.11%  <...other 106 warm methods...>
[info] ....................................................................................................
[info] 100.00%  <totals>
[info] ....[Distribution by Source]........................................................................
[info]  98.14%         c2, level 4
[info]   0.75%   [kernel.kallsyms]
[info]   0.63%           libjvm.so
[info]   0.24%        libc-2.19.so
[info]   0.08%      hsdis-amd64.so
[info]   0.08%  libpthread-2.19.so
[info]   0.02%         interpreter
[info]   0.02%          ld-2.19.so
[info]   0.01%
[info]   0.01%        runtime stub
[info]   0.01%         c1, level 3
[info]   0.01%              [ext4]
[info] ....................................................................................................
[info] 100.00%  <totals>
[info] # Run complete. Total time: 00:02:12
[info] REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
[info] why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
[info] experiments, perform baseline and negative tests that provide experimental control, make sure
[info] the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
[info] Do not assume the numbers tell you what you want them to tell.
[info] Benchmark                                        (size)   Mode  Cnt         Score        Error  Units
[info] ListsBenchmark.all                                   10  thrpt   10   4405721.929 ±  14704.577  ops/s
[info] ListsBenchmark.all:·asm                              10  thrpt                NaN                 ---
[info] ListsBenchmark.javaListBufferPlusEqAddOne            10  thrpt   10  32406264.123 ± 210897.736  ops/s
[info] ListsBenchmark.javaListBufferPlusEqAddOne:·asm       10  thrpt                NaN                 ---
[info] ListsBenchmark.scalaListBufferPlusEq                 10  thrpt   10  17269274.924 ± 178239.792  ops/s
[info] ListsBenchmark.scalaListBufferPlusEq:·asm            10  thrpt                NaN                 ---
[info] ListsBenchmark.scalaListBufferPlusEqAddOne           10  thrpt   10  32365244.613 ± 126290.298  ops/s
[info] ListsBenchmark.scalaListBufferPlusEqAddOne:·asm      10  thrpt                NaN                 ---
[info] ListsBenchmark.skalaAddOne                           10  thrpt   10  32366871.349 ±  69629.561  ops/s
[info] ListsBenchmark.skalaAddOne:·asm                      10  thrpt                NaN                 ---
[info] ListsBenchmark.skalaPlusEq                           10  thrpt   10  15517135.094 ±  40250.140  ops/s
[info] ListsBenchmark.skalaPlusEq:·asm                      10  thrpt                NaN                 ---
[success] Total time: 134 s, completed Jul 23, 2019, 10:40:24 PM
```
