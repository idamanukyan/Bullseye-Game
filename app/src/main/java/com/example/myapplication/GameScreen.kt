//import androidx.compose.runtime.rememberViewModel
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.lifecycle.viewmodel.compose.viewModel

/*val customTypography = Typography(
    h1 = TextStyle(
        fontSize = 30.sp, // Adjust the size to your preference
        fontWeight = FontWeight.Bold
    ),
    body4 = TextStyle(
        fontSize = 16.sp, // Adjust the size to your preference
        fontWeight = FontWeight.Normal
    )
)*/

@Composable
fun GameScreen() {
    //val gameViewModel = rememberViewModel<BullseyeGame>()

    val gameViewModel: BullseyeGame = viewModel()

    val targetValue = gameViewModel.targetValue
    val sliderValue = gameViewModel.sliderValue

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Text(
            text = "Target Value: $targetValue",
            //  style = customTypography.h1
        )

        Slider(
            value = sliderValue,
            valueRange = 0f..100f, // Define the range for the slider
            onValueChange = { newValue ->
                gameViewModel.onSliderValueChange(newValue)
            }
        )

        Button(
            onClick = {
                gameViewModel.onHitMeClick()
            }
        ) {
            Text(text = "Hit Me!")
        }

        Text(
            text = "Score: ${gameViewModel.score}",
            //  style = customTypography.body4
        )
    }
}
