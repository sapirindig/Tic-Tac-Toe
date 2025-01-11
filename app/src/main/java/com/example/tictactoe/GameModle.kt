package com.example.tictactoe

import kotlin.random.Random

data class GameModel (
    var gameId: String ="-1",
    var filledPos: MutableList<String> = mutableListOf("", "", "", "", "", "", "", "", ""),

    var winner: String = "",
    var gameStatus: GameStatus = GameStatus.CREATED,
    var currentPlayer: String = "X"

)


enum class GameStatus{
    CREATED,
    JOINED,
    INPROGRESS,
    FINISHED
}