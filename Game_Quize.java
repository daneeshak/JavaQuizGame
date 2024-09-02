import java.util.Scanner;
 public class Game_Quize{ 
  public static void main(String[] args) { 
  Scanner scanner = new Scanner(System.in); 
  
  int score = 0; 
  final int TOTAL_QUESTIONS = 10; 
	
// User inputs for group details
  System.out.print("Enter your group name: ");
  String groupName = scanner.nextLine();

  System.out.print("Enter your name: ");
  String userName = scanner.nextLine();

  System.out.print("Enter your NIC: ");
  String nic = scanner.nextLine();

  System.out.print("Enter your student number: ");
  String studentNumber = scanner.nextLine();

  System.out.print("Enter your batch: ");
  String batch = scanner.nextLine();

  System.out.println("Welcome to the Java IT Quiz Game!");
  System.out.println("Developed by 2nd Group");
  
  
  // Question 1 
  System.out.println("\nQuestion 1: What does 'CPU' stand for?");
  System.out.println("\nA) Central Processing Unit\nB) Control Processing Unit\nC) Computer Primary Unit\nD) Central Program Unit");
  System.out.print("\nYour answer (A/B/C/D): ");

  String answer = scanner.nextLine().toUpperCase(); 
  if (answer.equals("A")) { 
  System.out.println("Correct!"); 
  score += 1; 
  }
    else { 
    System.out.println("Incorrect. The correct answer is A) Central Processing Unit.");
	}
	
  // Question 2
  System.out.println("\nQuestion 2: What is the purpose of an 'if' statement in programming?");
  System.out.println("\nA) To store data\nB) To make decisions\nC) To loop a code block\nD) To define a function");
  System.out.print("\nYour answer (A/B/C/D): ");

  answer = scanner.nextLine().toUpperCase(); 
   if (answer.equals("B")) { 
   System.out.println("Correct!"); 
   score += 1; 
   }
    else { 
    System.out.println("Incorrect. The correct answer is B) To make decisions.");
	}
	
  // Question 3
  System.out.println("\nQuestion 3: Which programming language is known for its simplicity and readability?");
  System.out.println("\nA) C++\nB) Java\nC) Python\nD) Assembly");
  System.out.print("\nYour answer (A/B/C/D): ");

  answer = scanner.nextLine().toUpperCase(); 
   if (answer.equals("C")) { 
   System.out.println("Correct!"); 
   score += 1; 
   }
    else { 
    System.out.println("Incorrect. The correct answer is C) Python.");
	}
	
  // Question 4
  System.out.println("\nQuestion 4: In HTML, what does 'HTML' stand for?");
  System.out.println("\nA) HyperText Markup Language\nB) HyperType Markup Language\nC) Home Tool Markup Language\nD) Hyper Tool Markup Language");
  System.out.print("\nYour answer (A/B/C/D): ");

  answer = scanner.nextLine().toUpperCase(); 
   if (answer.equals("A")) { 
   System.out.println("Correct!"); 
   score += 1; 
   }
    else { 
    System.out.println("Incorrect. The correct answer is A) HyperText Markup Language.");
	}

  // Question 5
  System.out.println("\nQuestion 5: What is a loop in programming?");
  System.out.println("\nA) A way to repeat a block of code\nB) A decision-making statement\nC) A function\nD) A variable");
  System.out.print("\nYour answer (A/B/C/D): ");

  answer = scanner.nextLine().toUpperCase(); 
   if (answer.equals("A")) { 
   System.out.println("Correct!"); 
   score += 1; 
   }
    else { 
    System.out.println("Incorrect. The correct answer is A) A way to repeat a block of code.");
	}

  // Question 6
  System.out.println("\nQuestion 6: Which data type would you use to store a true or false value?");
  System.out.println("\nA) Integer\nB) String\nC) Boolean\nD) Float");
  System.out.print("\nYour answer (A/B/C/D): ");

  answer = scanner.nextLine().toUpperCase(); 
   if (answer.equals("C")) { 
   System.out.println("Correct!"); 
   score += 1; 
   }
    else { 
    System.out.println("Incorrect. The correct answer is C) Boolean.");
	}
	
  // Question 7
  System.out.println("\nQuestion 7: What is the use of the 'for' loop?");
  System.out.println("\nA) To define a block of code\nB) To repeat a block of code\nC) To stop the execution of a program\nD) To store data");
  System.out.print("\nYour answer (A/B/C/D): ");

  answer = scanner.nextLine().toUpperCase(); 
   if (answer.equals("B")) { 
   System.out.println("Correct!"); 
   score += 1; 
   }
    else { 
    System.out.println("Incorrect. The correct answer is B) To repeat a block of code.");
	}

	
  // Question 8
  System.out.println("\nQuestion 8: Which symbol is used to terminate a statement in C++?");
  System.out.println("\nA) .\nB) ,\nC) ;\nD) :");
  System.out.print("\nYour answer (A/B/C/D): ");

  answer = scanner.nextLine().toUpperCase(); 
   if (answer.equals("C")) { 
   System.out.println("Correct!"); 
   score += 1; 
   }
    else { 
    System.out.println("Incorrect. The correct answer is C) ;.");
	}
	
  // Question 9
  System.out.println("\nQuestion 9: In Python, what keyword is used to define a function?");
  System.out.println("\nA) def\nB) func\nC) function\nD) define");
  System.out.print("\nYour answer (A/B/C/D): ");

  answer = scanner.nextLine().toUpperCase(); 
   if (answer.equals("A")) { 
   System.out.println("Correct!"); 
   score += 1; 
   }
    else { 
    System.out.println("Incorrect. The correct answer is A) def.");
	}
	
  // Question 10
  System.out.println("\nQuestion 10: What does IDE stand for in software development?");
  System.out.println("\nA) Integrated Development Environment\nB) Integrated Debugging Environment\nC) Interactive Development Engine\nD) Integrated Device Environment");
  System.out.print("\nYour answer (A/B/C/D): ");

  answer = scanner.nextLine().toUpperCase(); 
   if (answer.equals("A")) { 
   System.out.println("Correct!"); 
   score += 1; 
   }
    else { 
    System.out.println("Incorrect. The correct answer is A) Integrated Development Environment.");
	}

	

   // Final score 
   double percentage = (score/(double)TOTAL_QUESTIONS)*100 ;
   System.out.println("\nQuiz completed!" + "\nYour score: " + score + " out of " + TOTAL_QUESTIONS);
   System.out.println("Your total percentage: " + percentage);
  
   //Final Grading Calculation on below
   if (percentage >= 70) { 
   System.out.println("Great job!");  
   }
   else { 
   System.out.println("Better luck next time!"); 
   }    
 //Display user details
   System.out.println("\n-- Your Details --");
   System.out.println("Name: " + userName);
   System.out.println("NIC: " + nic);
   System.out.println("Student Number: " + studentNumber);
   System.out.println("Batch: " + batch);
   
   scanner.close();
  
   
 
 }
 
}
