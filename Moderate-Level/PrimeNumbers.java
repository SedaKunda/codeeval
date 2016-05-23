/*
Print out the prime numbers less than a given number N. For bonus points your solution should run in N*(log(N)) time or better. You may assume that N is always a positive integer
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           Main m = new Main();
           String s = "";
           while ((line = br.readLine()) != null) {
        	   int n = Integer.parseInt(line);
        	   if (n >= 2) {
        		   System.out.print(2);
        	   }
        	   for (int i = 3; i < n; i++) {
        		   	if (m.isPrime(i)) {
        		   		System.out.print("," + i);
        		   	}
        		   
            	   } System.out.println(); 
           }  
           br.close();
    }
    boolean isPrime (int n) {
    	if ( n > 2 && n %2 == 0 ) {
            return false;
        }
        int top = (int)Math.sqrt(n) + 1;
        for(int i = 3; i < top; i+=2){
            if(n % i == 0){
                return false;
            }
        }
        return true; 
    }  
}
