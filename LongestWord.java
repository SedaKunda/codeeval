/*
In this challenge you need to find the longest word in a sentence. If the sentence has more than one word of the same length you should pick the first one.
*/

import java.io.*;
import java.util.Arrays;
public class LongestWord {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
            	String[] a = line.split(" ");
            	String b = "";
            	for (int i = 0; i < a.length; i++) {
            		if (a[i].length()>b.length()) {
            			b = a [i];
            		}
            	}
            	System.out.println(b);
        }            
    }
}
