/*
Write a program which capitalizes the first letter of each word in a sentence.
*/

import java.io.*;
import java.util.Arrays;
public class Capitalize {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
            	String lines[] = line.split(" ");
            	for (int i = 0; i < lines.length; i++ ) {
            		System.out.print(lines[i].toUpperCase().charAt(0));
            		System.out.print(lines[i].substring(1));  
            		System.out.print(" ");
            	}
            	System.out.println();
            }
    }
}
