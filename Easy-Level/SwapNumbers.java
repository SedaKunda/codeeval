import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] a = line.split(" ");
       
            for (int j = 0; j < a.length; j++) {
            	System.out.print(a[j].charAt(a[j].length()-1) + a[j].substring(1, a[j].length()-1) + a[j].charAt(0) + " ");
            }
            System.out.println();
        }
    }
}
