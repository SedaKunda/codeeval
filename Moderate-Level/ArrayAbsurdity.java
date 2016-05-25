/*
Imagine we have an immutable array of size N which we know to be filled with integers ranging from 0 to N-2, inclusive. Suppose we know that the array contains exactly one duplicated entry and that duplicate appears exactly twice. Find the duplicated entry. (For bonus points, ensure your solution has constant space and time proportional to N)
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	   String[] a = line.split(";");
        	   String[] b = a[1].split(",");
        	   int[] c = new int[Integer.parseInt(a[0])];
        	   for (int i = 0; i < c.length; i++) {
        		   c[i] = Integer.parseInt(b[i]);
        	   }
        	   for (int j = 0; j < c.length; j++) {
        		   for (int k = j+1; k < c.length; k++) {
        			   if (c[k] == c[j]) {
        	        	   System.out.println(c[k]);
            		   }
        		   }
        	   }
           }
           br.close();
    
    } 
}
