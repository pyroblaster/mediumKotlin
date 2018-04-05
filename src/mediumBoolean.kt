/**
 * Created by Reptilko on 4/5/2018.
 */
fun main(args: Array<String>) {
    var characterAlive:Boolean=true //declaring Boolean and giving value: true
    println("Is character alive: $characterAlive.")
    //printing value of characterAlive, should print "Is character alive: true."

    characterAlive=false //changing value of characterAlive
    println("Is character alive: $characterAlive.")
    //again printing value of characterAlive, should print "Is character alive: false."


    //comparing values
    val oneGreaterThanTwo:Boolean=(1>2) 
    println("Is 1>2? $oneGreaterThanTwo.")

    val oneEqualTwo:Boolean=(1==2)
    println("Is 1==2? $oneEqualTwo.")

    val oneLesserThanTwo:Boolean=(1<2)
    println("Is 1<2? $oneLesserThanTwo.")
}