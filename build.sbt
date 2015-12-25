enablePlugins(ScalaJSPlugin)

name := "TestScalaProject"

version := "0.1"

name := "Scala.js Test Application"

scalaVersion := "2.11.7"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

jsDependencies += "org.webjars" % "leaflet" % "0.7.5" / "leaflet-src.js"

