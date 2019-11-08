
name := "storage-scala-example"

version := "0.1"

scalaVersion := "2.13.1"

val googleCloudV    = "1.89.0"
val googleHadoopV   = "hadoop3-2.0.0"

libraryDependencies += "com.google.cloud.bigdataoss" % "gcs-connector" % googleHadoopV
libraryDependencies += "com.google.cloud" % "google-cloud-storage" % googleCloudV

assemblyShadeRules in assembly := Seq(
  ShadeRule
    .rename("com.google.*.**" -> "shade.com.google.shade@1.shade@2")
    .inAll
)