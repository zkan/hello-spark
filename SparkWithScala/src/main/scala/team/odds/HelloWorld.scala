package team.odds

import org.apache.spark.SparkContext

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext("local[*]", "HelloWorld")
    println("Hello World!")
  }
}
