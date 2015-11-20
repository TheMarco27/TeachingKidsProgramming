package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(10);
    int height = 200;
    slantHouse(height);
    drawHouse(50);
    triangleHouse(100);
    drawStepHouse(150);
    drawArrowHouse(60);
    drawCircleHouse(150);
    drawTitanTower(100);
  }
  //
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    flatRoof();
    Tortoise.move(height);
    buildingConnection();
  }
  //
  private static void flatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
  //
  private static void slantHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    slantyroof();
    Tortoise.move(height + 20);
    buildingConnection();
  }
  //
  private static void slantyroof()
  {
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(135);
  }
  //
  private static void triangleHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    triangleRoof();
    Tortoise.move(height);
    buildingConnection();
  }
  //
  private static void triangleRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(45);
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  //
  private static void drawStepHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    stepRoof();
    Tortoise.move(height);
    buildingConnection();
  }
  //
  private static void stepRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(10);
    Tortoise.turn(-90);
    Tortoise.move(10);
    Tortoise.turn(90);
    Tortoise.move(10);
    Tortoise.turn(-90);
    Tortoise.move(10);
    Tortoise.turn(90);
    Tortoise.move(10);
    Tortoise.turn(90);
    Tortoise.move(10);
    Tortoise.turn(-90);
    Tortoise.move(10);
    Tortoise.turn(90);
    Tortoise.move(10);
    Tortoise.turn(-90);
    Tortoise.move(10);
    Tortoise.turn(90);
  }
  //
  private static void drawArrowHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    arrowRoof(height);
    Tortoise.move(height);
    buildingConnection();
  }
  private static void arrowRoof(int height)
  {
    Tortoise.turn(-90);
    Tortoise.move(15);
    Tortoise.turn(150);
    Tortoise.move(height);
    Tortoise.turn(60);
    Tortoise.move(height);
    Tortoise.turn(150);
    Tortoise.move(15);
    Tortoise.turn(-90);
  }
  //
  private static void drawCircleHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    circleRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(100);
    Tortoise.turn(-90);
  }
  //
  private static void circleRoof()
  {
    for (int i = 0; i < 180; i++)
    {
      Tortoise.turn(3);
      Tortoise.move(1);
    }
  }
  //
  private static void drawTitanTower(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    titanRoof(height);
    Tortoise.move(height);
    buildingConnection();
  }
  //
  private static void titanRoof(int height)
  {
    Tortoise.turn(-90);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.move(55);
    Tortoise.turn(90);
    Tortoise.move(height + 50);
    Tortoise.turn(90);
    Tortoise.move(55);
    Tortoise.turn(90);
    Tortoise.move(50);
    Tortoise.turn(-90);
  }
  //
  private static void buildingConnection()
  {
    Tortoise.turn(-90);
    Tortoise.move(30);
    Tortoise.turn(-90);
  }
}