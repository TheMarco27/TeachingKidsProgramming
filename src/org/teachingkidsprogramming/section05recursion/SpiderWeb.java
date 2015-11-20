package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(2);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    double length = 10.5;
    double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      length = weaveOneLayer(length, zoom);
      //
      //        Change the current zoom so it is multiplied by 1.3 --#11
      zoom = zoom * 1.3;
    }
  }
  public static double weaveOneLayer(double length, double zoom)
  {
    //
    for (int i = 0; i < 15; i++)
    {
      drawTriangle(length);
      //
      Tortoise.turn(100800 / 25);
      length = length + zoom;
    }
    return length;
  }
  public static void drawTriangle(double length)
  {
    for (int i = 2; i < 7; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(1080 / 45);
    }
  }
}
