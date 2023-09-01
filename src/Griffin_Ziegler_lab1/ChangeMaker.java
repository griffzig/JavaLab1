/* Griffin Ziegler
 * September 1, 2023
 * ChangeMaker app
 */
package Griffin_Ziegler_lab1;

import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class ChangeMaker {
	// Declare dollars and cents variables
	int dollars;
	int cents;
	double amount;

	PrintStream out = System.out;
	Scanner in = new Scanner(System.in);
	
	public ChangeMaker() {
		// Constructor
	}
	
	public double getAmount() {
		// get monetary amount to be converted
		out.println("Enter a monetary value (00.00): ");
		amount = in.nextDouble();
		return amount;
	}
	
	public int getDollars() {
		dollars = (int) amount;
		return dollars;
	}
	
	public int getCents() {
		int totalCents;
		totalCents = (int) Math.ceil(amount * 100);
		cents = totalCents % 100;
		return cents;
	}
	
	public int getTwenties() {
		return dollars / 20;
	}
	
	public int getTens() {
		return (dollars % 20) / 10;	
	}
	
	public int getFives() {
		return (dollars % 10) / 5;
	}
	
	public int getOnes() {
		return dollars % 5;
	}
	
	public int getFiftyCentPieces() {
		return cents / 50;
	}
	public int getDimes() {
		return (cents % 50) / 10;
	}
	
	public int getNickels() {
		return ((cents % 50) % 10) / 5;
	}
	
	public int getPennies() {
		return cents % 5;
	}
	
}
