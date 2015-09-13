/*
 * This code hacked by Hannan Ali for HackerRank
 * With all the sweg file is named chocolatefeast.java		
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
public class chocolatefeast{

	// Main Method
	public static void main (String[] args){
		// THE INPUT SHOULD BE READ FROM STDIN
		// THE OUTPUT SHOULD BE OUTPUT TO STDOUT

		// Instantiating Scanner object "sn" as System.in as argument
		Scanner sn = new Scanner(System.in);
		
		// Solve The Problem
		int T = sn.nextInt();

		int N, C, M;
		for (int i = 0; i < T; i++){
			N = sn.nextInt();
			C = sn.nextInt();
			M = sn.nextInt();

			System.out.println(Solve(N, C, M));
		}
		
		// Solved The Problem


		// Closing the Scanner at the end of the program
		sn.close();
	}

	// Code to solve the problem will be written here
	private static long Solve(int N, int C, int M){
		long totalWrappers = 0;
		int chocosBought = N / C;
		int totalWrappers = chocosBought;
		// for every m number of wrappers we get a one more 
		// chocolate to eat
		if (chocosBought >= M){
			chocosBought +=  (chocosBought - (chocosBought % M)) / M;
		}

		return chocosBought;
	}
}
