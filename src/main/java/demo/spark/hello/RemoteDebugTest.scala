package demo.spark.hello


import org.apache.spark.{SparkConf, SparkContext}

/**
 * Created by guilin1 on 15/12/14.
 */
object RemoteDebugTest {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Spark Pi").setMaster("spark://localhost:7077")
      .setJars(List("F:\\Spark\\SparkRemoteDebug\\out\\artifacts\\SparkRemoteDebug_jar\\SparkRemoteDebug.jar"))
    val spark = new SparkContext(conf)
    val slices = if (args.length > 0) args(0).toInt else 2
    val n = 100000 * slices
//    val count = spark.parallelize(1 to n, slices).map { i =>
//      val x = random * 2 - 1
//      val y = random * 2 - 1
//      if (x * x + y * y < 1) 1 else 0
//    }.reduce(_ + _)
//    println("Pi is roughly " + 4.0 * count / n)
    spark.stop()
  }


}
