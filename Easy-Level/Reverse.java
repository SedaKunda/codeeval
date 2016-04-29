/*
Write a program which reverses the words in an input sentence.

INPUT SAMPLE:
The first argument is a file that contains multiple sentences, one per line. Empty lines are also possible.
For example:
  Hello World
  Hello CodeEval
  
OUTPUT SAMPLE:
Print to stdout each sentence with the reversed words in it, one per line. Empty lines in the input should be ignored. Ensure that there are no trailing empty spaces in each line you print.
For example:
  World Hello
  CodeEval Hello
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) {
            String[] x = line.split(" ");
            for (int i = x.length-1; i >= 0; i--) {
            	System.out.print(x[i] + " ");
            }
            System.out.println();
            }
        }
    }
}
