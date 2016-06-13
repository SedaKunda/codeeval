/*
You are given a decimal (base 10) number, print its binary representation.
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	   int a = Integer.parseInt(line);        	   
        	   System.out.println(Integer.toBinaryString(a));
           }
           br.close();
    }
}
