package controlFlow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//	System.out.println("Hello WOrld");
		
//	System.out.println("Numbers:");
//	AsciiChars.printNumbers();
//	System.out.println("Lowercase letters:");
//	AsciiChars.printLowerCase();
//	System.out.println("Uppercase letters");
//	AsciiChars.printUpperCase();
//			
		Scanner userInput = new Scanner (System.in);
		System.out.println("Enter your name:");     // type a word and hit enter
		String inputName = userInput.nextLine();
		System.out.printf("Hello %s\n", inputName);
		
		System.out.println("Do you wish to continue to the interactive portion? (y/n)");
		String userResponse = userInput.nextLine();
		
		if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
			//need to add the survey question
		} else { // anything other than y or yes response goes to exit
			System.out.printf("Okay %s, please return later to complete the survey.\n", inputName);
			userInput.close();
			System.exit(0);
			
			
		}
		
		userInput.close();
	}

}
