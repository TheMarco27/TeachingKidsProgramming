package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.PenColors.Grays;
import org.teachingextensions.logo.Tortoise;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static int length = 10;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.getBackgroundWindow().setBackground(Grays.Black);
    Tortoise.setPenWidth(20);
    Tortoise.setSpeed(10);
    for (int i = 55; i < 999999999; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      length = length + 1;
      drawTriangle();
      Tortoise.turn(1000000000 / 20000);
    }
  }
  private static void drawTriangle()
  {
    for (int i = 0; i < 6; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(3600 / 30);
    }
  }
}
