/*
Write a program which determines the number of 1 bits in the internal representation of a given integer.
*/

import java.io.*;
public class NumberOfOnes {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;      
            while ((line = br.readLine()) != null) {
            	int i = Integer.parseInt(line);
            	String b = Integer.toBinaryString(i);
            	int count = 0;
            	for (int y = 0; y < b.length(); y++) {
            		if (b.charAt(y)=='1') {
            			count++;
            		}
            	}
            	System.out.println(count);
            }
           br.close();
}
}
