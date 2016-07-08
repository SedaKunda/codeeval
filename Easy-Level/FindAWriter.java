/*
You have a set of rows with names of famous writers encoded inside. Each row is divided into 2 parts by pipe char (|). The first part has a writer's name. The second part is a "key" to generate a name.

Your goal is to go through each number in the key (numbers are separated by space) left-to-right. Each number represents a position in the 1st part of a row. This way you collect a writer's name which you have to output.
*/
import java.io.*;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) { 
                	   String[] s = line.split("\\|");
                	   String[] c = s[1].trim().split(" ");
                	   for (int i = 0; i < c.length; i++) {
                		   System.out.print(s[0].charAt(Integer.parseInt(c[i])-1));
                	   }
                	   System.out.println();                	
                   }
                   br.close();
            }
        }
