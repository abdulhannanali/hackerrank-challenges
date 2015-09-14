/*
 * This code hacked by Hannan Ali for HackerRank
 * With all the sweg file is named encryption.java		
 * send him some of your sweg at  abdulhannanali@outlook.com
 * visit his hood place at  https://abdulhannanali.github.io
 * 
 * Link to the following hacker rank problem is
 * https://www.hackerrank.com/challenges/encryption
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
public class encryption{

	// Main Method
	public static void main (String[] args){
		// THE INPUT SHOULD BE READ FROM STDIN
		// THE OUTPUT SHOULD BE OUTPUT TO STDOUT

		// Instantiating Scanner object "sn" as System.in as argument
		Scanner sn = new Scanner(System.in);
		
		// Solve The Problem
		String inputLine = sn.nextLine();
		int L = inputLine.length();

		int rows = Math.floor(sqrt(L));
		int columns = Math.ceil(sqrt(L));		

		// The 2d array to store the seperate characters in rows and coloumns.
		// Encryption technique in the problem involves the use of array

		String[] inputArray = new String[rows][columns]; 

		for (int i = 0; i < rows; i++){
			for (int j = 0; j < columns; j++){

				inputArray[i][j] = inputLine.charAt(i * j);
			}
		}

		// Solved The Problem


		// Closing the Scanner at the end of the program
		sn.close();
	}
}