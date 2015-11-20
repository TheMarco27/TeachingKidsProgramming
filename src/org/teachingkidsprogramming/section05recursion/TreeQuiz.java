package org.teachingkidsprogramming.section05recursion;

import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizGrader;

public class TreeQuiz extends TreeQuizAdapter
{
  public void questions1To4()
  {
    //   Question 1 
    //   doubleLength (recipe below) 
    doubleLength();
    //
    //   Question 2 
    //   decreaseTurn (recipe below) 
    //   ------------- Recipe for decreaseTurn 
    decreaseTurn();
    //
    //   Question 3 
    //   setNinety (recipe below) 
    setNinety();
    //
    //   Question 4 
    //   angleFive (recipe below) 
    angleFive();
  }
  public void angleFive()
  {
    angles.put(5, 36);
  }
  public void setNinety()
  {
    angles.put(turn, 90);
    //turn = angles.get(turn);
  }
  public void decreaseTurn()
  {
    turn = turn - 1;
  }
  public void doubleLength()
  {
    length = length * 2;
  }
  public static void main(String[] args)
  {
    new TreeQuizGrader().grade(new TreeQuiz());
  }
}
