package SparkMekows

import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
  def main(args: Array[String]) {
    val inputFile =  "E:\\test.txt"
    val conf = new SparkConf().setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile(inputFile)
    val wordCount = textFile.flatMap(line => line.split("=>")).map(word => (word, 1)).reduceByKey((a, b) => a + b)
    wordCount.foreach(println)

  }
}
