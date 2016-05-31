/*
You are given a prefix expression. Write a program which evaluates it.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static int counter = 0;
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           while ((line = br.readLine()) != null) { 
        	   List<String> c = new ArrayList<String>();
        	   List<String> d = new ArrayList<String>();
        	   String[] e = line.split(" ");
        	   for (int i = 0; i < e.length; i++) {
        		   if((e[i].matches("[0-9]*"))) {
        			  d.add(e[i]);
        		   }
        		   else {
        			  c.add(e[i]);
        		   }
        	   }
        	   int r = c.size()-1;
        	   double a = Integer.parseInt(d.get(0));
        	   for (int j = 1; j < d.size(); j++) {
        		   if ((c.get(r)).equals("*")) {
        			   a*=Integer.parseInt(d.get(j));
        		   }
        		   if ((c.get(r)).equals("+")) {
        			   a+=Integer.parseInt(d.get(j));
        		   }
        		   if ((c.get(r)).equals("/")) {
        			   a/=Integer.parseInt(d.get(j));
        		   }
        		   r--;
        	   }
        	   System.out.println(Math.round(a));
           }
           br.close();
    }
}
