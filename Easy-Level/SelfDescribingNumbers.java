//If the number is a self-describing number, print out 1. If not, print out 0.

import java.io.*;
import java.util.*;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) { 
                	   String[] a = line.split("");
                	   boolean b = true;
                	   for (int i = 0; i < a.length; i ++) {
                		   int y = 0;
                		   for (int k = 0; k < a.length; k++) {
                			   if (Integer.parseInt(a[k]) == i) {
                				   y++;
                			   }
                		   }
                		   if (y != Integer.parseInt(a[i])) {
                			   b = false;
                		   }
                	   }
                	   if (b) {
                		   System.out.println("1"); 
                	   }
                	   else {
                		   System.out.println("0");
                	   }
                   }
                   br.close();
            }
        }
