package oops_concept;

public class basic_Return_method {

	public static void main(String[] args) {
		int a =19;
		int b =20;
		int c =func(a,b);
		System.out.println("Minimum value is "+c);
		
	}
		public static int func(int x, int y)
		{
			int min;
			if(x>y)
			{
				min =y;
			}
			else
				min =x;
			return min;
		}
}
