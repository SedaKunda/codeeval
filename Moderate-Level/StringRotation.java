/*
You are given two strings. Determine if the second string is a rotation of the first string.
*/

import java.io.*;
public class Main {
	public static int counter = 0;
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           Main m = new Main();
           while ((line = br.readLine()) != null) { 
        	  counter = 0;
        	  String[] s = line.split(",");
        	  String a = s[0];
        	  String b = s[1];
        	  if (m.isRotation(a, b)) {
        	    System.out.println("True");
        	  }
        	  else {
        	       System.out.println("False");
        	  }
           }
           br.close();
    }
    boolean isRotation(String a, String b) {
    	if (a.equals(b) && counter < a.length()) {
  		  return true;
    	}
  	  	else if ((!a.equals(b)) && counter < a.length()){
  	  	  counter++;
  		  return isRotation(a.substring(1, a.length()) + a.charAt(0), b);
  	  	}
  	  	else {
  	  	  return false;
  	  	}
    }
}
