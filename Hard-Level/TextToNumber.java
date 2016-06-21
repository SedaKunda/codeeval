/*
You have a sting which contains a number represented as English text. Your task is to translate these numbers into their integer representation. The numbers can range from negative 999,999,999 to positive 999,999,999. The following is an exhaustive list of English words that your program must account for:
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
           String line;
           while ((line = br.readLine()) != null) { 
        	   String[] a = line.split(" ");  
        	   System.out.println(new Main().word(a));
           }
           br.close();
    }
    
    String word(String[] s) {
    	Map<String, Integer> m = new HashMap<String, Integer>();
    	m.put("zero", 0);
    	m.put("one", 1); m.put("two", 2); m.put("three", 3);m.put("four", 4);
    	m.put("five", 5); m.put("six", 6); m.put("seven", 7); m.put("eight", 8);
    	m.put("nine", 9); m.put("ten", 10); m.put("eleven", 11); m.put("twelve", 12);
    	m.put("thirteen", 13); m.put("fourteen", 14); m.put("fifteen", 15); 
    	m.put("sixteen", 16); m.put("seventeen", 17); m.put("eighteen", 18); 
    	m.put("nineteen", 19); m.put("twenty", 20); m.put("thirty", 30); 
    	m.put("forty", 40); m.put("fifty", 50); m.put("sixty", 60);
    	m.put("seventy", 70); m.put("eighty", 80); m.put("ninety", 90);
    	int f = 0, g = 0, h = 0, fin = 0;
    	String i = "";
    	if (s[0].equals("negative") && !s[0].isEmpty()) {
    		i += "-";
		}
    	for (int j = 0; j < s.length; j++) {
    		if (m.get(s[j])!=null) {
    			f += m.get(s[j]);
        	}
    		else if (s[j].equals("million")) {
    			f *= 1000000;
    			h = f;
    			f = 0;
    		}
    		else if (s[j].equals("hundred")) {
    			f *= 100;
    		}
    		else if (s[j].equals("thousand")) {
    			f *= 1000;
    			g = f;
    			f = 0;    			
    		}
    		fin = f + g + h;
    	}
    	return i + fin;
  }
}
