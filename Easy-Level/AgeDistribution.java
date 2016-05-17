/*
You're responsible for providing a demographic report for your local school district based on age. To do this, you're going determine which 'category' each person fits into based on their age.
The person's age will determine which category they should be in:
If they're from 0 to 2 the child should be with parents print : 'Still in Mama's arms' 
If they're 3 or 4 and should be in preschool print : 'Preschool Maniac' 
If they're from 5 to 11 and should be in elementary school print : 'Elementary school' 
From 12 to 14: 'Middle school' 
From 15 to 18: 'High school' 
From 19 to 22: 'College'
From 23 to 65: 'Working for the man' 
From 66 to 100: 'The Golden Years' 
If the age of the person less than 0 or more than 100 - it might be an alien - print: "This program is for humans"
*/

import java.io.*;
public class AgeDistribution {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line;      
            while ((line = br.readLine()) != null) {
           	int age = Integer.parseInt(line);
            	if (age < 0 | age > 100) {
            		System.out.println("This program is for humans");
            	}
            	else if (age >= 0 && age <= 2) {
            		System.out.println("Still in Mama's arms");
            	}
            	else if (age == 3 | age == 4) {
            		System.out.println("Preschool Maniac");
            	}
            	else if (age >= 5 && age <= 11) {
            		System.out.println("Elementary school");
            	}
            	else if (age >= 12 && age <= 14) {
            		System.out.println("Middle School");
            	}
            	else if (age >= 15 && age <= 18) {
            		System.out.println("High School");
            	}
            	else if (age >= 19 && age <= 22) {
            		System.out.println("College");
            	}
            	else if (age >= 23 && age <= 65) {
            		System.out.println("Working for the man");
            	}
            	else if (age >= 66 && age <= 100) {
            		System.out.println("The Golden Years");
            	}
            }
           br.close();
    }
}
