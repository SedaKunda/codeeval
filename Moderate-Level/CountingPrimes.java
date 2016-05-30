/*
Given two integers N and M, count the number of prime numbers between N and M (both inclusive)
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           Main m = new Main();
           while ((line = br.readLine()) != null) { 
        	  String[] s = line.split(",");
        	  int c = 0;
        	  for (int i = Integer.parseInt(s[0]); i <= Integer.parseInt(s[1]); i++) {
        		  if (m.isPrime(i)) {
        			  c++;
        		  }
        	  }
        	  System.out.println(c);
           }
           br.close();
    
    } 
   boolean isPrime(int n) {
	   for (int i = 2; i < n; i++) {
		   if (n%i==0) {
			   return false;
		   }
	   }
	   return true;
   }
}
