package dev.sathya.mylearning

fun main(args:Array<String>){

    var age = mapOf<String, Int>("david" to 20, "ronaldo" to 40)

//    println("age of david: " + age["david"])
//    println("age of ronaldo: " + age["ronaldo"])


    var newMap = mutableMapOf<String, Int>("david" to 20, "ronaldo" to 40)
    newMap.put("buffon", 30)

    println("Age of Buffon: " + newMap.get("david"))


//    for(ele in newMap){
//        println(ele)
//    }

}