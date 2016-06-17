import java.io.*;
import java.util.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           Main m = new Main();
           while ((line = br.readLine()) != null) { 
        	   int i = Integer.parseInt(line);
        	   if (i==0) {
        		   System.out.println("ZeroDollars");
        	   }
        	   else {
        		   System.out.println(m.word(i) +"Dollars");
        	   }
           }
           br.close();
    }
    String word(int i) {
    	Map<Integer, String> m = new HashMap<Integer, String>();
    	m.put(1, "One");
    	m.put(2, "Two");
    	m.put(3, "Three");
    	m.put(4, "Four");
    	m.put(5, "Five");
    	m.put(6, "Six");
    	m.put(7, "Seven");
    	m.put(8, "Eight");
    	m.put(9, "Nine");
    	m.put(10, "Ten");
    	m.put(11, "Eleven");
    	m.put(12, "Twelve");
    	m.put(13, "Thirteen");
    	m.put(14, "Fourteen");
    	m.put(15, "Fifteen");
    	m.put(16, "Sixteen");
    	m.put(17, "Seventeen");
    	m.put(18, "Eighteen");
    	m.put(19, "Nineteen");
    	m.put(20, "Twenty");
    	m.put(30, "Thirty");
    	m.put(40, "Forty");
    	m.put(50, "Fifty");
    	m.put(60, "Sixty");
    	m.put(70, "Seventy");
    	m.put(80, "Eighty");
    	m.put(90, "Ninety");
    	if (i > 0 && i <= 20) {
    		return m.get(i);
    	}
    	if (i > 20 && i < 100) {
    		int y = i-(i%10);
    		int z = i%10;
    			return m.get(y)+this.word(z);
    	}
    	if (i >= 100 && i < 1000) {
    		int y = i-(i%100);
    		int z = i%100;
    			return m.get(y/100)+"Hundred"+this.word(z);
    	}
    	if (i >= 1000 && i < 10000) {
    		int y = i-(i%1000);
    		int z = i%1000;
    			return m.get(y/1000)+"Thousand"+this.word(z);
    	}
    	if (i >= 10000 && i < 1000000) {
    		int y = i-(i%1000);
    		int z = i%1000;
    			return this.word(y/1000)+"Thousand"+this.word(z);
    	}
    	if (i >= 1000000 && i < 1000000000) {
    		int y = i-(i%1000000);
    		int z = i%1000000;
    			return this.word(y/1000000)+"Million"+this.word(z);
    	}
    	return "";
    }
}
