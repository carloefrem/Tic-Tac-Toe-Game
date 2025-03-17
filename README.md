Tic-Tac-Toe Game

## Project Overview

This is a Java-based Tic-Tac-Toe game that allows players to compete in:
- Human vs. Human mode
- Human vs. Computer mode
The game follows the traditional 3x3 grid format with labeled coordinates (e.g., A1, B3).
Players take turns placing X or O until a player wins or the game ends in a draw.

## Structure
- Main.java          > Entry point for the game
- GameLogic.java     > Manages game flow and turn switching
- Player.java        > Abstract class for players
- Human.java         > Handles human player moves
- Computer.java      > AI player logic (random moves)
- Grid.java          > Manages board state and game rules
- Square.java        > Represents each grid square with coordinates
- Symbol.java        > Defines X, O, and EMPTY symbols

## How to Play
1- Running the Game
- Compile all Java files:
> javac *.java
- Run the program:
> java Main
- Follow the on-screen instructions:
> Enter Player 1's name
> Choose to play against another human or the computer
> Take turns entering moves (e.g., A1, B3)
> The game announces a winner or a draw

2- Game Rules:
- Player 1 starts the game and a symbol is automatically assigned to the player (X or O).
- Player 2 (human or computer) gets the opposite symbol.
- Players take turns entering coordinates (e.g., A1, B3) to place their symbol.
- Winning conditions:
A player wins by getting 3 symbols in a row (horizontal, vertical, or diagonal).
If all squares are filled with no winner, the game ends in a draw.
After the game ends, players can choose to play again or exit.

## Classes & Responsibilities 
- Main : Runs the game by calling GameLogic.startGame()
- GameLogic : Controls the game loop, player turns, and win conditions
- Player : Abstract class representing a player (Human or Computer)
- Human : Handles user input for moves
- Computer : AI logic for choosing moves randomly
- Grid : Manages the board, placing symbols, and checking for wins
- Square : Represents each square with its symbol and coordinates
- Symbol : Defines X, O, and EMPTY values
