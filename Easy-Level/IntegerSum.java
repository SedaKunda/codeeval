/*
Print out the sum of integers read from a file.

INPUT SAMPLE:

The first argument to the program will be a path to a filename containing a positive integer, one per line. E.g.

5
12
OUTPUT SAMPLE:

Print out the sum of all the integers read from the file. E.g.

17
*/

import java.io.*;
public class IntegerSum {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int x = 0;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            x+=Integer.parseInt(line);
        }
        System.out.println(x);
    }
}
