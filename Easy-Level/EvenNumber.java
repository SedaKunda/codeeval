/*
Write a program which checks input numbers and determines whether a number is even or not.
*/
import java.io.*;
public class EvenNumber {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
            	int i = Integer.parseInt(line);
            	if (i%2 == 0) {
            		System.out.println("1");
            	}
            	else {
            		System.out.println("0");
            	}
            }
            br.close();
    }
}
