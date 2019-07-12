Benchmark for https://github.com/scala/bug/issues/11627

I'm not seeing the same performance regression as reported.

```
$ uname -a
Darwin zMBP2019.local 18.6.0 Darwin Kernel Version 18.6.0: Thu Apr 25 23:16:27 PDT 2019; root:xnu-4903.261.4~2/RELEASE_X86_64 x86_64

$ ./bench.sh
...
```
https://jmh.morethan.io/?gists=e19c17e97a10d34f37d2cc06c65255d1,7a3a681f592185b21a119f967c337bd5
