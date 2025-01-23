
public class I26FibonacciSeriesUsingRecursion {
	
	static int a=0,b=1,c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(a + ",");
		System.out.print(b + "," );
		I26FibonacciSeriesUsingRecursion fibre=new I26FibonacciSeriesUsingRecursion();
		fibre.calfibonacci(10);

	}
	void calfibonacci(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.print(c + ",");
			a=b;
			b=c;
			calfibonacci(i-1);
		}
	}

}
