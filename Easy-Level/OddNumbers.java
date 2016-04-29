/*
Print the odd numbers from 1 to 99.
*/

import java.io.*;
public class OddNumbers {
    public static void main (String[] args) throws IOException {
     for (int i = 0; i < 100; i++) {
    	 if (i%2!=0) {
            System.out.println(i);
    	 }
        }
    }
}
