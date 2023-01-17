import java.util.Scanner;
 

public class MagicEightBall {
 public static void main(String args []) {
  Scanner input = new Scanner(System.in);	
  String question;
  int count = 0;
  int magicNumber;
		
  System.out.println("Welcome to our Magic 8 Ball program!");

  do {
   
   magicNumber = (int)(Math.random() * 13); 
   System.out.println("Enter question:");
   question = input.nextLine();
   
   count++;
   
   if (!question.trim().isEmpty()) {
    System.out.print("Answer: ");
    if (magicNumber == 0) {
     System.out.println("Nah.");
    }
    else if (magicNumber == 1) {
     System.out.println("Yup.");
    }
    else if (magicNumber == 2) {
     System.out.println("Try again later.");
    }   
    else if (magicNumber == 3) {
     System.out.println("Um...");
    }   
    else if (magicNumber == 4) {
     System.out.println("Hm?");
    }   
    else if (magicNumber == 5) {
     System.out.println("What?");
    }   
    else if (magicNumber == 6) {
     System.out.println("Not sure.");
    }   
    else if (magicNumber == 7) {
     System.out.println("What was the question again?");
    }   
    else if (magicNumber == 8) {
     System.out.println("I'm positive it is a yes.");
    }   
    else if (magicNumber == 9) {
     System.out.println("Never.");
    }   
    else if (magicNumber == 10) {
     System.out.println("Never ever ever.");
    }   
    else if (magicNumber == 11) {
     System.out.println("I'm sure it's a yes.");
    }   
    else if (magicNumber == 12) {
     System.out.println("It might be a no. It might be a yes.");
    }
   }
   
  } while(!question.trim().isEmpty());

  System.out.println("The number of questions answered: " + (count - 1));
 }
}

