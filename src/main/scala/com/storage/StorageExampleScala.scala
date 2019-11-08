package com.storage

import java.nio.charset.Charset

import com.google.cloud.storage.{Blob, BlobId, BlobInfo, BucketInfo, Storage}

class StorageExampleScala(storage: Storage, bucketName: String) {

  def createBucket(): Unit = {
    println("Started createBucket :" + bucketName)
    this.storage.create(BucketInfo.of(this.bucketName))
    println("End createBucket :" + bucketName)
  }

  def createBlob(): Unit = {
    println("started creating blob")
    for (i <- 0 to 10) {
      val message: String = "this is simple blob for testing purpose :" + i
      val blobId = BlobId.of(this.bucketName, "prafu_test_blob" + i);
      val blobInfo = BlobInfo.newBuilder(blobId).setContentType("text/plain").build()
      this.storage.create(blobInfo, message.getBytes(Charset.forName("UTF8")))
    }
    println("end creating blob")
  }

  def deleteBucket(): Unit = {
    println("started delete bucket")
    this.storage.delete(this.bucketName)
    println("deleteBucket done")
  }

  def deleteBlob(): Unit = {
    println("started blobs deletions")
    this.storage.list(this.bucketName).iterateAll().forEach((blob: Blob) => blob.delete())
    println("end blobs deletions")
  }
}
