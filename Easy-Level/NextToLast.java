/*
Write a program which finds the next-to-last word in a string.

INPUT SAMPLE:
Your program should accept as its first argument a path to a filename. Input example is the following
some line with text
another line
Each line has more than one word.

OUTPUT SAMPLE:
Print the next-to-last word in the following way.
with
another
*/

import java.io.*;
import java.util.Arrays;
public class NextToLast {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
            	String [] a = line.split(" ");
            	System.out.println(a[a.length-2]);
        }            
    }
}
