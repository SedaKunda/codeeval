/*
There are two strings: A and B. Print 1 if string B occurs at the end of string A. Otherwise, print 0.
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	   String[] s = line.split(",");
        	   int length2 = s[1].length();
        	   int length1 = s[0].length();        	   
        	   String s1 = "";
        	   if (s[0].length()>=s[1].length()) {
        		   s1 = s[0].substring(length1-length2, length1);
        	   }
        	   if (s1.equalsIgnoreCase(s[1])) {
        		   System.out.println("1");
        	   }
        	   else {
        		   System.out.println("0");
        	   }
           }
           br.close();
    }
}
