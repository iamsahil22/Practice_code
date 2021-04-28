
public class Random_code {

	public static void add()  			// Static method ko bina object ke bhi call kar sakte hai
	{
		int x =10;
		int y=12;
		int z = x+y;
		System.out.println(z);
	}
	
	public void name()				// non static method ko object ke thriugh call karna padhta hai
	{
		String s = "Taaza";
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		add();
		Random_code r = new Random_code();
		r.name();
		
	}

}
