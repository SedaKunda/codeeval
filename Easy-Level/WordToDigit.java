/*
Having a string representation of a set of numbers you need to print this numbers.
All numbers are separated by semicolon. There are up to 20 numbers in one line. The numbers are "zero" to "nine"

INPUT SAMPLE:
Your program should accept as its first argument a path to a filename. Each line in this file is one test case. E.g.
zero;two;five;seven;eight;four
three;seven;eight;nine;two

OUTPUT SAMPLE:
Print numbers in the following way:
025784
37892
*/

import java.io.*;
public class WordToDigit {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
           	String[] words = line.split(";");
            	 for (int i = 0; i < words.length; i++) {
            		 if (words[i].equalsIgnoreCase("one")) {
            			 System.out.print("1");
            		 }
            		 if (words[i].equalsIgnoreCase("zero")) {
            			 System.out.print("0");
            		 }
            		 if (words[i].equalsIgnoreCase("two")) {
            			 System.out.print("2");
            		 }
            		 if (words[i].equalsIgnoreCase("three")) {
            			 System.out.print("3");
            		 }
            		 if (words[i].equalsIgnoreCase("four")) {
            			 System.out.print("4");
            		 }
            		 if (words[i].equalsIgnoreCase("five")) {
            			 System.out.print("5");
            		 }
            		 if (words[i].equalsIgnoreCase("six")) {
            			 System.out.print("6");
            		 }
            		 if (words[i].equalsIgnoreCase("seven")) {
            			 System.out.print("7");
            		 }
            		 if (words[i].equalsIgnoreCase("eight")) {
            			 System.out.print("8");
            		 }
            		 if (words[i].equalsIgnoreCase("nine")) {
            			 System.out.print("9");
            		 }
            	 }
            	 System.out.println();
            }
           br.close();
    }
}
