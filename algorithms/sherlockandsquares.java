import java.io.*;
import java.util.*;
import java.math.*;

public class sherlockandsquares {

	// brute foce approach aka shit
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sn = new Scanner(System.in);
        
        // number of test cases
        int t = sn.nextInt();
        
        int a;
        int b;
        int c;
        for (int i = 0; i < t; i++){
            a =  sn.nextInt();
            b = sn.nextInt();
            c = (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))  + 1);
            System.out.println(c);
        }

        // closing the scanner
    	sn.close();
    }


}