/*
You are given 3 coins of value 1, 3 and 5. You are also given a total which you have to arrive at. Find the minimum number of coins to arrive at it.
*/
import java.io.*;

public class Main {
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	  int i = Integer.parseInt(line);
        	  System.out.println(new Main().div(i));
        	  
           }
           br.close();
    }
	public int div (int i) {
		int y = 0;
		if (i>=5) {
			y += i/5;
			i = i%5;
		}
		if (i>=3) {
			y += i/3;
			i = i%3;
		}
		if (i>=1) {
			y += i/1;
			i = i%1;
		}
		return y;
	}
 }
