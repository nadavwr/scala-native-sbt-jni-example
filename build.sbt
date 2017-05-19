enablePlugins(ScalaNativePlugin, JniNative)

organization := "sample"
moduleName := "scala-native-sbt-jni-example"
version := "0.1.0"

scalaVersion := "2.11.11"
crossPaths := true // sbt-jni disables this for some reason

nativeLinkingOptions ++= {
  val target = s"${baseDirectory.value}/target/native/${nativePlatform.value}/bin"
  Seq(s"-L$target", "-rpath", target)
}

