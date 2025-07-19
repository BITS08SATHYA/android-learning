package dev.sathya.mylearning

fun main(args: Array<String>){

    var age = ArrayList<Int>();

    age.add(10)
    age.add(1,20)
    age.add(2, 30)

    age.remove(20)

    for(ele in age){
        println(ele)
    }

    var cars = arrayListOf<String>("Opel","BMW")
    cars.add("Ford")

    for(element in cars){
        println(element)
    }

    var myMixArrayList = ArrayList<Any>()
    myMixArrayList.add("Ford2")
    myMixArrayList.add(5)
    myMixArrayList.add(2)
    myMixArrayList.add(3)
    myMixArrayList.add(4)

    for(element in myMixArrayList){
        println(element)
    }

}