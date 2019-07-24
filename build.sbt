scalaVersion in ThisBuild := "2.13.0"

name := "sbt-jmh-template"

val bench = project.enablePlugins(JmhPlugin).settings(inConfig(JmhPlugin.JmhKeys.Jmh)(scalabuild.JitWatchFilePlugin.jitwatchSettings))

scalacOptions in ThisBuild ++= List("-opt:l:inline", "-opt-inline-from:scala.**")