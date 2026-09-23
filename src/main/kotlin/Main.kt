package org.gabguimaraes

fun main() {
    println("Hello World")
    println(max(10, 20))
    println(max(1.0,3.0))

    //declaring variables with explict type
    val name : String
    name = "Clark Kent"
    println(name)
}

fun max(a: Int, b: Int) : Int {
    return if (a > b) a else b
}

fun max(a: Double, b: Double) : Double = if (a > b) a else b

fun answer() {
    //declaring variables with explict type
    val question : String = "What is the last name of Superman?"
    val answer : String = "Kent"
    println("Question: $question")
    println("Answer: $answer")

    //declaring omitting the type, it will be inferred by the compiler
    val question2 = "What is the last name of Batman?"
    val answer2 = "Wayne"
    println("Question: $question2")
    println("Answer: $answer2")
}