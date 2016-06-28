/*
Credits: This challenge has appeared in a past google competition 

You are writing out a list of numbers.Your list contains all numbers with exactly Di digits in its decimal representation which are equal to i, for each i between 1 and 9, inclusive. You are writing them out in ascending order. For example, you might be writing every number with two '1's and one '5'. Your list would begin 115, 151, 511, 1015, 1051. Given N, the last number you wrote, compute what the next number in the list will be. The number of 1s, 2s, ..., 9s is fixed but the number of 0s is arbitrary.
*/

import java.io.*;
import java.util.Arrays;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) { 
                	  char[] c = line.toCharArray();
                	  Arrays.sort(c);
                	  for (int i = Integer.parseInt(line)+1; ; i++) {
                		  String s = String.valueOf(i);
                		  char[] d = s.toCharArray();
                		  Arrays.sort(d);
                		  char[] e = new char[c.length];
                		  e = Arrays.copyOfRange(d, d.length-c.length, d.length);
                		  if (Arrays.equals(c, e)) {
                			  char[] t = Arrays.copyOf(d, d.length);
                			  Arrays.sort(t);
                			  char[] f = Arrays.copyOf(e, d.length);
                			  Arrays.sort(f);
                			  Arrays.fill(f, 0, d.length-e.length, '0');
                			  if (Arrays.equals(f, t)) {
                				  System.out.println(i);
                    			  break;                			  
                			  }               			  
                		  }
                	  }
                   }
                   br.close();
            }
        }
