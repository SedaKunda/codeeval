/*
Given a positive integer, find the sum of its constituent digits.
*/

import java.io.*;
public class SumDigits {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int x = 0;
            for (int i = 0; i < line.length(); i++) {
            	x += Integer.parseInt("" + line.charAt(i));
            }
            System.out.println(x);
        }
    }
}
