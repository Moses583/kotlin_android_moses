fun main(){
    println("Hello world")
    val person1 = Person()
    person1.name = "Shawn"
    person1.age = 45
    person1.isMarried = true
    person1.laugh()
    person1.fart("spaghetti")
    person1.fart("beans")

}
//class without constructor
class Person{
    var name:String = ""
    var age:Int = 0
    var isMarried = false;

    fun laugh(){
        println("Hahaha")
    }
    fun fart(food: String){
        if (food.startsWith("s")){
          println("prrrrr")
        }
        else{
            println("bbbrrbbrrbbr")
        }
    }

}