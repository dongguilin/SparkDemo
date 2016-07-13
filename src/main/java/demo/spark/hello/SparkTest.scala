package demo.spark.hello

import org.apache.curator.framework.CuratorFrameworkFactory
import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by guilin1 on 15/12/14.
 */
object SparkTest {

  def main(args: Array[String]) {

    wordcount

  }

  def wordcount(): Unit = {
    CuratorFrameworkFactory.builder();
    val logFile = "/Users/guilin1/Documents/test/a.xml" // Should be some file on your system
//    val conf = new SparkConf().setMaster("local[2]").setAppName("Simple Application")
    val conf = new SparkConf().setMaster("spark://localhost:7077").setAppName("Simple Application")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))

  }


}
