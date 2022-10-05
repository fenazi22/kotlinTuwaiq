package com.example.kotlinbasics

fun main() {
    
 print("Enter number One: ")
 var num1= readln().toInt()
    print("Enter number Parameter: ")
    var Parameter= readln().toString()
 print("Enter number Tow: ")
    var num2= readln().toInt()
    println(clc(num1,num2,Parameter))

}


fun clc(num1: Int, num2: Int, Parameter:String): Int {

 val result=  when(Parameter){
        "+"->  num1+num2
        "-"->  (num1-num2)
        "*"->  num1*num2
        "*"->  num1/num2

     else -> 0

 }
 return result
}




