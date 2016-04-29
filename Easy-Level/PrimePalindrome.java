/*
Write a program which determines the largest prime palindrome less than 1000.
*/

import java.io.*;
public class PrimePalindrome {
    public static void main (String[] args) throws IOException {
    	Main m = new Main();
    	int f = 0;
    	for (int i = 0; i < 1000; i++) {
    		if (m.isPalindrome(i) && m.isPrime(i)) {
    			f = i;
    		}
    	}
    	System.out.println(f);
    }
    
    public boolean isPrime(int n) {
    	boolean r = true;
    	for (int i = 2; i < n; i++) {
    		if (n%i == 0) {
    			r = false;
    		}
    	}
    	return r;
    }
    
    public boolean isPalindrome(int n) {
    	if (n<10) {
    		return true;
    	}
    	else {
    		String s = "" + n;
    			if (s.charAt(0)==s.charAt(s.length()-1)) {
    				return true;
    			}
    			else {
    				return false;
    			}
    	}
    }
}
