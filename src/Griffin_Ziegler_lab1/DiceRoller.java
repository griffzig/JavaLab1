/* Griffin Ziegler
 * September 1, 2023
 * DiceRoller app
 */
package Griffin_Ziegler_lab1;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
	
	PrintStream out = System.out;
	Scanner in = new Scanner(System.in);
	
	// declare class variables
	public int numDice;
	static int sides;
	int sum;
	int[] rolls;
	
	public DiceRoller() {
		// Constructor
		sum = 0;
	}
	
	public int getNumDice() {
		// prompt user for # of dice
		out.println("Enter number of dice: ");
		numDice = in.nextInt();
		
		return numDice;
	}
	
	public int getSides() {
		// prompt user for # of sides
		out.println("Enter number of sides on each die: ");
		sides = in.nextInt();
		
		return sides;
	}
	
	public static int getRandNum() {
		// generate random numbers
		return (new Random().nextInt(sides));
	}
	
	public int[] getRolls() {
		// initialize the array
		rolls = new int[numDice];
		// roll the dice
		for (int i = 0; i < numDice; i++) {
			rolls[i] = getRandNum();
		}
		
		return rolls;
	}
	
	public int getSum() {
		for (int i = 0; i < numDice; i++) {
			sum += rolls[i];
		}
		
		return sum;
	}
}
