fun main(){
    val name = readln()
    println(twofer(name))
}
fun twofer(name: String): String{
    if (name.isEmpty()){
        return "One for you, one for me."
    }else{
        return "One for $name, one for me"
    }

}