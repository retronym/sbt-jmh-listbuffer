scalaVersion := "2.13.0"

name := "sbt-jmh-template"

val bench = project.enablePlugins(JmhPlugin).settings(inConfig(JmhPlugin.JmhKeys.Jmh)(scalabuild.JitWatchFilePlugin.jitwatchSettings))
