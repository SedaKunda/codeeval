//Write a program which finds the first non-repeated character in a string.
import java.io.*;

public class Main {
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	  String[] a = line.split("");
        	  Main m = new Main();
        	  String r = m.remove(a);
        	  if (r.length()>0) {
        		  System.out.println(r.charAt(0));
        	  }
        	  else {
        		  System.out.println();
        	  }
           }
           br.close();
    }
	public String remove(String[] a) {
		String s = "";
		String d = "";
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			d += a[i];
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					break;
				}
				else if (a[i].equals(a[j])) {
					k++;
				}
				
			}
			if (k!=0) {
				s += a[i];
			}
			
		}
		for (int p = 0; p < s.length(); p++) {
				d = d.replace(s.charAt(p), ' ');
		}
 		return d.trim().replace(" ", "");
	}
 }
