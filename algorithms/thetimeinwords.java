/*
 * This code hacked by Hannan Ali for HackerRank
 * With all the sweg file is named thetimeinwords.java		
 * send him some of your sweg at  abdulhannanali@outlook.com
 * visit his hood place at  https://abdulhannanali.github.io
 * 
 * Link to the following hacker rank problem is
 * https://www.hackerrank.com/challenges/the-time-in-words
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
public class thetimeinwords{

	// Main Method
	public static void main (String[] args){
		// THE INPUT SHOULD BE READ FROM STDIN
		// THE OUTPUT SHOULD BE OUTPUT TO STDOUT

		// Instantiating Scanner object "sn" as System.in as argument
		Scanner sn = new Scanner(System.in);
		
		// Solve The Problem

		// getting the hours and minutes for input
		int H = sn.nextInt();
		int M = sn.nextInt();

		// Words for different numbers for arranging the wording for the clock
		HashMap<Integer, String> numbersToWords = new HashMap<Integer, String>();

		// mapping different numbers to words
		numbersToWords.put(0, "twelve");
		numbersToWords.put(1, "one");
		numbersToWords.put(2, "two");
		numbersToWords.put(3, "three");
		numbersToWords.put(4, "four");
		numbersToWords.put(5, "five");
		numbersToWords.put(6, "six");
		numbersToWords.put(7, "seven");
		numbersToWords.put(8, "eight");
		numbersToWords.put(9, "nine");
		numbersToWords.put(10, "ten");
		numbersToWords.put(11, "eleven");
		numbersToWords.put(12, "twelve");
		numbersToWords.put(13, "thirteen");
		numbersToWords.put(14, "fourteen");
		numbersToWords.put(15, "fifteen");
		numbersToWords.put(16, "sixteen");
		numbersToWords.put(17, "seventeen");
		numbersToWords.put(18, "eighteen");
		numbersToWords.put(19, "nineteen");
		numbersToWords.put(20, "twenty");
		numbersToWords.put(21, 	"twenty one");
		numbersToWords.put(22, 	"twenty two");
		numbersToWords.put(23, 	"twenty three");
		numbersToWords.put(24, 	"twenty four");
		numbersToWords.put(25, 	"twenty five");
		numbersToWords.put(26, 	"twenty six");
		numbersToWords.put(27, 	"twenty seven");
		numbersToWords.put(28, 	"twenty eight");
		numbersToWords.put(29,	"twenty nine");

		String wordForm = "";

		if (M == 0){
			wordForm = numbersToWords.get(H) + " o' clock";
		}
		else if (M == 15){
			wordForm = "quarter past " + numbersToWords.get(H);
		}
		else if (M == 30){
			wordForm = "half past " + numbersToWords.get(H);
		}
		else if (M == 45){
			H = (H + 1) % 12;
			wordForm = "quarter to " + numbersToWords.get(H);
		}
		else if (M > 0 && M < 30){
			if (M == 1){
				wordForm = numbersToWords.get(M) + " minute past " + numbersToWords.get(H);
			} else {
				wordForm = numbersToWords.get(M) + " minutes past " + numbersToWords.get(H);
			}
		}
		else if (M > 30 && M < 60){
			M = 60 - M;
			H = (H + 1) % 12;
			if (M == 1){
				wordForm = numbersToWords.get(M) + " minute to " + numbersToWords.get(H);
			} else {
				wordForm = numbersToWords.get(M) + " minutes to " + numbersToWords.get(H);	
			}
		}

		// Finally displaying the alphabetic form of the numeric time
		System.out.println(wordForm);

		// Solved The Problem


		// Closing the Scanner at the end of the program
		sn.close();
	}
}
