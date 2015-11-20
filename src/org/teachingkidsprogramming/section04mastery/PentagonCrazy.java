package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Blues;
import org.teachingextensions.logo.PenColors.Purples;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  public static void drawPentagon()
  {
    //Random randomGenerator = new Random(); 
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      Tortoise.move(i / 229);
      Tortoise.turn(360 / 10);
      Tortoise.turn(1);
    }
  }
  public static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //    Tortoise.setPenWidth();
    if (Tortoise.getPenWidth() > 4)
    {
      Tortoise.setPenWidth(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Blues.SteelBlue);
    ColorWheel.addColor(Blues.SlateBlue);
    ColorWheel.addColor(Purples.DarkOrchid);
    ColorWheel.addColor(Blues.Teal);
    ColorWheel.addColor(Purples.Indigo);
  }
}
