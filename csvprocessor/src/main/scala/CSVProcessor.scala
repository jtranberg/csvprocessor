package com.example.csvprocessor

import org.apache.commons.csv.{CSVFormat, CSVParser}
import java.io.FileReader
import scala.jdk.CollectionConverters._

object CSVProcessor {
  def processCSV(filePath: String): Unit = {
    try {
      val reader = new FileReader(filePath)
      val csvParser = CSVFormat.DEFAULT
        .builder()
        .setHeader("companyName", "companyId", "companyAddress", "companyCity")
        .setSkipHeaderRecord(true)
        .build()
        .parse(reader)

      println("Processing CSV...")
      csvParser.getRecords.asScala.foreach { record =>
        val companyName = record.get("companyName")
        val companyId = record.get("companyId")
        val companyAddress = record.get("companyAddress")
        val companyCity = record.get("companyCity")

        println(s"Company: $companyName, ID: $companyId, Address: $companyAddress, City: $companyCity")
      }
      reader.close()
    } catch {
      case e: Exception =>
        println(s"Error while processing CSV: ${e.getMessage}")
    }
  }
}
