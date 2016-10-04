import java.io.*;
public class Main {	
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
               String a = line.replaceAll("\\D+"," ").trim(); 
               String[] b = a.split(" ");
               int v = Integer.parseInt(b[0]);
               int z = Integer.parseInt(b[1]);
               int w = Integer.parseInt(b[2]);
               int h = Integer.parseInt(b[3]);
               int c = (3*v + 4*z + 5*w)*h;
               System.out.println(Math.floorDiv(c, (z+v+w)));
           }           
           br.close();
	}
}
