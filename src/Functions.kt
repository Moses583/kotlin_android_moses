fun main(){
    println("Hello world")
    printTrash()
    printShit("Horseshit")
    printShit("Bullshit")
    printShit("Jackshit")
    val ans1 = doMath(23.0,46.0)
    println(ans1)


}
//function without arguments
fun printTrash(){
    for (i in 1..10){
        println(i)
    }
}

//function with arguments, no return type
fun printShit(string: String){
    println("this is the shit to be printed: $string")
}

//function with multiple arguments and return type
fun doMath(a: Double,b: Double): Double = a.div(b)
