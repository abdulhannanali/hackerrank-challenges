/*
 * Problem Link : https://www.hackerrank.com/challenges/service-lane
 * Problem Name: Service Lane
 * 
 * Algorithms -> Implementation
 */

import java.util.*;
import java.lang.*;

public class servicelana{
	public static void main(String[] args){

		// Setting up the input scanner
		Scanner sn = new Scanner(System.in);

		// length of the freeway
		int n = sn.nextInt();

		// number of test cases
		int t = sn.nextInt();

		// width array -> represents the width of each segment of the service
		// lane
		int[] width = new int[n];

		// j is the segment entry point
		int i;
		/// k is the segment exit point
		int j;

		// minimum width vehicle that can pass through the current 
		// segment
		int currentWidth;

		for (int k = 0; k < n; k++){
			width[k] = sn.nextInt(); 
		}


		for (int l = 0; l < t; l++){
			// starting from the max
			// and then narrowing it down
			currentWidth = 3;

			i = sn.nextInt();
			j = sn.nextInt();
			for (int c = i; c <= j; c++){	
				if (currentWidth > width[c]){
					currentWidth = width[c];
				}
				if (currentWidth == 1){
					break;
				}
			}
			System.out.println(currentWidth);
		}
	}
}