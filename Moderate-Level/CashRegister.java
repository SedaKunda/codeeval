/*
The goal of this challenge is to design a cash register program. You will be given two float numbers. The first is the purchase price (PP) of the item. The second is the cash (CH) given by the customer. Your register currently has the following bills/coins within it:
*/

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
public class Main {
	ArrayList<String> al = new ArrayList<String>();
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           Main m = new Main();
           while ((line = br.readLine()) != null) { 
        	   m.al.clear();
        	   String[] s = line.split(";");
        	   BigDecimal i2 = new BigDecimal(s[1]);
        	   BigDecimal i1 = new BigDecimal(s[0]);
        	   BigDecimal diff = new BigDecimal(i2.subtract(i1).toString());
        	   if (diff.compareTo(BigDecimal.ZERO) < 0) {
        		   System.out.println("ERROR");
        	   }
        	   else if (diff.compareTo(BigDecimal.ZERO) == 0) {
        		   System.out.println("ZERO");
        	   }
        	   else {
        		   ArrayList<String> al2 = new ArrayList<String>();
        		   al2 = m.getChange(diff);
        		   String f = "";
        		   for (int i = 0; i < al2.size(); i ++) {
        			   f += al2.get(i) + ",";
        		   }
        		   System.out.println(f.substring(0, f.length()-1));
        	   }
           }
           br.close();
    }
   ArrayList<String> getChange(BigDecimal bd) {	  	
    	if ((bd.compareTo(new BigDecimal(100)) >= 0)) {
    		al.add("ONE HUNDRED");
    		return getChange(bd.subtract(BigDecimal.valueOf(100)));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(50)) >= 0)) {
    		al.add("FIFTY");
    		return getChange(bd.subtract(BigDecimal.valueOf(50)));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(20))  >= 0)) {
    		al.add("TWENTY");
    		return getChange(bd.subtract(BigDecimal.valueOf(20)));
    	}
    	else if ((bd.compareTo(BigDecimal.TEN)  >= 0)) {
    		al.add("TEN");
    		return getChange(bd.subtract(BigDecimal.TEN));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(5))  >= 0)) {
    		al.add("FIVE");
    		return getChange(bd.subtract(BigDecimal.valueOf(5)));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(2))  >= 0)) {
    		al.add("TWO");
    		return getChange(bd.subtract(BigDecimal.valueOf(2)));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(1))  >= 0)) {
    		al.add("ONE");
    		return getChange(bd.subtract(BigDecimal.valueOf(1)));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(0.5))  >= 0)) {
    		al.add("HALF DOLLAR");
    		return getChange(bd.subtract(BigDecimal.valueOf(0.5)));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(0.25)) >= 0)) {
    		al.add("QUARTER");
    		return getChange(bd.subtract(BigDecimal.valueOf(0.25)));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(0.1)) >= 0)) {
    		al.add("DIME");
    		return getChange(bd.subtract(BigDecimal.valueOf(0.1)));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(0.05)) >= 0)) {
    		al.add("NICKEL");
    		return getChange(bd.subtract(BigDecimal.valueOf(0.05)));
    	}
    	else if ((bd.compareTo(BigDecimal.valueOf(0.01)) >= 0)) {
    		al.add("PENNY");
    		return getChange(bd.subtract(BigDecimal.valueOf(0.01)));
    	}
    	else {
    		return al;
    	}
    }
}
