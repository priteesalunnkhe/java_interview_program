
public class I23SwapNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=56,c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a);
		System.out.println("b="+b);

		//without third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
