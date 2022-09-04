package com.example.myapplication

fun main() {
    helloWorld()
    checkNum(add(1,2))
    forAndWhile()
}

fun helloWorld() : Unit {
    println("Hello World")

    val name = "Joyce"
    val lastName = "Hong"
    println("my name is ${name + lastName}Nice to meet you")
    println(maxBy2(3, 2))
}

fun add(a : Int, b : Int) :Int {
    return a + b
}

fun maxBy2(a: Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }

    var b = when(score) {
        1-> 1
        2-> 2
        else ->3
    }

    when(score) {
        in 90..100 -> print("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }

}

fun array() {

    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0) // 안의 값은 못바꿈

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20

}

fun forAndWhile() {

    val students = arrayListOf("Joyce", "james")

    for( name in students) {
        println("${name}")
    }

    var sum : Int = 0
    for(i in 1..10) {
        sum = sum + i
    }
    println(sum)


    var sum2 : Int = 0
    for(i in 1..10 step 2) {
        sum2 += i
    }
    println(sum2)

    var sum3 : Int = 0
    for(i in 10 downTo 1) {
        sum3 += i
    }
    println(sum3)

    var sum4 : Int = 0
    for(i in 1 until 10) {
        sum4 += i
    }
    println(sum4)
}

