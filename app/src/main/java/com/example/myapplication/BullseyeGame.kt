import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.abs

class BullseyeGame : ViewModel() {
    var sliderValue by mutableStateOf(50f)
    var targetValue by mutableStateOf((0..100).random())
    var score by mutableStateOf(0)
    var feedback by mutableStateOf("")
    var roundsPlayed by mutableStateOf(0)
    var totalScore by mutableStateOf(0)

    fun onSliderValueChange(newValue: Float) {
        sliderValue = newValue
    }

    fun onHitMeClick() {
        val difference = abs(targetValue - sliderValue)

        when {
            difference.toInt() == 0 -> {
                score += 10
                feedback = "Perfect! You earned 10 points!"
            }

            difference <= 3 -> {
                score += 5
                feedback = "Great! You earned 5 points!"
            }

            difference <= 8 -> {
                score += 1
                feedback = "Not bad! You earned 1 point."
            }

            else -> {
                feedback = "Missed! No points awarded."
            }
        }

        updateTargetValue()
    }

    private fun updateTargetValue() {
        targetValue = (0..100).random()
    }

    fun resetGame() {
        sliderValue = 50f
        score = 0
        feedback = ""
        roundsPlayed = 0
        totalScore = 0
        updateTargetValue()
    }
}
