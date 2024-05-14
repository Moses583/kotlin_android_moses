//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //immutable list
    val fruits = listOf("mango","pineapple","banana")
    for (s in fruits){
        println(s)
    }
    val filtered = fruits.filter { it.startsWith("m") }
    println(filtered)

    //immutable set
    val mySet = setOf(3,4,5,6,"bmw","toyota","mercedes")
    for (s in mySet)
        println(s)

    //immutable map
    val myMap = mapOf(1 to "Kenya", 2 to "Uganda", 3 to "Tanzania", 4 to "Rwanda")
    for (s in myMap.keys)
        println(myMap[s])

    val mutableList = mutableListOf(1,2,3,4,5)
    mutableList.add(6)
    mutableList[3] = 45
    for (s in mutableList)
        println(s)

    val mutableSet = mutableSetOf<Int>(1,2,4,5,67,6)
    mutableSet.add(34)
    for (s in mutableSet)
        println(s)
}