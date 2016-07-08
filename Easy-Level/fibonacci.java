import java.io.*;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) {                 
                     int i = Integer.parseInt(line);
                     System.out.println(new Main().fibonacci(i));                 
                   }
                   br.close();
            }
            int fibonacci(int n) {
              if (n <= 1) return n;
              return fibonacci(n-1) + fibonacci(n-2);
            }
        }
