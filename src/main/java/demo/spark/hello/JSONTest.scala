package demo.spark.hello

import org.json4s.JValue

//import scala.collection.JavaConversions

/**
 * Created by guilin1 on 15/12/14.
 */
object JSONTest {

  def main(args: Array[String]) {
//        val map = scala.collection.mutable.Map("hello" -> "world", "aa" -> "bb")
    val map = scala.collection.Map("hello" -> "world", "aa" -> "bb")

//    val map2: java.util.Map[String, String] = map
    //    val map2: java.util.Map[String, String] = JavaConversions.asJavaMap(map)

    //    val str = JSON.toJSONString(map2)

    //    println(str)

//    import com.codahale.jerkson.Json._

//    val l = List(
//      Map("id" -> 1, "name" -> "John"),
//      Map("id" -> 2, "name" -> "Dani")
//    )

//    println(generate(l))

    println(encodeJson(map))


  }

  def encodeJson(src: AnyRef): JValue = {
    import org.json4s.jackson.Serialization
    import org.json4s.{Extraction, NoTypeHints}
    implicit val formats = Serialization.formats(NoTypeHints)

    Extraction.decompose(src)
  }

}
