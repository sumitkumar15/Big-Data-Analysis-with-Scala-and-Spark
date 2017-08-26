import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD
import wikipedia.WikipediaArticle


val conf: SparkConf = new SparkConf().setAppName("Simple Application").setMaster("local[*]")
val sc: SparkContext = new SparkContext(conf)
//val wikiRdd: RDD[WikipediaArticle] = {
//  val rdd=sc.textFile(wikipedia.WikipediaData.filePath)
//  rdd.map(line => parse(line))
//}