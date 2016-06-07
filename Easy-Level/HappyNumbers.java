/*
A happy number is defined by the following process. Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers.
*/

import java.io.*;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           Main m = new Main();
           while ((line = br.readLine()) != null) { 
        	   char[] c = line.toCharArray();
        	   ArrayList<Integer> l = new ArrayList<Integer>();
        	   int i = m.squares(c);
        	   while (true) {
	        	   if (l.contains(i)) {
	        		   System.out.println("0");
	        		   break;
	        	   }
	        	   else if (i == 1) {
	        		   System.out.println("1");
	        		   break;
	        	   }
	        	   else {
	        		   l.add(i);
	        		   i = m.squares((i+"").toCharArray());
	        	   }
        	   }
           }
           br.close();
    }
    int squares(char[] c) {
    	int j = 0;
    	for (int i = 0; i < c.length; i++) {
    		int f = Integer.parseInt(c[i] + "");
    		j += f*f;
    	}
    	return j;
    }
}
