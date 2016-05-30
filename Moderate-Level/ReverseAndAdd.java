/*
The problem is as follows: choose a number, reverse its digits and add it to the original. If the sum is not a palindrome (which means, it is not the same number from left to right and right to left), repeat this procedure.
*/

import java.io.*;
public class Main {
	public static int counter = -1;
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           Main m = new Main();
           while ((line = br.readLine()) != null) { 
        	   counter = -1;
        	   int y = Integer.parseInt(line);
        	   int f = m.isPalindrome(y);
        	   System.out.println(counter + " " + f);
           }
           br.close();
    
    } 
    
    int isPalindrome(int a) {
    	counter++;
    	char[] n = (a + "").toCharArray();
    	int p = 0;
    	int x = n.length-1;
    	for (int i = 0; i < n.length/2; i++) {
    		if (n[i] == n[x]) {
    			x--;
    		}
    		else {
    			p--;
    		}
    	}
    	if (p < 0) {
    		return isPalindrome(reverse(a)+a);
    	}
    	return a;
    }
    
    public int reverse(int x) {
    	boolean flag = false;
    	if (x < 0) {
    		x = 0 - x;
    		flag = true;
    	}     
    	int res = 0;
    	int p = x;     
    	while (p > 0) {
    		int mod = p % 10;
    		p = p / 10;
    		res = res * 10 + mod;
    	}     
    	if (flag) {
    		res = 0 - res;
    	}     
    	return res;
    }
}
