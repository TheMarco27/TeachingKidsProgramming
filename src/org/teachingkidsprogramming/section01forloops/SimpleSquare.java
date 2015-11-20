package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    //  Show the tortoise --#1
    //  Make the tortoise move as fast as possible --#6
    //  Do the following 4 times --#5.1
    for (int i = 0; i < 100000; i++)
    {
      Tortoise.setSpeed(10);
      Tortoise.setPenWidth(8);
      Tortoise.setPenColor(Reds.Red);
      Tortoise.show();
      Tortoise.moveTo(0, 0);
      Tortoise.move(50);
      Tortoise.turn(90);
      for (int j = 0; j < 5; j++)
      {
      }
    }
  }
}
