/*
 * This code hacked by Hannan Ali for HackerRank
 * With all the sweg file is named cutthesticks.java		
 * send him some of your sweg at  abdulhannanali@outlook.com
 * visit his hood place at  https://abdulhannanali.github.io 
 *
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
public class cutthesticks{

	// Main Method
	public static void main (String[] args){
		// THE INPUT SHOULD BE READ FROM STDIN
		// THE OUTPUT SHOULD BE OUTPUT TO STDOUT

		// Instantiating Scanner object "sn" as System.in as argument
		Scanner sn = new Scanner(System.in);
		
		// Solve The Problem

		// n number of sticks given for the first time
		int n = sn.nextInt();

		// array for the n number of stciks
		int sticks = new int[n];

		for (int i = 0; i < n; i++){
			sticks[i] = sn.nextInt();
		}

		Arrays.sort(sticks);

		// numberOfSticks that are cut for each operation
		int cutSticks;
		int lengthCut;
		
		// performing cut operation on all the sticks
		for (int j = 0; j < cutSticks.length; j++){
			lengthCut = minimumLength(sticks);
			
		}

		// Solved The Problem


		// Closing the Scanner at the end of the program
		scanner.close();
	}

	// returns the minimum length stick 
	static int minimumLength(int[] sticks){
		for (int i = 0; i < sticks.length; i++){
			if (sticks <= 0){
				continue;
			}
			else {
				return sticks[i];
			}

		}
	}
}
