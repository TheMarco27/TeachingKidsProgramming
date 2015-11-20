package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    // Random randomGenerator = new Random();
    // maxGuessValue = MessageBox.askForNumericalInput("What do you want to be the maximum guess value?");
    //  answer = randomGenerator.nextInt(maxGuessValue + 1);
    //    MessageBox.showMessage("Answer is:" + answer);
    // numberOfGuesses = MessageBox.askForNumericalInput("How many guesses do you want?");
    int choice = MessageBox.askForNumericalInput("Do you want to play an easy (1), medium(2), or hard game(3)?");
    int maxGuessValue = 100;
    Random randomGenerator = new Random();
    int answer = randomGenerator.nextInt(maxGuessValue);
    int easy = 1;
    int medium = 2;
    int hard = 3;
    int numberOfGuesses = 0;
    if (choice == easy)
    {
      maxGuessValue = 51;
      numberOfGuesses = 5;
      Random randomGeneratorEasy = new Random();
      answer = randomGeneratorEasy.nextInt(maxGuessValue);
      for (int i = 0; i < numberOfGuesses; i++)
      {
        int guess = MessageBox.askForNumericalInput("Guess a number between 1 and " + (maxGuessValue - 1) + "!");
        if (guess == answer)
        {
          Sounds.playBeep();
          MessageBox.showMessage("You guessed the answer in:" + "_" + (i + 1) + "tries");
          MessageBox.showMessage("You Win!!!");
          System.exit(0);
        }
        else
        {
          if (guess > answer)
          {
            MessageBox.showMessage("Too High!");
          }
          if (guess < answer)
          {
            MessageBox.showMessage("Too low!");
          }
        }
        MessageBox.showMessage("You have " + (numberOfGuesses - i - 1) + " guesses left!");
      }
      MessageBox.showMessage("You took too many tries. You Lose!");
      MessageBox.showMessage("Answer is:" + answer);
    }
    else if (choice == hard)
    {
      maxGuessValue = 151;
      numberOfGuesses = 10;
      for (int i = 0; i < numberOfGuesses; i++)
      {
        int guess = MessageBox.askForNumericalInput("Guess a number between 1 and " + (maxGuessValue - 1) + "!");
        if (guess == answer)
        {
          Sounds.playBeep();
          MessageBox.showMessage("You guessed the answer in:" + (i + 1) + "tries");
          MessageBox.showMessage("You Win!!!");
          System.exit(0);
        }
        else
        {
          if (guess > answer)
          {
            MessageBox.showMessage("Too High!");
          }
          if (guess < answer)
          {
            MessageBox.showMessage("Too low!");
          }
        }
        MessageBox.showMessage("You have " + (numberOfGuesses - i - 1) + " guesses left!");
      }
      MessageBox.showMessage("You took too many tries. You Lose!");
      MessageBox.showMessage("Answer is:" + answer);
    }
    else if (choice == medium)
    {
      maxGuessValue = 101;
      numberOfGuesses = 8;
      for (int i = 0; i < numberOfGuesses; i++)
      {
        int guess = MessageBox.askForNumericalInput("Guess a number between 1 and " + (maxGuessValue - 1) + "!");
        if (guess == answer)
        {
          Sounds.playBeep();
          MessageBox.showMessage("You guessed the answer in: " + (i + 1) + " tries");
          MessageBox.showMessage("You Win!!!");
          System.exit(0);
        }
        else
        {
          if (guess > answer)
          {
            MessageBox.showMessage("Too High!");
          }
          if (guess < answer)
          {
            MessageBox.showMessage("Too low!");
          }
        }
        MessageBox.showMessage("You have " + (numberOfGuesses - i - 1) + " guesses left!");
      }
      MessageBox.showMessage("You took too many tries. You Lose!");
      MessageBox.showMessage("Answer is:" + answer);
    }
  }
}
