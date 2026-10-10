# Java Console Games Collection

## Overview

Java Console Games Collection is a collection of interactive console-based projects developed using Java. The application brings together several games and programming exercises through a single menu, allowing users to select and run different programs.

The project demonstrates fundamental programming concepts, object-oriented design, random number generation, mathematical calculations, and interactive command-line applications.

## Features

- **Dice Simulator:** Rolls two dice and displays their results.
- **Random Card Generator:** Generates and displays 20 randomly selected playing cards.
- **Rectangle Calculator:** Calculates the perimeter, area, and diagonal length of a rectangle and displays an ASCII representation.
- **BoxCars Simulation:** Simulates 1,000 pairs of dice rolls and calculates how often both dice land on six.
- **Yahtzee Hand Evaluator:** Rolls five dice and identifies combinations such as three of a kind, four of a kind, full house, and straights.
- **Pig Dice Game:** Implements a turn-based dice game against a computer opponent, with scores and a target of 100 points.
- **High Card Game:** Compares randomly generated playing cards between the player and the computer, tracking the score over multiple rounds.

## Technologies

- **Language:** Java
- **Input:** `Scanner`
- **Randomization:** `Math.random()` and `Random`
- **Data Structures:** Arrays
- **Core Concepts:** Object-Oriented Programming (OOP), classes, objects, constructors, methods, loops, conditionals, and `switch` statements
- **Output:** Console text and ASCII art

## Project Structure

The project is organized into separate Java classes, each responsible for a specific feature.

| Class | Responsibility |
|---|---|
| `MainMenu.java` | Displays the main menu and launches selected projects. |
| `Dados.java` | Simulates dice rolls and displays dice artwork. |
| `Dice.java` | Represents a six-sided die for the Yahtzee project. |
| `Carta.java` | Generates playing cards and displays them using ASCII art. |
| `Rectangulo.java` | Calculates rectangle measurements and draws an ASCII rectangle. |
| `BoxCars.java` | Simulates repeated dice rolls and calculates the frequency of double sixes. |
| `Yahtzee.java` | Evaluates combinations formed by five dice. |
| `Cerdo.java` | Implements the Pig dice game against a computer opponent. |
| `CartaAlta.java` | Implements a High Card game between the player and the computer. |

## How It Works

When the application starts, the main menu presents a list of available projects. The user selects an option, and the corresponding class executes its functionality.

Some projects use random values to simulate dice rolls or playing cards. Others process user input, calculate mathematical results, or apply game rules to determine scores and outcomes.

The menu repeats until the user chooses the exit option.

## Concepts Demonstrated

- Designing programs with multiple classes
- Creating objects with constructors
- Encapsulation through private fields and public methods
- Using arrays and loops to process data
- Generating random values
- Applying mathematical formulas
- Implementing game rules and score tracking
- Formatting console output with ASCII art
- Organizing multiple programs through a central menu

## Future Improvements

- Improve input validation and handle unexpected user input.
- Prevent duplicate cards when dealing a hand from a standard deck.
- Refine game rules and test edge cases.
- Improve Yahtzee hand evaluation and scoring.
- Separate reusable game logic from console presentation.
- Add automated tests.
- Provide clearer setup and execution instructions for different Java environments.

## Project Background

This collection was developed as a programming project to practice Java fundamentals through games and interactive exercises. It represents my experience applying programming logic, mathematical reasoning, and object-oriented concepts to practical problems.

I included this project in my GitHub portfolio to document my progress as a programmer and continue building skills relevant to software development internships.

---

## Screenshots

### Dice Project
![Dice Project](<Screenshot 2026-10-10 164446.png>)

### Letters Project
![Letters Project](<Screenshot 2026-10-10 164511.png>)

### Rectangle Project
![Rectangle Project](<Screenshot 2026-10-10 164523.png>)

### BoxCars Project
![BoxCars Project](<Screenshot 2026-10-10 164552.png>)

### Yahtzee Project
![Yahtzee Project](<Screenshot 2026-10-10 164600.png>)

### Pig Project
![Pig Project](<Screenshot 2026-10-10 164615.png>)

**Note:** This project is intended for educational purposes. Some games use simplified rules, and the implementation may differ from official versions.
