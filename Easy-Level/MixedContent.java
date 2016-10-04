import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
	
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
               ArrayList<String> a1 = new ArrayList<String>();
               ArrayList<String> a2 = new ArrayList<String>();
               String[] b = line.split(",");
               for (String c : b) {
            	   if (c.matches("[0-9]+")) {
            		   a1.add(c);
            	   }
            	   else {
            		   a2.add(c);
            	   }
               }
               System.out.print(a2.toString().replace("[", "").replace("]", "").replace(" ", ""));
               if (!(a2.isEmpty() || a1.isEmpty())) System.out.print("|");
               System.out.print(a1.toString().replace("[", "").replace("]", "").replace(" ", ""));
               System.out.println();
           }
           
           br.close();
	}
}
