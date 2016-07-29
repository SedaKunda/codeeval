//You are given a list of numbers which is supplemented with positions that have to be swapped.

import java.io.*;
import java.util.*;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) { 
                	   String[] a = line.split(":");
                	   String[] b = a[0].split(" ");
                	   String[] c = a[1].replace(" ", "").split(",");
                	   for (String s: new Main().swap(b, c)) {
                		   System.out.print(s + " ");
                	   }
                	   System.out.println();              	  
                   }
                   br.close();
            }
            
            String[] swap(String[] s, String[] h) {
            	String g;
            	for (int i = 0; i < h.length; i++) {
            		g = h[i];            	
	            	String[] d = g.split("-");
	            	int a = Integer.parseInt(d[0]);
	            	int b = Integer.parseInt(d[1]);
	            	String c = s[a];
	            	String e = s[b];
	            	s[a] = e;
	            	s[b] = c;
            	}
            	return s;
            }
        }
