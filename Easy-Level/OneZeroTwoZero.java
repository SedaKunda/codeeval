import java.io.*;
import java.math.BigDecimal;

public class Main {
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	   String[] a = line.split(" ");
        	   int b = Integer.parseInt(a[0]);
        	   int c = Integer.parseInt(a[1]);
        	   int d = 0;
        	   for (int i = 1; i <= c; i++) {
        		   int s = Integer.toBinaryString(i).length();
        		   int t = Integer.toBinaryString(i).replace("0", "").length();
        		   d = ((s-t)==b) ? d+1 : d+0;  
        	   }
        	   System.out.println(d);
           }
           br.close();
    }
}
