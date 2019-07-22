#! /bin/bash -e

function bench() {
  local F=$PWD/bench/target/result-$v.json
  sbt ++$1'!' 'show bench/scalaVersion' 'bench/jmh:run bench.ListBufferBenchmark -f2 -rf json -rff '"$F" 1>&2; 
  local gisturl=$(gist "$F")
  echo ${gisturl:(-32)}
}

id1=$(bench 2.12.8)
id2=$(bench 2.13.0)

echo https://jmh.morethan.io/?gists=$id1,$id2
