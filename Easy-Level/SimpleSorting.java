/*
Write a program that sorts numbers
*/

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	  String[] s = line.split(" ");
        	  double[] db = new double[s.length];
        	  for (int i = 0; i < s.length; i++) {
        		  double d = Double.parseDouble(s[i]);
        		  db[i] = d;
        	  }
        	  Arrays.sort(db);
        	  DecimalFormat df = new DecimalFormat("0.000");
        	  for (int j = 0; j < db.length; j++) {
        		  System.out.printf(df.format(db[j]) + " ");
        	  }
        	  System.out.println();
           }
           br.close();
    }
}
