package org.teachingkidsprogramming.section04mastery;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber
{
  public static int     maxValue, guess, answer, numTries;
  public static Scanner scan;
  public static Random  generator;
  public static void main(String[] args)
  {
    scan = new Scanner(System.in);
    generator = new Random();
    System.out.println("You need to guess a number between 0 and what number?");
    maxValue = scan.nextInt();
    if (maxValue < 0 || maxValue > 10000)
    {
      System.out.println("Your maximum value is not valid");
      System.exit(0);
    }
    answer = generator.nextInt(maxValue);
    System.out.println("So you shall have to guess between 0 and " + maxValue);
    while (guess != answer)
    {
      guess = scan.nextInt();
      numTries++;
      if (guess < answer)
      {
        System.out.println("Too Low! Try again!");
      }
      if (guess > answer)
      {
        System.out.println("Too high! Try again!");
      }
    }
    if (guess == answer)
    {
      System.out.println("Congrats you win!! You guessed the number in " + numTries + " tries! ");
    }
  }
}
