package controlFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
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
		
		ArrayList<String> questions = new ArrayList<>();
	    
		questions.add("What is your pet name?");
		questions.add("What is your lucky number?");
		questions.add("What is two-digit model year of their car?");
		questions.add("What is the first name of the your favorite actor or actress?");
		questions.add("What is your favorite color?");
		questions.add("Where is your dream vacation country?");
		questions.add("Pick a number between 1 - 50");
	    
	    ArrayList<String> answers = new ArrayList<>();
	    ArrayList<Integer> jackpot = new ArrayList<>();
	    
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Enter your name:");     // type a word and hit enter
		String inputName = userInput.nextLine();
		System.out.printf("Hello %s\n", inputName);
		
		System.out.println("Do you wish to continue to the interactive portion? (y/n)");
		String userResponse = userInput.nextLine();
		
		if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
			//need to add the survey question
			for (String question: questions) {
				System.out.println(question);
				String resp =userInput.nextLine();
				answers.add(resp);
		}
		userInput.close();
	} else { // anything other than y or yes response goes to exit
			System.out.printf("Okay %s, please return later to complete the survey.\n", inputName);
			userInput.close();
			System.exit(0);	

		}
		jackpot = genNumbers(answers);
		
		System.out.print("Your lottery numbers are: ");
		
		for(Integer lottoNumber :jackpot) {
			if(jackpot.indexOf(lottoNumber) < jackpot.size ()-1) {
				System.out.printf("%d, ", lottoNumber);
			} else {
				System.out.printf("and the Magic Ball is: %d", lottoNumber);
			}
		}
		
	}


	private static ArrayList<Integer> genNumbers(ArrayList<String> ansStrings) {
		ArrayList<Integer> numbers = new ArrayList<>(); 
		
		Random random = new Random();
		Integer randOne = random.nextInt(75)+1;
		Integer randTwo = random.nextInt(75)+1;
		Integer randThree = random.nextInt(75)+1;
////		
		Integer numZero = 0;
				if(ansStrings.get(0).length () > 2) {
					Character charZero = ansStrings.get(0).charAt(2);
					
					Integer numZero = 0;
					if(ansStrings.get(0).length() > 2) {
						Character charZero1 = ansStrings.get(0).charAt(2);
						numZero = Character.getNumericValue(charZero1);
					} else {
						Character charZero1 = ansStrings.get(0).charAt(0);
						numZero = Character.getNumericValue(charZero1);
					}
					while(numZero < 1 || numZero > 65) {
						if(numZero < 1) {
							numZero += 23;
						} else if(numZero >65) {
							numZero -= 17;
						}
					}
					numbers.add(numZero);		
					
					
					Integer numOne = Integer.parseInt(ansStrings.get(1)) + Integer.parseInt(ansStrings.get(6));
					while(numOne > 65) {
						numOne -= 35;	
					}
					numbers.add(numOne);
					
					Integer numTwo = Integer.parseInt(ansStrings.get(5)) - randOne;
					while(numTwo < 1) {
						numTwo += 10;
					}
					numbers.add(numTwo);
					
					Integer numThree = Character.getNumericValue(ansStrings.get(2).charAt(0)) + randTwo;
					while(numThree > 65) {
						numThree -= 22;
					}
					numbers.add(numThree);
					
					Integer numFour = 0;		
					numFour = Character.getNumericValue(ansStrings.get(4).charAt(0)) + Character.getNumericValue(ansStrings.get(3).charAt(ansStrings.get(3).length()-1));
					while(numZero > 65) {
						numZero -= 33;
					}
					numbers.add(numFour);
					
					Collections.sort(numbers);
					
					Integer magicNum = Integer.parseInt(ansStrings.get(6)) + randOne - randTwo + randThree;
					while(numThree > 75) {
						numThree -= 51;
					}
					numbers.add(magicNum);

	
					return numbers;

				}

	}
	
}


