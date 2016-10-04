import java.io.*;
public class Main {	
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
               String[] a = line.replace(" | ", "  ").split("  ");
               int num = 0;
               for (int i = 0; i < a[0].length(); i++) {
            	   if (a[0].charAt(i)!=a[1].charAt(i)) {
            		   num++;
            	   }
               }
               if (num>6) System.out.println("Critical");
               else if (num==5||num==6) System.out.println("High");
               else if (num==3||num==4) System.out.println("Medium");
               else if (num==1||num==2) System.out.println("Low");
               else System.out.println("Done");
           }         
           br.close();
	}
}
