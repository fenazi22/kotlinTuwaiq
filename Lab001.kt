package com.example.kotlinbasics.assignments

fun main() {
    println("---------------------- q1   ------------------")
    var a:Boolean = false
    var b:Boolean =false
    var result1 =a and b
    println("result :{$a & $b = $result1} ")
    println("---------------------- q2   ------------------")
    var c:Int = 10
    var d:Int = 3
    var result2:Int = c%d
    println("result :{$c % $d = $result2} ")

    println("---------------------- q3   ------------------")
    var e:Int = 5
    var f:Int = 5
    var result3:Boolean = e >= f
    println("result  :{$e >= $d = $result3} ")

    println("---------------------- q4   ------------------")
    var h:Boolean = true
    var x:Boolean = false
    var result4:Boolean = h
    println("result :{$h  $x = $result4} ")

    println("---------------------- q5   ------------------")
    var w:Int = 5
    var ww:Int = 3
    var www:Int = 2
    var result5:Int = w-ww*www
    println("result :{$w- $ww *$www= $result5} ")

    println("---------------------- q6   ------------------")
    var o:Int = 3
    var oo:Int = 2
    var result6:Boolean = o!=oo
    println("result :{$o!=$oo = $result6} ")

    println("---------------------- q7   ------------------")
    var xx:Int = 6
    var xxx:Int = 6
    var xxxx:Int = 3
    var result7:Int = (xx+xxx)/xxxx
    println("result :{$($xx+$xxx)/$xxxx = $result7} ")
}