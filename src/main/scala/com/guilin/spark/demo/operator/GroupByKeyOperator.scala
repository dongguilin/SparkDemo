package com.guilin.spark.demo.operator

import java.util

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by guilin on 2017/7/19.
  */
object GroupByKeyOperator {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[5]").setAppName("GroupByKeyOperator")
    val sc = new SparkContext(conf)

    val scoreList = util.Arrays.asList(("xuruyun", 150), ("liangyongqi", 100), ("wangfei", 100))

    //sc.parallelize(scoreList)



  }

}
