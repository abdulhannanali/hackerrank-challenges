/*
 * This code hacked by Hannan Ali for HackerRank
 * With all the sweg file is named cavitymap.java		
 * send him some of your sweg at  abdulhannanali@outlook.com
 * visit his hood place at  https://abdulhannanali.github.io
 * 
 * Link to the following hacker rank problem is
 * https://www.hackerrank.com/challenges/cavity-map
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
public class cavitymap{

	// Main Method
	public static void main (String[] args){
		// THE INPUT SHOULD BE READ FROM STDIN
		// THE OUTPUT SHOULD BE OUTPUT TO STDOUT

		// Instantiating Scanner object "sn" as System.in as argument
		Scanner sn = new Scanner(System.in);
		
		// Solve The Problem

		int N = sn.nextInt();
		sn.nextLine();

		int[][] intArray = new int[N][N];

		// N number of integers in one row are given consecutively 
		// without any line breaks 
		// So first the line is split into seperate characters
		char[] currentLineArray;

		// storing values in the cells by reading from input
		for (int i = 0; i < N; i++){
			currentLineArray = sn.nextLine().toCharArray();
			for (int j = 0; j < currentLineArray.length; j++){
				intArray[i][j] = currentLineArray[j] - '0';
				// intArray[i][j] = Integer.parseInt(currentLineArray[j]);
				// can't check the cavity here cos we haven't read the whole array yet
				// so we can't make all the comparisons
			}

		}

		// omitting side elements from the check by starting from 1 and 
		// iterating upto  < N - 1
		for (int l = 1; l < N - 1; l++){
			for (int m = 1; m < N -1; m++){
				// is intArray[l][m] greater than all the 
				// adjacent elements
				if (intArray[l][m] > intArray[l + 1][m] &&
					intArray[l][m] > intArray[l - 1][m] &&
					intArray[l][m] > intArray[l][m + 1] &&
					intArray[l][m] > intArray[l][m - 1]){
				
					intArray[l][m] = Integer.MIN_VALUE;				

				}
			}
		}

		// printing out all the elements
		for (int i = 0; i < N; i++){
			for (int j = 0; j < N; j++){
				if (intArray[i][j] == Integer.MIN_VALUE){
					System.out.print("X");
				}
				else {
					System.out.print(intArray[i][j]);
				}
			}

			// new line character after each row is completed 
			System.out.println();
		}



		// Solved The Problem


		// Closing the Scanner at the end of the program
		sn.close();
	}
}
