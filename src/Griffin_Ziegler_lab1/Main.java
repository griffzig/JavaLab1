package Griffin_Ziegler_lab1;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		// Declare variables
		int user_choice;
		int numDice;
		int sides;
		double amount;
		
		// Simplify System.out
		PrintStream out = System.out;
		// Simplify System.in
		Scanner in = new Scanner(System.in);
		
		// user menu
		out.println("Welcome to Griffin's Lab 1!");
		out.println("Here are the applications I've built:");
		out.println("1. ChangeMaker");
		out.println("2. DiceRoller");
		out.println("3. CardDealer");
		out.println("Please select an application for testing: ");
		user_choice = in.nextInt();
		
		// user choice 1 
		if (user_choice == 1) {
			// create new ChangeMaker object
			ChangeMaker cm = new ChangeMaker();
			
			out.println("Welcome to Griffin's ChangeMaker");
			
			// Method calls
			cm.getAmount();
			cm.getDollars();
			cm.getCents();
			// Add if statements for the case
			out.println(cm.getTwenties() + " twenty dollar notes");
			out.println(cm.getTens() + " ten dollar notes");
			out.println(cm.getFives() + " five dollar notes");
			out.println(cm.getOnes() + " one dollar notes");
			out.println(cm.getFiftyCentPieces() + " fifty cent pieces");
			out.println(cm.getDimes() + " dimes");
			out.println(cm.getNickels() + " nickels");
			out.println(cm.getPennies() + " pennies");
		}
		
		// initialize DiceRoller
		else if (user_choice == 2) {
			// create new DiceRoller object
			DiceRoller dr = new DiceRoller();
			
			out.println("Welcome to Griffin's DiceRoller");
			
			// prompt user input for numDice
			dr.getNumDice();
			// prompt user input for sides
			dr.getSides();
			
			// random # generator
			DiceRoller.getRandNum();
			
			out.println("You rolled: " + Arrays.toString(dr.getRolls()));
			out.println("Your total is: " + dr.getSum());
		}
		
		// initialize CardDealer
		else if (user_choice == 3) {
			// create new CardDealer object
			CardDealer cd = new CardDealer();
			
			out.println("Welcome to Griffin's CardDealer");
			out.println("Here are your lucky cards: ");
			for (int i = 0; i < 5; i--) {
				out.println(CardDealer.drawHand());
			}
		}
		
		// invalid input error
		else {
			out.println("ERROR: Invalid input.");
		}
		
	}
}

