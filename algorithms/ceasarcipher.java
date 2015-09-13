/*
 * This code hacked by Hannan Ali for HackerRank
 * With all the sweg file is named ceasarcipher.java		
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
public class ceasarcipher{

	// Main Method
	public static void main (String[] args){
		// THE INPUT SHOULD BE READ FROM STDIN
		// THE OUTPUT SHOULD BE OUTPUT TO STDOUT

		// Instantiating Scanner object "sn" as System.in as argument
		Scanner sn = new Scanner(System.in);
		
		// Solve The Problem

		int N = sn.nextInt();
		sn.nextLine();

		String S = sn.nextLine();

		int K = sn.nextInt();

		char[] alphabetsArray = S.toCharArray();

		for (int i = 0; i < alphabetsArray.length; i++){

			if (alphabetsArray[i] >= 'a' && alphabetsArray[i] <= 'z'){
				alphabetsArray[i] = (char) ((alphabetsArray[i] + K) % 122);
			}
			else if (alphabetsArray[i] >= 'A' && alphabetsArray[i] <= 'Z') {
				alphabetsArray[i] = (char) ((alphabetsArray[i] + K) % 90);
			}
		}

		// converting the charArray to String and printing it 
		System.out.println(new String(alphabetsArray));
		
		// After 

		// Solved The Problem

		// Closing the Scanner at the end of the program
		sn.close();
	}
}