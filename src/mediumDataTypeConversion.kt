/**
 * Created by Reptilko on 4/5/2018.
 */
fun main(args: Array<String>) {
    var stringToInt:String="64"
    var intFromString:Int
    intFromString=stringToInt.toInt()  //conversion to int
    println(intFromString)  //should print "64"

    var stringFromInt:String
    stringFromInt=intFromString.toString()  //converison to string
    println(stringFromInt)  //should print "64"

    var doubleToInt:Double=9.99
    var intFromDouble:Int
    intFromDouble=doubleToInt.toInt()  //conversion to int
    println(intFromDouble)  //should print "9"
}