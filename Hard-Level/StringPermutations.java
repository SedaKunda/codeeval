/*
Write a program which prints all the permutations of a string in alphabetical order. We consider that digits < upper case letters < lower case letters. The sorting should be performed in ascending order.
*/

import java.io.*;
import java.util.*;
public class Main {
	static List<String> a = new ArrayList<String>();
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
           String line;
           while ((line = br.readLine()) != null) { 
        	   a.clear();
        	   Main.permute3(line); 
        	   Collections.sort(a, new Comparator<String>() {
					@Override
					public int compare(String s1, String s2) {
						return s1.compareTo(s2);
					}
        		});
        	   System.out.print(a.get(0));
        	   for (int i = 1; i < a.size(); i++) {        		   
        		   System.out.print("," + a.get(i));
        	   }
        	   System.out.println();
           }
           br.close();
    }
    public static void permute3 (String s) {
    	permute3("",s);
    	
    }
    private static void permute3 (String p, String s) {
    	if (s.length()==0) {
    		a.add(p);
    	}
    	else {
    		for (int i = 0; i < s.length(); i++) {
    			permute3(p+s.charAt(i), s.substring(0, i) + s.substring(i+1, s.length()));
    		}
    	}

    }
}
