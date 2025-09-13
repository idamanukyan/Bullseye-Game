🎯 Bullseye Game (Jetpack Compose)

A simple Kotlin + Jetpack Compose game where the player tries to match a randomly generated target value using a slider.
The closer your guess, the higher your score!

🕹️ Gameplay

A target value (0–100) is randomly generated.

Use the slider to set your guess as close as possible to the target.

Press “Hit Me!” to see your score and feedback:

🎯 Perfect! Exact match → +10 points

👍 Great! Within 3 → +5 points

🙂 Not bad! Within 8 → +1 point

❌ Missed! Otherwise → 0 points

After each round, a new target value is generated.

✨ Features

Real-time slider control for precise guessing.

Dynamic feedback messages after each round.

Score tracking across multiple rounds.

Reset option to start a new game anytime.

📂 Project Structure

BullseyeGame (ViewModel):

Manages state for slider, target, score, feedback, rounds, and total score.

Handles scoring logic and feedback messages.

Provides resetGame() to restart the game.

⚙️ Tech Stack

Language: Kotlin

UI Framework: Jetpack Compose

Architecture: MVVM (ViewModel for state management)

🚀 Getting Started

Clone the repository:

git clone https://github.com/<your-username>/BullseyeGame.git


Open the project in Android Studio.

Run the app on an emulator or physical device.

🎯 Example Scoring Flow
Target: 72
Your Slider Guess: 70
Difference: 2
Feedback: "Great! You earned 5 points!"

📜 License

This project is licensed under the MIT License – see LICENSE
 for details.
