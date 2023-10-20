package com.example.myapplication

import androidx.lifecycle.ViewModel
import kotlin.math.abs

data class GameModel(
    var target: Int,
    var sliderValue: Float,
    var score: Int
)

class GameViewModel : ViewModel() {
    var gameModel: GameModel = GameModel((0..100).random(), 50f, 0)

    fun calculateScore() {
        val difference = abs(gameModel.target - gameModel.sliderValue)
        gameModel.score = when {
            difference <= 3 -> 5
            difference <= 8 -> 1
            else -> 0
        }
    }

}
