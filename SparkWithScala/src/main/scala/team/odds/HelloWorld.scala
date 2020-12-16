package team.odds

import org.apache.spark.SparkContext

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext("local[*]", "HelloWorld")
    val lines = sc.textFile("data/ml-100k/u.data")
    val numLines = lines.count()

    println("Hello World! The u.data file has " + numLines + " lines.")

    val rdd = sc.parallelize(List(1, 2, 3, 4))
    val squares = rdd.map(x => x * x)
    squares.collect().foreach(println)

    sc.stop()
  }
}
