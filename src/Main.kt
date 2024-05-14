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

    //mutable list
    val mutableList = mutableListOf(1,2,3,4,5)
    mutableList.add(6)
    mutableList[3] = 45
    for (s in mutableList)
        println(s)

    //mutable set
    val mutableSet = mutableSetOf<Int>(1,2,4,5,67,6)
    mutableSet.add(34)
    for (s in mutableSet)
        println(s)

    //mutable map
    val myMutableMap = mutableMapOf(1 to "James", 2 to "Kamau", 3 to "Kimemia")
    myMutableMap[1] = "Wang'ombe"
    myMutableMap[3] = "Kong'ori"
    for (s in myMutableMap){
        println(s)
    }

    //arrayList
    val myArrayList = ArrayList<Int>()
    for (s in 1..10){
        myArrayList.add(s)
    }
    for (t in myArrayList){
        println(t)
    }

    //hashSet
    val myHashSet = hashSetOf(1,2,3,4)
    println(myHashSet)
    myHashSet.add(12)
    println(myHashSet)
    myHashSet.remove(2)
    println(myHashSet)

    //hashMap

    val myHashMap:  HashMap<Int,Char> = HashMap()
    for (s in 1..10){
        for (c in 'a'..'j'){
            myHashMap.put(s,c)
        }
    }
    println(myHashMap)


}