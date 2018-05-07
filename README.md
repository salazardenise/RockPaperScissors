This is a Rock Paper Scissors game implemented in Java. User has option to play another human, play a computer, view the history of games played so far, and quit the game. Run Main.java to play.

There are 3 packages in src: game, helper and test. The game logic is in the game package and it consists of classes GameDriver, GameState, Player and Main. The helper package has 3 classes that help with the game logic: Constants, Validator, and Prompter. Constants contains String constants used throughout the project. Prompter is used to prompt the menu and the play options to the user. Exception handling is accomplished in the Prompter class when an input is taken from the user via Java's Scanner class. The prompts loop till the user enters an acceptable input. Validator validates user input. The test package tests classes from the game package and helper package.

Enjoy the game!
