/*
Write a program which determines the Mth to the last element in a list.
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	   String[] a = line.split(" ");
        	   String[] b = new String[a.length-1];
        	   int c = Integer.parseInt(a[a.length-1]);
        	   for (int i = 0; i < b.length; i++) {
        		   b[i] = a[i];
        	   }
        	   if (c <= b.length) {
        		   System.out.println(b[b.length-c]);
        	   }
           }
           br.close();
    
    } 
}
