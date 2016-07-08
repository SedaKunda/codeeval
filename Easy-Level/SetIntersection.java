/*
You are given two sorted list of numbers (ascending order). The lists themselves are comma delimited and the two lists are semicolon delimited. Print out the intersection of these two sets.
*/

import java.io.*;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) {  
                	   String[] s = line.split(";");
                	   String[] a1 = s[0].split(",");
                	   String[] a2 = s[1].split(",");
                	   String f = "";
                	   for (int i = 0; i < a1.length; i++) {
                		   for (int j = 0; j < a2.length; j++) {
                			   if(a1[i].equals(a2[j])) {
                				   f += a1[i] + ",";
                			   }
                		   }
                	   }
                	   System.out.println(f.replaceFirst(".$",""));
                   }                   
                   br.close();
            }
        }
