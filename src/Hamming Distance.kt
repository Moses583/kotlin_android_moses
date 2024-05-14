fun main(){
    println(compute("SDHFNVHGYTI","DHFJGNTHUDJ"))

}
fun compute(leftStrand: String,rightStrand: String):Int{
    if (leftStrand.length != rightStrand.length){
        throw IllegalArgumentException("DNA lengths must be equal")
    }
    var hamming = 0
    for (s in leftStrand.indices){
        if (leftStrand[s] != rightStrand[s]){
            hamming++
        }
    }
    return hamming;
}