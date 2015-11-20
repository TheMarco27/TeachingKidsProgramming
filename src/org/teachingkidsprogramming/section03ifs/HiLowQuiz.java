package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;
import org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuizGrader;

public class HiLowQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuiz
{
  public void question1()
  {
    int y = Tortoise.getY();
    if (y == 115)
    {
      Tortoise.turn(63);
    }
  }
  public void question2()
  {
    int x = Tortoise.getX();
    int y = Tortoise.getY();
    if (x < y)
    {
      Tortoise.turn(-54);
    }
    else
    {
      Tortoise.turn(22);
    }
  }
  public void question3()
  {
    //        display the message "elcomeway omehay!"
    MessageBox.showMessage("elcomeway omehay!");
  }
  public void question4()
  {
    int y = Tortoise.getY();
    if (y > 50)
    {
      Tortoise.turn(-177);
    }
    //        if the Y position of tortoise is greater than 50
    //
    //         turn the tortoise 177 degrees to the left
  }
  public static void main(String[] args)
  {
    new HiLowQuizGrader().grade(new HiLowQuiz());
  }
}
