/*
Write a program which swaps letters' case in a sentence. All non-letter characters should remain the same.
*/

import java.io.*;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) { 
                     for (int i = 0; i < line.length(); i++) {
                       if (Character.isLowerCase(line.charAt(i))) {
                         System.out.print(Character.toUpperCase(line.charAt(i)));
                       }
                       else if (Character.isUpperCase(line.charAt(i))) {
                         System.out.print(Character.toLowerCase(line.charAt(i)));
                       }
                       else {                      
                         System.out.print(line.charAt(i));
                       }
                     }
                     System.out.println();                  
                   }
                   br.close();
            }
        }
