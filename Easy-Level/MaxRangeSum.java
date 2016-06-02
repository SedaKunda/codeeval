/*
Bob is developing a new strategy to get rich in the stock market. He wishes to invest his portfolio for 1 or more days, then sell it at the right time to maximize his earnings. Bob has painstakingly tracked how much his portfolio would have gained or lost for each of the last N days. Now he has hired you to figure out what would have been the largest total gain his portfolio could have achieved.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static int counter = 0;
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	   String[] a = line.split(";");
        	   String[] b = a[1].split(" ");
        	   int[] stocks = new int[b.length];
        	   int range = Integer.parseInt(a[0]);
        	   int gains = 0;
        	   for (int i = 0; i < b.length; i++) {
        		   stocks[i] = Integer.parseInt(b[i]);
        	   }
        	   for (int i = 0; i <= b.length-range; i++) {
        		   int g = 0;
        		   for (int j = i; j < i+range; j++) {
            		   g += stocks[j];
            	   }
        		   if (gains < g) {
        			   gains = g;
        		   }
        	   }
        	   System.out.println(gains);
           }
           br.close();
    }
}
