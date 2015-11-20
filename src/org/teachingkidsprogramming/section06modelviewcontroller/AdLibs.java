package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    //String currentAdjective = MessageBox
    //  .askForTextInput("Enter an adjective that would describe you in the morning that is descriptive");
    String currentIngVerb = MessageBox.askForTextInput("Enter a verb that ends with -ing");
    if (currentIngVerb.isEmpty() || currentIngVerb.length() > 15)
    {
      MessageBox.showMessage("Play right or don't play at all!");
      return;
    }
    else if (currentIngVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Hey numbers are NOT verbs!");
      return;
    }
    String currentAnimal = MessageBox.askForTextInput("Enter an animal");
    String currentStory = "Today ";
    currentStory = currentStory + "I woke surprised about my prior dream. ";
    currentStory = currentStory + "In the dream, I was " + currentIngVerb + " ";
    currentStory = currentStory + "with a " + currentAnimal + ". ";
    MessageBox.showMessage(currentStory);
  }
}
