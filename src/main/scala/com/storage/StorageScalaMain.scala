package com.storage

import com.google.cloud.storage.StorageOptions

object StorageScalaMain {
  def main(args: Array[String]): Unit = {
    val storage = StorageOptions.getDefaultInstance.getService
    val bucketName = "storage_scala_bucket"
    val storageExample = new StorageExampleScala(storage, bucketName);
    storageExample.createBucket()
    storageExample.createBlob()
    storageExample.deleteBlob()
    storageExample.deleteBucket()
  }
}
