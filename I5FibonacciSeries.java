
public class I5FibonacciSeries {
	public static void main(String args[])
	{
		int a=0,b=1,seqcount=7,c;
		System.out.print(a);
		System.out.print(","+b);
		for(int i=1;i<=seqcount;i++)
		{
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			
			
		}
	
		
	}

}
