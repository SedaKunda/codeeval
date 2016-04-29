/*
Print the size of a file in bytes.

INPUT:

The first argument to your program has the path to the file you need to check the size of.

OUTPUT SAMPLE:

Print the size of the file in bytes. E.g.

55
*/

import java.io.*;
import java.nio.file.Files;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        System.out.println(file.length());
       
    }
}
