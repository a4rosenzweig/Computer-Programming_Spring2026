//AL - Computer programming, Spring 2026: Pet Version 0
public class Pet0
{
   public static void main(String[] args)
   {
      //Variables for for name and type of animal
      String petName = "Flouffy";
      String type = "cat";
      
      //Variables for time numbers
      int wakeUp = 6;
      int bedTime = 21;
      //further variables which include variables (this is preforming the math)
      int firstFeeding = wakeUp + 1; 
      int secondFeeding = bedTime - 2;
      int noEating = secondFeeding - firstFeeding;
      
      //wording and calling all variables to print
      System.out.println("I love my pet " + petName);
      System.out.println(petName + " is a super duper, cutie patootie " + type);
      System.out.println("/\\ /\\");      
      System.out.println(">0 0<");
      System.out.println("(###)  )");      
      System.out.println(" U U  /");
      System.out.println(petName + " should eat at " + firstFeeding + ":00 in the morning, and at " + secondFeeding + ":00 at night");
      System.out.println("There should be " + noEating + " hours in between their meals");
   
   }
}