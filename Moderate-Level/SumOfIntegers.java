/*
Write a program to determine the largest sum of contiguous integers in a list.
*/

import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           Main m = new Main();
           while ((line = br.readLine()) != null) { 
        	   String[] s = line.split(",");
        	   int[] in = new int[s.length];
         	   for (int i = 0; i < s.length; i++) {
        		   in[i] = Integer.parseInt(s[i]);
        	   }
         	   int[] in2 = in.clone();
         	   Arrays.sort(in2);
         	   int sum = in2[0];
         	   for (int y = 0; y < in.length; y++) {
         		   if (in[y] > sum) {
         			   sum=in[y];
         		   }
         	   }
         	   for (int j = 0; j < in.length; j++) {
         		 for (int k = j+1; k < in.length; k++) {
         			 int total = m.add(j, k, in);
         			 if (total > sum) {
         				sum = total;
         			 }
        		  }
         	   }
         	   System.out.println(sum);
           }
           br.close();
    
    } 
    int add(int i, int j, int[] l) {
    	int sum = 0;
    	for (int g = i; g <= j; g++) {
    		sum += l[g];
    	}
    	return sum;
    }
}
