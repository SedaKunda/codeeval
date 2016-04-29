/*
Write a program which determines the sum of the first 1000 prime numbers.
*/

import java.io.*;
import java.io.*;
import java.util.ArrayList;
public class Main {
	 public static boolean isPrime(int n) {
	    	for (int i = 2; i<n ; i++) {
	    		if (n%i==0) {
	    			return false;
	    		}
	    	}
	    	return true;
	    }
    public static void main (String[] args) throws IOException {
    	int x = -1;
    	int count = 1000;
    	for (int i = 1; count>=0 ; i++) {
    		if (isPrime(i)) {
    			x+=i;
    			count--;
    		}
    	}
    	System.out.print(x);
        }
   
}
