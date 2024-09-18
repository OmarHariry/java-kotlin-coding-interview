# Rock-Paper-Scissors Game

A simple implementation of the classic rock-paper-scissors game in Java. This project features two players, where one player makes random choices and the other always chooses rock.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [Code Structure](#code-structure)
- [Classes and Methods](#classes-and-methods)

## Features

- Two players: Player A (random choice) and Player B (always chooses rock).
- Tracks and displays the number of wins, losses, and draws after a set number of rounds.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17
- Maven
- An IDE or text editor (e.g., IntelliJ IDEA, Eclipse, Visual Studio Code)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/OmarHariry/java-kotlin-coding-interview
   cd RockPaperScissor
   ```
2. Build the Project:
   ```bash
   mvn clean install
   ```
3. Run the project
   ```bash
   mvn exec:java -Dexec.mainClass="com.game.Main"
   ```


### Code Structure
- **Player**: Represents a player in the game and their choices.
- **Result**: Contains the logic for determining the outcome of a round.
- **Game**: Manages the game flow and tracks scores.
- **Main**: Entry point of the application, where the game is initialized and executed.

### Classes and Methods
The project is organized into the following classes:

- **Player**: Represents a player in the rock-paper-scissors game.
  - **Choice Enum**: Represents the possible choices (ROCK, PAPER, SCISSORS).
  - `Choice chooseRandom()`: Returns a randomly selected choice.
  - `Choice chooseRock()`: Returns the choice ROCK.

- **Result**: Contains the logic for determining the outcome of a round.
  - **RoundResult Enum**: Represents the possible outcomes of a round (WIN, LOSE, DRAW).
  - `RoundResult getRoundResult(Choice playerAChoice, Choice playerBChoice)`: Determines the outcome based on both players' choices.

- **Game**: Manages the game flow, tracks scores, and handles rounds.
  - `void playRounds(int rounds)`: Plays a specified number of rounds and updates scores.
  - `void getRoundResults(int rounds)`: Displays the results after the rounds have been played.

- **Main**: The entry point of the application, where the game is initialized and executed.
  - `public static void main(String[] args)`: Starts the game and runs the rounds.

