package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    MessageBox.showMessage("One morning, the Tortoise woke up in a dream.");
    int answer = MessageBox.askForNumericalInput(
        "Do you want to 'wake up' or 'explore' the dream? Type 1 for wake up or 2 for explore.");
    int wake_up = 1;
    int explore = 2;
    animateStartStory();
    if (answer == wake_up)
    {
      wakeUp();
    }
    else if (answer == explore)
    {
      approchOoze();
    }
    else
    {
      badAnswer();
    }
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    java.awt.Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setBackground(color);
      Tortoise.setPenColor(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void badAnswer()
  {
    MessageBox.showMessage("You don't know how to read directions.  You can't play this game.  The End.");
  }
  private static void approchOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze, worried that you will get in trouble, you pick up the bucket.");
    int answer2 = MessageBox.askForNumericalInput(
        "Do you want to pour the ooze into the 'backyard' or 'toilet'? If backyard, type 1, if toilet, type 2");
    int toilet = 2;
    int backyard = 1;
    if (answer2 == toilet)
    {
      //
      pourIntoToilet();
    }
    //
    else if (answer2 == backyard)
    {
      pourIntoBackyard();
      int answer3 = MessageBox.askForNumericalInput(
          "As the man starts to prepare you as soup, do you...  'Scream' or 'Faint'? Type 1 for Scream or 2 for Faint.");;
      int faint = 2;
      int scream = 1;
      if (answer3 == faint)
      {
        tortoiseSoup();
      }
      else if (answer3 == scream)
      {
        startStory();
      }
      else
      {
        badAnswer();
      }
    }
    else
    {
      badAnswer();
    }
  }
  private static void tortoiseSoup()
  {
    MessageBox.showMessage("You made a delicious soup!  Yum!  The End.");
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles and explodes covering you in radio-active waste.");
    int answer4 = MessageBox.askForNumericalInput(
        "Do you want to train to be a NINJA?  'Yes' or 'HECK YES'? Type 1 for Yes or Type 2 for HECK YES.");
    int yes = 1;
    int heck_yes = 2;
    if (answer4 == yes)
    {
      ninjaTortoise();
    }
    //
    else if (answer4 == heck_yes)
    {
      ninjaTortoise();
    }
    else
    {
      badAnswer();
    }
  }
  private static void ninjaTortoise()
  {
    MessageBox.showMessage("Awesome Dude!  You live out the rest of your life fighting crimes and eating pizza!");
  }
  private static void wakeUp()
  {
    MessageBox.showMessage("You Wake up and have a boring day.  The End.");
  }
}
