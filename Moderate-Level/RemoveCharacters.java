/*
Write a program which removes specific characters from a string.
*/

import java.io.*;
public class RemoveCharacters {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
           	String lines[] = line.split(", ");
           	System.out.println(lines[0].replaceAll("[" + lines[1] + "]", ""));
            }
           br.close();
    }
}
