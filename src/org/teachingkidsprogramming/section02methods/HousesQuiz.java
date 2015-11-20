package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends HousesQuizAdapter
{
  public void questions1Thru6()
  {
    // Question 1 
    //   small (recipe below) 
    //   ------------- Recipe for small 
    small();
    //   ------------- End of small recipe
    //
    //   Question2
    //   medium (recipe below) 
    //   ------------- Recipe for medium 
    //      set the current length to 21
    medium();
    //   ------------- End of medium recipe
    //
    //   Question3
    //   large (recipe below) 
    //   ------------- Recipe for large 
    //      set the current length to 63
    large();
    drawASide();
    //   ------------- End of turnTheCorner recipe
    //
    //   Question6
    //   drawASide (recipe below) 
    //   ------------- Recipe for drawASide 
    //      call moveTheLength and turnTheCorner
    drawASide();
    //   ------------- End of drawASide recipe
  }
  private void drawASide()
  {
    moveTheLength();
    turnTheCorner();
  }
  private void turnTheCorner()
  {
    Tortoise.turn(-360 / 3);
  }
  private void moveTheLength()
  {
    Tortoise.move(length);
  }
  private void large()
  {
    length = 63;
  }
  private void medium()
  {
    length = 21;
  }
  private void small()
  {
    length = 7;
  }
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
