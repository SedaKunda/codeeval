import java.io.*;

public class Main {	
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
               String a = line.replace("(", "").replace(")", "").replace(",", "");
               String[] b = a.split(" ");
               int c = Math.abs(Math.subtractExact(Integer.parseInt(b[0]), Integer.parseInt(b[2])));
               int d = Math.abs(Math.subtractExact(Integer.parseInt(b[1]), Integer.parseInt(b[3])));               
               System.out.println((int)Math.sqrt((c*c)+(d*d)));               
           }           
           br.close();
	}
}
