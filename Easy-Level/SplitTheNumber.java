import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
		String[] b = line.split(" "); 
	    String c = b[0];
	    String d = b[1];
	    if (d.contains("+")) {
	         String[] e = d.split("\\+");
	        int f = e[0].length();
	        int g = Integer.parseInt(c.substring(0,f));
	        int h = Integer.parseInt(c.substring(f,c.length()));
	        System.out.println(g+h);
	    }
	    if (d.contains("-")) {
	        String[] e = d.split("-");
	        int f = e[0].length();
	        int g = Integer.parseInt(c.substring(0,f));
	        int h = Integer.parseInt(c.substring(f,c.length()));
	        System.out.println(g-h);
	    }
        }
    }
}
