# storage-scala-example

Steps

**Clean** 
1. `sbt clean`

**Compile source code.**
2. `sbt compile`

**Generate Jar.**
3. `sbt assembly`

**Submit Spark job in Dataproc following properties needs to be set.**

1. `spark.executor.userClassPathFirst` = `true`
2. `spark.driver.userClassPathFirst` = `true`