## Project Overview

This is a Java-based Tic-Tac-Toe game that allows players to compete in:
- Human vs. Human mode
- Human vs. Computer mode
The game follows the traditional 3x3 grid format with labeled coordinates (e.g., A1, B3).
Players take turns placing X or O until a player wins or the game ends in a draw.

## Structure
- Main.java          # Entry point for the game
- GameLogic.java     # Manages game flow and turn switching
- Player.java        # Abstract class for players
- Human.java         # Handles human player moves
- Computer.java      # AI player logic (random moves)
- Grid.java          # Manages board state and game rules
- Square.java        # Represents each grid square with coordinates
- Symbol.java        # Defines X, O, and EMPTY symbols
The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
"# Tic-Tac-Toe-Game" 
