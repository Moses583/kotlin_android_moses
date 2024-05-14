fun main(){
    println("Hello world")
    printTrash()
    printShit("Horseshit")
    printShit("Bullshit")
    printShit("Jackshit")
    val ans1 = doMath(23.0,46.0)
    println(ans1)
    val ans2 = doFactorial(5)
    println(ans2)
    val ans3 = factorialTwo(5,10)
    println(ans3)

    //anonymous functions
    val myFunction = { printShit("Noshit")}
    myFunction()
    myFunction.invoke()

    //lambda expressions
    val product = {a:Int,b:Int->a.times(b)}
    println(product(109,2))



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

//recursive function to find factorials
fun doFactorial(num: Int): Long{
    return if(num == 1) num.toLong() else num * doFactorial(num - 1)
}

//tail recursion
fun factorialTwo(num: Int, x:Int):Long{

    return if(num==1)   // terminate condition
        x.toLong()
    else
        factorialTwo(num-1,x*num)   //tail recursion
}




