import org.apache.spark._

/*
 * This program is used to find the median of each row.
 * The input file can have any number of lines, but each line should have integers separated by space
 * It then prints the median for each row
 */

object MedianApp {
  
  def main(args: Array[String]) =  {
    
    val conf = new SparkConf().setAppName("Median App").setMaster("local")
    val sc = new SparkContext(conf)
    
    val baseRDD = sc.textFile("/opt/projects/data/medianTest.txt")
    
    val medianRDD = baseRDD.map(findMedian)
    
    medianRDD.collect().foreach(println)
    
  }
  
  /*
   * This function calculates the median for a given line
   * 
   * @param an input string of numbers separated by space
   * @return median for the given input as a float value
   */
  def findMedian(input: String): Float = {
    val stringArr = input.split(" ")
    val intArr = stringArr.map(_.toInt).sorted
    val arrSize = intArr.size
    val quotient = arrSize / 2
    
    if(arrSize % 2 == 0){
      (intArr(quotient-1) + intArr(quotient) ).toFloat / 2
    }
    else{
      intArr(quotient).toFloat
    }
  }
  
}
