/*
Given two integers N and M, calculate N Mod M (without using any inbuilt modulus operator).
*/
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
            	String[] a = line.split(",");
            	int b = Integer.parseInt(a[0]);
            	int c = Integer.parseInt(a[1]);
            	System.out.println(b-((b/c)*c));
        }            
    }
}
