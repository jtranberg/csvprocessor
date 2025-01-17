package com.example.csvprocessor

import java.io.File

@main def main(): Unit = {
  println("Welcome to the CSV Processor!")

  val filePath = "example.csv"
  val file = new File(filePath)

  println(s"Absolute file path: ${file.getAbsolutePath}")
  println(s"File exists: ${file.exists()}")

  if (file.exists()) {
    println("File found. Starting CSV processing...")
    CSVProcessor.processCSV(filePath)
  } else {
    println("Error: File not found!")
  }
}
