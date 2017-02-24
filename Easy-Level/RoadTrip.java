import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.replace(" ", "");
            String[] a = line.split("[;/,]");
            int[] b = new int[a.length/2];
            
            for (int i = 0; i < b.length; i++) {
            	b[i] = Integer.parseInt(a[i*2+1]);
            }
            Arrays.sort(b);
            System.out.print(b[0]);
            for (int j = 0; j < b.length-1; j++) {
            	System.out.print("," + Math.subtractExact(b[j+1], b[j]));
            }
            System.out.println();
        }
    }
}
