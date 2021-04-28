package Java_Basics;

public class DataTypes_Limit {

	public static void main(String[] args) {
		byte b = -128;
		byte v = 127;
		
		short s = -32768;
		short f = 32767;
		
		int i =-2147483648;
		int q = 2147483647;
		
		long l = 123456; // long has the values of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
		
		float z =i;  // we can convert the integer value into float but not vice versa
		
		char c = 'S'; // char takes 2 bytes
		
		//double x = 22222222222;
		
		
		System.out.println("byte minimum limit"+b);
		System.out.println("byte minimum limit"+v);
		
		
		System.out.println("short minimum limit"+s);
		System.out.println("short maximum limit"+f);
		
		System.out.println("integer minimum limit"+i);
		System.out.println("integer maximum limit"+q);
		
		System.out.println(c);
		
		System.out.println("float value is"+z);
	}
	
}
