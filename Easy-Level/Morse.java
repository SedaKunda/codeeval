import java.io.*;
import java.util.HashMap;

public class Main {
	private static HashMap<String, String> alphaMorse = new HashMap<String, String>();
	static {
	    alphaMorse.put(".-", "A"); alphaMorse.put("-...", "B");alphaMorse.put("-.-.", "C");
	    alphaMorse.put("-..", "D"); alphaMorse.put(".", "E");alphaMorse.put("..-.", "F");
	    alphaMorse.put("--.", "G");alphaMorse.put("....", "H");alphaMorse.put("..", "I");
	    alphaMorse.put(".---", "J");alphaMorse.put("-.-", "K");alphaMorse.put(".-..", "L");
	    alphaMorse.put("--", "M");alphaMorse.put("-.", "N");alphaMorse.put("---", "O");
	    alphaMorse.put(".--.", "P");alphaMorse.put("--.-", "Q");alphaMorse.put(".-.", "R");
	    alphaMorse.put("...", "S");alphaMorse.put("-", "T");alphaMorse.put("..-", "U");
	    alphaMorse.put("...-", "V");alphaMorse.put(".--", "W");alphaMorse.put("-..-", "X");
	    alphaMorse.put("-.--", "Y");alphaMorse.put("--..", "Z");alphaMorse.put(".----", "1");
	    alphaMorse.put("..---", "2");alphaMorse.put("...--", "3");alphaMorse.put("....-", "4");
	    alphaMorse.put(".....", "5");alphaMorse.put("-....", "6");alphaMorse.put("--...", "7");
	    alphaMorse.put("---..", "8");alphaMorse.put("----.", "9");alphaMorse.put("-----", "0");
	}
	
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	   String[] a = line.split("  ");
        	   for (int i = 0; i < a.length; i++) {
        		   String[] b = a[i].trim().split(" ");
        		   for (String morse : b) {
        			   System.out.print(alphaMorse.get(morse));
        			}
        		   System.out.print(" ");
        	   }
        	   System.out.println();
           }
           br.close();
    }
}
