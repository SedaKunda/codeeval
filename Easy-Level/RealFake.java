/*
The police caught a swindler with a big pile of credit cards. Some of them are stolen and some are fake. It would take too much time to determine which ones are real and which are fake, so you need to write a program to check credit cards. 
To determine which credit cards are real, double every third number starting from the first one, add them together, and then add them to those figures that were not doubled. If the total sum of all numbers is divisible by 10 without remainder, then this credit card is real. 
*/

import java.io.*;
import java.util.Arrays;
public class RealFake {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
            	line = line.replace(" ", "");
            	String lines[] = line.split("");
            	int count=0;
            	for (int i = 0; i < lines.length; i++ ) {
            		if (i%2==0|i==0) {
            			count+=2*(Integer.parseInt(lines[i]));
            		}
            		else {
            			count+=Integer.parseInt(lines[i]);
            		}
            	}
            	if (count%10==0) {
            		System.out.println("Real");
            	}
            	else {
            		System.out.println("Fake");
            	}
            }
    }
}
