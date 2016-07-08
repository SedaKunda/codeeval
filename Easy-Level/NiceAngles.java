/*
Write a program that outputs the value of angle, reducing its fractional part to minutes and seconds.
*/

import java.io.*;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) {             
                     double d = Double.parseDouble(line);
                     int i = (int) d;
                     //get minutes
                     double f = d * 60;
                     double u = i * 60;
                     double diff = f-u;
                     int y = (int) diff;
                     //get seconds
                     double r = diff * 60;
                     double t = y * 60;
                     double diff2 = r-t;
                     int y2 = (int) diff2; 
                     System.out.println(i+"."+String.format("%02d", y)+"'"+String.format("%02d", y2)+"\"");
                   }                   
                   br.close();
            }
        }
