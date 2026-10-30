import java.util.Scanner;
import java.util.Random;

public class Guesser{
	public static void main(String[] args){
		Guesser G = new Guesser();
	}// end main

	public void Guesser(){
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		while(keepGoing){
			menuPrint();
			String response = input.nextLine();

			if (response.equals("0")){
				keepGoing = false;
			}
			else if (response.equals("1")){
				System.out.println("HumanGuesser");
			}
			else if (response.equals("2")){
				System.out.println("ComputerGuesser");
			}
			else
				System.out.print("incorrect input");
		}//end while
		System.out.print("Goodbye!");	
	}//end menuLoop
	
	public void menuPrint(){
		System.out.println("press 0 to quit");
		System.out.println("press 1 to start human guesser");
		System.out.println("press 2 to start computer guesser");
	}//end print
	

	public void ComputerGuesser(){
		int min = 1;
		int max = 100;
		boolean keepGoing = true;
		Scanner input = new Scanner(System.in);
		while(keepGoing){
			int CAnswer = (max - min);
			System.out.println("my guess is" + CAnswer);
			System.out.println("Is this (C)orrect, Too (H)igh or too (L)ow?");
			String response = input.nextLine();
			if (response.equals("C")){
				System.out.println("Great! Thanks for playing with me!");
				keepGoing = false;
			}//end if
			else if (response.equals("H"))
				max = CAnswer;

			else if (response.equals("L"))
				min = CAnswer;
		}//end while
	}//end ComputerGuesser
	
	public void HumanGuesser(){
		int min = 1;
		int max = 100;
		Random rand = new Random();
		int Answer = rand.nextInt((max-min)+1) + 1;
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		while(keepGoing){
			System.out.println("Enter your guess!");
			String response = input.nextLine();
			int guess = Integer.parseInt(response);
			if (Answer == guess){
				System.out.println("Correct!");
				keepGoing = false;
			}//end if correct

			else if (guess < Answer)
				System.out.println("too low");

			else if (guess > Answer) 
				System.out.println("too high");
			
			else 
				System.out.println("please enter an int");
		}// end while
	}//end HumanGuesser
}// end Guesser def
