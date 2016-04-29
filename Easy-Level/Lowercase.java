/*
Given a string write a program to convert it into lowercase.

INPUT SAMPLE:

The first argument will be a path to a filename containing sentences, one per line. You can assume all characters are from the english language. E.g.

HELLO CODEEVAL
This is some text
OUTPUT SAMPLE:

Print to stdout, the lowercase version of the sentence, each on a new line. E.g.

hello codeeval
this is some text
*/

import java.io.*;
public class Lowercase {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	System.out.println(line.toLowerCase());
        }
        
    }
}
