import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            	String[] b = line.split(" "); 
              Map<String, Integer> m = new HashMap<String, Integer>();
              for (int i = 0; i < b.length; i++) {
                int count = 0;
                for (int j = 0; j < b.length; j++) {
                  if (b[i].equals(b[j])) {
                    count++;
                  }
                }
                if (count==1) {
                    m.put(b[i], (i + 1));
                }
              }
                if (m.isEmpty()) {
                    System.out.println("0");
                }
                else {
                  System.out.println(m.values().iterator().next());
                }
              }
      }
}
