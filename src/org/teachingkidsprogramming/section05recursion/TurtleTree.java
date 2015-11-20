package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.PenColors.Grays;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.windows.MessageBox;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static int input  = MessageBox
      .askForNumericalInput("What do you want to be the height of your tree? (numbers 5-100 recommended)");
  public static int angle1 = input;
  public static int angle2 = -2 * angle1;
  public static void main(String[] args)
  {
    Tortoise.setAnimal(Animals.Unicorn);
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(Grays.Black);
    int branch = 60;
    drawBranch(branch);
  }
  public static void drawBranch(int branch)
  {
    //
    if (branch > 0)
    {
      adjustColor(branch);
      Tortoise.move(branch);
      drawLowerBranches(branch);
    }
  }
  public static void adjustColor(int branch)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    Tortoise.setPenColor(colors.get(branch));
    Tortoise.setPenWidth(50);
  }
  public static void drawLowerBranches(int branch)
  {
    //
    Tortoise.turn(angle1);
    //
    drawShorterBranch(branch);
    //
    Tortoise.turn(angle2);
    drawShorterBranch(branch);
    Tortoise.turn(angle1);
    adjustColor(branch);
    Tortoise.move(-branch);
  }
  public static void drawShorterBranch(int branch)
  {
    drawBranch(branch - 10);
  }
}