/**
 * Created by Reptilko on 4/5/2018.
 */
fun main(args: Array<String>) {
    var andNotOr:Boolean=(1>2)&&(1<2)  //AND
    println("Is(1>2)&&(1<2)? $andNotOr.") //should print false; 1 is lesser than 2 so first condition is not satisfied

    andNotOr=(1==2)||(1<2)  //OR
    println("Is (1==2)||(1<2)? $andNotOr.") //should print true; second condition is satisfied

    andNotOr=!true  //NOT
    println("Not true? $andNotOr.") //should print false; before "andNotOr=!true" andNotOr was true so "!" makes it false
}