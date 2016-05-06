/*
In this challenge you're given a random string containing hidden and visible digits. The digits are hidden behind lower case latin letters as follows: 0 is behind 'a', 1 is behind ' b ' etc., 9 is behind 'j'. Any other symbol in the string means nothing and has to be ignored. So the challenge is to find all visible and hidden digits in the string and print them out in order of their appearance.
*/

import java.io.*;
import java.util.Arrays;
public class HiddenDigits {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
            	int count = 0;
            	char[] x = line.toCharArray();
            	for (int i = 0; i < x.length; i++) {
            		if (Character.isDigit(x[i])) {
            			System.out.print(x[i]);
            			count++;
            		}
            		else if (x[i]=='a') {
            			System.out.print("0");
            			count++;
            		}
            		else if (x[i]=='b') {
            			System.out.print("1");
            			count++;
            		}
            		else if (x[i]=='c') {
            			System.out.print("2");
            			count++;
            		}
            		else if (x[i]=='d') {
            			System.out.print("3");
            			count++;
            		}
            		else if (x[i]=='e') {
            			System.out.print("4");
            			count++;
            		}
            		else if (x[i]=='f') {
            			System.out.print("5");
            			count++;
            		}
            		else if (x[i]=='g') {
            			System.out.print("6");
            			count++;
            		}
            		else if (x[i]=='h') {
            			System.out.print("7");
            			count++;
            		}
            		else if (x[i]=='i') {
            			System.out.print("8");
            			count++;
            		}
            		else if (x[i]=='j') {
            			System.out.print("9");
            			count++;
            		}
            	}
            	if (count==0) {
            		System.out.println("NONE");
            	}
            	else {
            		System.out.println();
            	}
            }
    }
}
