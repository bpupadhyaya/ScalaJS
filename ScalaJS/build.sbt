name := "ScalaJS"

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(ScalaJSPlugin)

// scalaJSUseRhino in Global := false

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false
jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
    