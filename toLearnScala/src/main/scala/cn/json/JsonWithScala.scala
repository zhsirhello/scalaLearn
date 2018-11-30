package cn.json

import scala.util.parsing.json.JSON

object JsonWithScala {
  def main(args: Array[String]): Unit = {
    //json转为map
    val str = "{\"host\":\"td_test\",\"ts\":1486979192345,\"device\":{\"tid\":\"a123456\",\"os\":\"android\",\"sdk\":\"1.0.3\"},\"time\":1501469230058}"
    println(str)
    val jsonSome=JSON.parseFull(str)
    //以下返回的是Any类型
    val jsonData=jsonSome.get
    //Map(host -> td_test, ts -> 1.486979192345E12, device -> Map(tid -> a123456, os -> android, sdk -> 1.0.3), time -> 1.501469230058E12)
    println(jsonData)
    //a123456
    println(jsonData.asInstanceOf[Map[String,Any]]("device").asInstanceOf[Map[String,String]]("tid"))

    //==============================================================================================================
    /*val json = "{\"author\":\"hll\",\"content\":\"ES即etamsports\",\"id\":\"693\",\"time\":1490165237200,\"title\":\"百度百科\"}"
    val mapper = new ObjectMapper()
    mapper.registerModule(DefaultScalaModule)
    val obj = mapper.readValue(json,classOf[Book])
    println(obj.toString)*/
  }
}
