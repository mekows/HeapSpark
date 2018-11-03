package SparkMekows;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;

public class HelloSpark {
    public static void main(String[] args) {
        String inputFile = "E:\\test.txt";
        SparkConf conf = new SparkConf().setAppName("HelloSpark").setMaster("local");
        SparkContext sc = new SparkContext(conf);
//        String textFile =  sc.textFile(inputFile);
    }
}
