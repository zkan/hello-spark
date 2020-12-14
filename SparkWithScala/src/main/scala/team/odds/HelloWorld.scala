package team.odds

import org.apache.spark.SparkContext

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext("local[*]", "HelloWorld")
    val lines = sc.textFile("data/ml-100k/u.data")
    val numLines = lines.count()

    println("Hello World! The u.data file has " + numLines + " lines.")

    sc.stop()
  }
}
