/*
Write a program which reads a file and prints to stdout the specified number of the longest lines that are sorted based on their length in descending order.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class LongestLine {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            ArrayList<String> a = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
            	a.add(line);
            }
            int i = Integer.valueOf((String) a.get(0));
            a.remove(0);    
            Collections.sort(a,new Comparator<String>()
    		{
    		  public int compare(String s1,String s2)
    		   {
    		    return s2.length() - s1.length();
    		    }
    		}); 
            for (int j = 0; j < i; j++) {
            	System.out.println(a.get(j));
            }
           br.close();
}
}
