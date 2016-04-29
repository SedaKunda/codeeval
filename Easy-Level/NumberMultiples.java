/*
Given numbers x and n, where n is a power of 2, print out the smallest multiple of n which is greater than or equal to x. Do not use division or modulo operator.

INPUT SAMPLE:

The first argument will be a path to a filename containing a comma separated list of two integers, one list per line. E.g.

13,8
17,16
OUTPUT SAMPLE:

Print to stdout, the smallest multiple of n which is greater than or equal to x, one per line. E.g.

16
32
*/

import java.io.*;
public class NumberMultiples {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] x = line.split(",");
            for (int i = 1; ; i++) {
            	int s = Integer.parseInt(x[1]);
            	s*=i;
            	if (s>Integer.parseInt(x[0])) {
            	System.out.println(s);
            	break;
            	}
            }
        }
    }
}
