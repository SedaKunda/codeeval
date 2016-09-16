//Write a program which prints the endianness of the system.

import java.nio.ByteOrder;

public class Main {
    public static void main(String[] args) {
    	if(ByteOrder.nativeOrder()==ByteOrder.LITTLE_ENDIAN) {
    		System.out.print("LittleEndian");
    	}
    	else {
    		System.out.print("BigEndian");
    	}
    }
}
