import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {	
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
               String[] a = line.substring(0, line.length()-4).split(" ");
               int b = Integer.parseInt(line.substring(line.length()-2).trim());
               ArrayList<String> ai = new ArrayList<String>(Arrays.asList(a));
               while (ai.size()>1) {
            	   if (b>ai.size() && (b%ai.size()!=0)) {
            	   ai.remove((b%ai.size()-1));
            	   }
            	   else if ((b%ai.size()==0)) {
            		
            		   ai.remove(ai.size()-1);
            	   }
            	   else {
            		   ai.remove(b-1);
            	   }
               }
               System.out.println(ai.get(0));
           }         
           br.close();
	}
}
