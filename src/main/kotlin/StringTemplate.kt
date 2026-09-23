package org.gabguimaraes

fun main() {
    println("What is your name?")
    val input = readln()
    val name = input.ifBlank { "Clark Kent" }
    println("Hello, $name")
    template(name)
}

fun template(name : String) {
    println("The word $name has ${name.length} letters")
    println("Hello, ${if (name.isNotBlank()) "someone" else name}")
}