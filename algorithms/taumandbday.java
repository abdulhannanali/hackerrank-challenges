/*
 * This code hacked by Hannan Ali for HackerRank
 * With all the sweg file is named taumandbday.java		
 * send him some of your sweg at  abdulhannanali@outlook.com
 * visit his hood place at  https://abdulhannanali.github.io
 * 
 * Link to the following hacker rank problem is
 * https://www.hackerrank.com/challenges/taum-and-bday
 *
 
 	====I-HACK-WITH-A-RANK-====
 		Live to write code
 	====JUST-DO-IT-BRO-YEAH====
*/

// Pre-Defined packages to be imported
import java.lang.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.text.*;
import java.io.*;
// ==================================

// The class is going to be public
public class taumandbday{

	// Main Method
	public static void main (String[] args){
		// THE INPUT SHOULD BE READ FROM STDIN
		// THE OUTPUT SHOULD BE OUTPUT TO STDOUT

		// Instantiating Scanner object "sn" as System.in as argument
		Scanner sn = new Scanner(System.in);
		
		// Solve The Problem

		// the number of test cases to be read
		int T = sn.nextInt();

		// number of black boxes to be bought to satisfy diksha
		long B;
		// number of white boxes to be bought to satisfy diksha
		long W;

		// variables for prices of one black gift, white gift and the the cost 
		// of exchange rate among them
		long X;
		long Y;
		long Z;

		for (int i = 0; i < T; i++){
			B = sn.nextLong();
			W = sn.nextLong();
			X = sn.nextLong();
			Y = sn.nextLong();
			Z = sn.nextLong();

			System.out.println((buy(B, W, X, Y, Z)));			
		}
		

		// Solved The Problem


		// Closing the Scanner at the end of the program
		sn.close();
	
	}

	// function for exchanging and converting 
	public static long buy	( long B, long W,
							  long X, long Y, 
							  long Z)
	{
		// general amount spent returned if the conditions are false
		long amountSpent = (B * X) + (W * Y);
		if (X < Y && (X + Z) < Y){
			amountSpent = (B + W) * X;
			// adding the exchange price for W
			amountSpent += (W * Z);  
		}
		else if (Y < X && (Y + Z) < X){
			amountSpent = (B + W) * Y;

			// adding the exchange price for B
			amountSpent += (B * Z); 
		}
		return amountSpent;
	}
}
