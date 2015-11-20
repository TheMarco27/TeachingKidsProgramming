package org.teachingkidsprogramming.section04mastery;

import java.util.Scanner;

import org.teachingextensions.approvals.lite.util.ThreadUtils;

public class Password
{
  public static Scanner scan;
  public static int     password, guess, numTries;
  public static void main(String[] args)
  {
    scan = new Scanner(System.in);
    int password = 1234;
    numTries = 5;
    firstAttempt(password);
    System.out.println("You have exceeded the valid number of attempts.");
    System.out.println("You shall have to wait 10 seconds before you can re-enter a password.");
    ThreadUtils.sleep(10000);
    secondAttempt(password);
  }
  public static void secondAttempt(int password)
  {
    numTries = 5;
    firstAttempt(password);
    System.out.println("You have exceeded the valid number of attempts. You are locked out!");
    System.exit(0);
  }
  public static void firstAttempt(int password)
  {
    System.out.println("Enter Password:");
    for (int i = 0; i < 5; i++)
    {
      numTries--;
      guess = scan.nextInt();
      if (guess == password)
      {
        System.out.println("Welcome!");
        System.exit(0);
      }
      if (guess != password && numTries == 1)
      {
        System.out.println("Password incorrect, You have " + numTries + " try left! Try again!");
      }
      if (guess != password && numTries > 1)
      {
        System.out.println("Password incorrect, You have " + numTries + " tries left! Try again!");
      }
    }
  }
}
