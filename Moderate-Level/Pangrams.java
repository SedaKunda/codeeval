/*
The sentence 'A quick brown fox jumps over the lazy dog' contains every single letter in the alphabet. Such sentences are called pangrams. You are to write a program, which takes a sentence, and returns all the letters it is missing (which prevent it from being a pangram). You should ignore the case of the letters in sentence, and your return should be all lower case letters, in alphabetical order. You should also ignore all non US-ASCII characters.In case the input sentence is already a pangram, print out the string NULL
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;      
           while ((line = br.readLine()) != null) {
        	   int x = 0;
        	   char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        	   char[] l = line.replace(" ", "").toLowerCase().toCharArray();
        	   Arrays.sort(l);
        	   for (int i = 0; i < alphabet.length; i++) {
        		   int count = 0;
        		   for (int j = 0; j < l.length; j++) {
        			   count += (l[j] == alphabet[i]) ? 1 : 0;        			   
        		   }
        		   if (count == 0) {
        			   System.out.print(alphabet[i]);
        			   x++;
        		   }
        	   }
        	   if (x == 0) {
        		   System.out.print("NULL");
        	   }
        	   System.out.println(); 
           }
           br.close();
    }
}
