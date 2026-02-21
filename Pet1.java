/*
  Course: CS190
  Assignment: Pet V1
  Author: Aleena Rosenzweig
  Date: 2/20/26
*/
import java.util.Scanner;
/**
   A simple virtual pet.
*/
public class Pet1
{
   /**
      A command to display information about my virtual Pet.      
      @param args command-line arguments are ignored.
   */
   public static void main(String[] args)
   {
      //create a scanner object
      Scanner userInput = new Scanner(System.in);
     
      //Variables for for name and type of animal
      String petName;
      String type = "cat";
      int wakeUp;
      int bedTime;

      
      //Variables for time numbers
      final int EARLIEST_WAKEUP = 5;
      final int LATEST_WAKEUP = 10;
      final int EARLIEST_BEDTIME = 16;
      final int LATEST_BEDTIME = 22;

      String timeAwake = "[" + EARLIEST_WAKEUP + "-" + LATEST_WAKEUP + "]";
      String timeAsleep = "[" + EARLIEST_BEDTIME + "-" + LATEST_BEDTIME + "]";

      
      //wording and calling all variables to print
      System.out.print("I love your pet, what is it's name? ");
      petName = userInput.nextLine();
      
      System.out.println(petName + " is a super duper, cutie patootie " + type + "! ");
      
      System.out.println("Here is a fun drawing of them");
      System.out.println("/\\ /\\");      
      System.out.println(">0 0<");
      System.out.println("(###)  )");      
      System.out.println(" U U  /");
      System.out.print("What time should " + petName + " wake up at? [5-10]: ");
      wakeUp = userInput.nextInt();
 
 /**  code done in class
      if (wakeUp < EARLIEST_WAKEUP || wakeUp > LATEST_WAKEUP) {
         System.out.println("!!! Invalid response. Exiting...");
         System.exit(1);
      }
      System.out.print("What time should " + petName + " go to bed at? [16-22]: ");
      bedTime = userInput.nextInt();
      if (bedTime < EARLIEST_BEDTIME || bedTime > LATEST_BEDTIME) {
         System.out.println("!!! Invalid response. Exiting...");
         System.exit(1);
      }
*/  

              
// code by self prior to class
      if (wakeUp < 5 || wakeUp > 10) {
         System.out.println("!!! Invalid response. Exiting...");
         System.exit(1);
      }

      System.out.print("What time should " + petName + " go to bed at? [16-22]: ");
      bedTime = userInput.nextInt();
   


      if (bedTime < 16 || bedTime > 22) {
         System.out.println("!!! Invalid response. Exiting...");
         System.exit(1);
      }


       //further variables which include variables (this is preforming the math)
      int firstFeeding = wakeUp + 1; 
      int secondFeeding = bedTime - 2;
      int noEating = secondFeeding - firstFeeding;
      

      
      
      System.out.println(petName + " should eat at " + firstFeeding + ":00 in the morning, and at " + secondFeeding + ":00 at night");
      System.out.println("There should be " + noEating + " hours in between their meals");
      



   
   }
}