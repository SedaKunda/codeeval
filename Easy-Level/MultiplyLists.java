/*
You have 2 lists of positive integers. Write a program which multiplies corresponding elements in these lists.
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	  String[] s = line.split("[|]");
        	  String[] a = s[0].split(" ");
        	  String[] b = s[1].split(" ");
        	  for (int i = 0; i < a.length; i++) {
        		  System.out.print((Integer.parseInt(a[i]))*(Integer.parseInt(b[i+1])) + " ");
        	  }        	  
        	  System.out.println(b[0]);
           }
           br.close();
    }
}
