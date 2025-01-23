
public class I24FactorialUsingRecursion {
	
	static int fact=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		I24FactorialUsingRecursion fr=new I24FactorialUsingRecursion();
		fr.calfact(no);
		System.out.println(fact);

	
	}
	void calfact(int n)
	{
		if(n>=1)
		{
			fact=fact*n;
			calfact(n-1);
		}
	}

}
