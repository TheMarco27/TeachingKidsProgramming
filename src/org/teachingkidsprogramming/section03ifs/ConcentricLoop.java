package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Pinks;
import org.teachingextensions.logo.PenColors.Yellows;
import org.teachingextensions.logo.Tortoise;

public class ConcentricLoop
{
  public static void main(String[] args)
  {
    Tortoise.setX(150);
    Tortoise.setY(200);
    Tortoise.setSpeed(10);
    for (int i = 0; i < 360; i++)
    {
      Tortoise.move(10);
      Tortoise.turn(1);
      if (i % 20 == 0)
      {
        for (int j = 0; j < 180; j++)
        {
          ColorWheel.addColor(Yellows.Gold);
          ColorWheel.addColor(Pinks.DeepPink);
          Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
          Tortoise.move(1);
          Tortoise.turn(1);
          Tortoise.setPenWidth(3);
        }
      }
    }
  }
}