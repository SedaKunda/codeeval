/*
Players generally sit in a circle. The first player says the number “1”, and each player says next number in turn. However, any number divisible by X (for example, three) is replaced by the word fizz, and any divisible by Y (for example, five) by the word buzz. Numbers divisible by both become fizz buzz. A player who hesitates, or makes a mistake is eliminated from the game.

Write a program that prints out the final series of numbers where those divisible by X, Y and both are replaced by “F” for fizz, “B” for buzz and “FB” for fizz buzz.
*/
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] numbersArray = line.split(" ");
            int f = Integer.parseInt(numbersArray[0]);
            int b = Integer.parseInt(numbersArray[1]);
            int limit = Integer.parseInt(numbersArray[2]);
            for (int i = 1; i <= limit; i++) {
            	if (i%f==0 && i%b!=0) {
            		System.out.print("F ");
            	}
            	else if (i%b==0 && i%f!=0) {
            		System.out.print("B ");
            	}
            	else if (i%b==0 && i%f==0) {
            		System.out.print("FB ");
            	}
            	else {
            		System.out.print(i + " ");
            	}
            }
            System.out.println();
        }
    }
}
