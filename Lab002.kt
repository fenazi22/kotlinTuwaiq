package com.example.kotlinbasics.assignments

fun main() {
//    println("---------- Q1 -------------------")
//    for (number in 1..100){
//        // this code if you want continue after print message
//        println(number)
//        if (number == 70 )
//         println("\"IT'S OVER 70!!!\"")

        //this code for after number 71 it will stop
        //if (number<71)
        //println(number)
        //else{
        // println("\"IT'S OVER 70!!!\"")
        //   break
        //}
        println("---------- Q2 -------------------")
        var i=true
    var temperature=20
    while (i){
    when(temperature){
        30-> {println("It’s Hot" )
            i=false
        }
        20-> {println("It’s Comfy")
        i=false
        }
        15-> {
            println("IT'S COLD!!! " )
            i=false
        }
        else -> {println("just the temperature value")
        i=false
        }

    }
    }




    }
