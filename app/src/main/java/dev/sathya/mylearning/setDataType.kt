package dev.sathya.mylearning


fun main(args: Array<String>){

    var mySetArray = setOf<Any>("Kotlin", 2, 2.5, 'K',true, "Kotlin")

    println(mySetArray.size)
    println(mySetArray.last())

    var newSet = HashSet<Any>()
    newSet.add("Hi")
    newSet.add("hi")
    newSet.add("Hi")
    newSet.add(43)

    println(newSet.size)

    for(ele in newSet){
        println(ele)
    }

}