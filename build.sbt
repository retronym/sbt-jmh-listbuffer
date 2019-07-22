scalaVersion in ThisBuild := "2.12.8"

name := "sbt-jmh-template"

val bench = project.enablePlugins(JmhPlugin).settings(inConfig(JmhPlugin.JmhKeys.Jmh)(scalabuild.JitWatchFilePlugin.jitwatchSettings))
