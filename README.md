# storage-scala-example

Steps

**Clean** 
- `sbt clean`

**Compile source code.** 
- `sbt compile`

**Generate Jar.** 
- `sbt assembly`

**Submit Spark job in Dataproc following properties needs to be set.** 

- `spark.executor.userClassPathFirst` = `true`
- `spark.driver.userClassPathFirst` = `true`