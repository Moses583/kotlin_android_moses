fun main(){
    println("Hello world")

    //object of type Person
    val person1 = Person()
    person1.name = "Shawn"
    person1.age = 45
    person1.isMarried = true
    person1.laugh()
    person1.eat("spaghetti")
    person1.eat("beans")
    println(person1.name)

    //object of type Car
    val car1 = Car("BWM","5 Series",2021)
    car1.drive()
    println(car1.speed(4))

    //object of class Vehicle
    val car2 = Vehicle()
    car2.brand="BMW"
    car2.classCat = "Sedan"
    car2.getCar()
    val engine = car2.Engine()
    engine.type = "V8"
    engine.power = 625
    engine.getEngine()

    //object of class company with getters and setters
    val comp1 = Company()
    comp1.name = "Airtel PLC"
    println(comp1.name)

}
//class without constructor
class Person{
    var name:String = ""
    var age:Int = 0
    var isMarried = false;

    fun laugh(){
        println("Hahaha")
    }
    fun eat(food: String){
        if (food.startsWith("s")){
          println("yummy!")
        }
        else{
            println("ugh!")
        }
    }

}
//class with constructor
class Car(brand:String,model:String,yearOfMan:Int){
    fun drive(){
        println("Vrooom")
    }
    fun speed(gear:Int):Int{
        return gear.times(3+43)
    }
}