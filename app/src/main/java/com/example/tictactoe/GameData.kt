package com.example.tictactoe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object  GameData {

    private var _gameModle : MutableLiveData<GameModle>  = MutableLiveData()
    var gameModle : LiveData<GameModle> = _gameModle
}