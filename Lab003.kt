package com.example.kotlinbasics.assignments

fun main() {
    var sum=0.0

    var num= arrayListOf<Double>(1.0 , 2.0, 3.0, 4.0, 5.0)
    var avg=num.size
    for (i in 0 until  num.size){
        sum+=num[i]
    }

    println("average is :"+(sum/avg))

}