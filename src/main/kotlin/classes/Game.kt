package org.gabguimaraes.classes

class Game (
    val name : String,
    val genre : String,
    var price : Double
)

fun main() {
    val game = Game("Super Mario 3D World", "Platformer", 59.99)
    println("Game: ${game.name}")
    println("Genre: ${game.genre}")
    println("Price: $${game.price}")
    game.price += 30
    println("Updated Price: $${game.price}")
}