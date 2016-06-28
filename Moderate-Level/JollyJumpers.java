/*
Write a program to determine whether each of a number of sequences is a jolly jumper. 
*/

import java.io.*;
import java.util.*;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) { 
                	  String[] s = line.split(" ");
                	  ArrayList<Integer> a = new ArrayList<Integer>();
                	  ArrayList<Integer> b = new ArrayList<Integer>();
                	  for (int k = 2; k <= Integer.parseInt(s[0]); k++) {
                		 a.add(Math.abs(Integer.parseInt(s[k])-Integer.parseInt(s[k-1])));
                	  }
                	  for (int j = Integer.parseInt(s[0])-1; j > 0; j--) {
                 		b.add(j);
                 	  }
                	  Object[] y = a.toArray();
                	  Object[] z = b.toArray();
                	  Arrays.sort(y);
                	  Arrays.sort(z);
                	  if (Arrays.equals(y, z)) {
                		  System.out.println("Jolly");
                	  }
                	  else {
                		  System.out.println("Not jolly");
                	  }
                   }
                   br.close();
            }
        }
