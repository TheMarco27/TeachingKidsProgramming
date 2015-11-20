package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Evens_2
{
  public static void main(String[] args)
  {
    int div = MessageBox.askForNumericalInput("What multiple do you want your number to go to?");
    int Numbers = MessageBox.askForNumericalInput("How high do you want the numbers to go?");
    for (int i = 0; i < Numbers; i++)
    {
      if (i % div == 0)
      {
        System.out.println(i);
      }
    }
  }
}
