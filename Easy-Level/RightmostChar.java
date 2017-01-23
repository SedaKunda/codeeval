import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            line +=' ';
		String[] b = line.split(","); 
		String c = b[0];
		char d = b[1].charAt(0);
    	boolean check = false;
    	int ans = 0;
		for (int i = c.length()-1; i > 0; i--) {
			if (c.charAt(i)==d) {
			    check = true;
			    ans = i;
			    break;
			}
		}
		if (!check) {
		    System.out.println("-1");
		}
		else {
		    System.out.println(ans);
		}
        }
    }
}
