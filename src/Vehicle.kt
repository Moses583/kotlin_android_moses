class Vehicle {
    //class with inner class
    var brand: String = ""
    var classCat: String = ""

    inner class Engine{
        var type: String = ""
        var power:Int = 0
         fun getEngine(){
             println("Engine type: $type, Engine power $power")
         }
    }
    fun getCar(){
        println("Car brand: $brand, Car class $classCat")
    }



}