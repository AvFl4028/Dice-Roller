package com.example.diceroller

class Dice(private var sides:Int = 6){
    fun roll():Int{
        return (1..sides).random()
    }

    fun rollDice(){
        TODO("Not yet implemented")
    }
}