/*
You are given a text. Write a program which outputs its lines according to the following rules:

If line length is ≤ 55 characters, print it without any changes.
If the line length is > 55 characters, change it as follows:
Trim the line to 40 characters.
If there are spaces ‘ ’ in the resulting string, trim it once again to the last space (the space should be trimmed too).
Add a string ‘... <Read More>’ to the end of the resulting string and print it.
*/

import java.io.*;
import java.util.Arrays;
public class ReadMore {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
            	if (line.length()<=55) {
            		System.out.println(line);
            	}
            	else {
            		String s = line.substring(0, 40);
            		if (s.replace(" ", "").length()==s.length()) {
            			System.out.println(s + "... <Read More>");
            		}
            		else { 
            			int x = 39;
            			while (x>0) {
            				if (line.charAt(x)==' ') {
            					System.out.println(line.substring(0, x) + "... <Read More>");
            					break;
            				}
            				else {
            					x--;
            				}
            			}
            		}
            	}
            }
    }
}
