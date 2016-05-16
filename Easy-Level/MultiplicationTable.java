/*
Print out the grade school multiplication table upto 12*12.
*/

import java.io.*;
public class MultplicationTable {
    public static void main (String[] args) throws IOException {
            	int arr[][] = new int[12][12];
            	arr[0][0] = 1;
            	arr[0][1] = 2;
            	arr[0][2] = 3;
            	arr[0][3] = 4;
            	arr[0][4] = 5;
            	arr[0][5] = 6;
            	arr[0][6] = 7;
            	arr[0][7] = 8;
            	arr[0][8] = 9;
            	arr[0][9] = 10;
            	arr[0][10] = 11;
            	arr[0][11] = 12;
            	arr[1][0] = 2;
            	arr[2][0] = 3;
            	arr[3][0] = 4;
            	arr[4][0] = 5;
            	arr[5][0] = 6;
            	arr[6][0] = 7;
            	arr[7][0] = 8;
            	arr[8][0] = 9;
            	arr[9][0] = 10;
            	arr[10][0] = 11;
            	arr[11][0] = 12;            	
            	for (int i = 1; i < 12; i++) {
            		for (int j = 1; j < 12; j++) {
                		arr[i][j] = arr[i][0] * arr[0][j];
                	}
            	}
            	
            	for (int k = 0; k < 12; k++) {
            		for (int i = 0; i < 12; i++) {
                		System.out.printf("%4d", arr[k][i]);
                	}
            		System.out.println();
            	}
    }
}
