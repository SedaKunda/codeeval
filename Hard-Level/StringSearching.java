/*
You are given two strings. Determine if the second string is a substring of the first (Do NOT use any substr type library function). The second string may contain an asterisk(*) which should be treated as a regular expression i.e. matches zero or more characters. The asterisk can be escaped by a \ char in which case it should be interpreted as a regular '*' character. To summarize: the strings can contain alphabets, numbers, * and \ characters.
*/

import java.io.*;
        public class Main {
            public static void main (String[] args) throws IOException {
                File file = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(file));
                   String line;
                   while ((line = br.readLine()) != null) { 
                	   String[] a = line.split(",");
                	   String frstw = a[0];
                	   String lastw = a[1];
                	   int last = lastw.length();
                	   boolean b = false;                	   
                	   if(lastw.contains("*") && !lastw.contains("\\*") && lastw.charAt(last-1)!='*') {
                		   String[] ast = lastw.split("\\*");
                		   String fw = ast[0];
                    	   String lw = ast[1];
                    	   if (frstw.matches(".*"+fw+".*"+lw+".*")) {
                			   b = true;
                		   }
                	   }
                	   else if (lastw.charAt(last-1)=='*' && lastw.length()>1) {
                		   String[] ast = lastw.split("\\*");
                		   String fw = ast[0];
                    	   if (frstw.matches(".*"+fw+".+")) {
                			   b = true;
                		   }
                	   }
                	   else if (lastw.charAt(last-1)=='*' && lastw.length()==1) {
                		   b = true;
                	   }
                	   else if ( lastw.contains("\\*")) {
                		   lastw = lastw.replace("\\", "");
                		   if (frstw.contains(lastw)) {
                			   b = true;
                		   }
                	   }
                	   else {
                		   if (frstw.contains(lastw)) {
                			   b = true;
                		   }        	        	  
                	   }
                	   System.out.println(b);
                   }
                   br.close();
            }
        }
