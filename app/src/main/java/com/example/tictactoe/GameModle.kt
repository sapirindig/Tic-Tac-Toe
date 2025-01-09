package com.example.tictactoe

import java.text.FieldPosition
import kotlin.random.Random

data class GameModle (

     var gameId : String = "-1",
     var filledPos : MutableList<String> = mutableListOf("","","","","","","","",""),
     var winner : String = "",
    var gameStatus : GameStatus = GameStatus.CREATED,
    var currentplayer : String = (arrayOf("X","O"))[Random.nextInt(2)]


 )

enum class GameStatus {
    CREATED,
    JOINED,
    INPROGRESS,
    FINISHED

}

