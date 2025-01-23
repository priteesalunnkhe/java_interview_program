
public class I12LargestNoFromThreeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=191,b=28,c=667;
	/*	if (a>b && a>c)
		{
			System.out.println("a is largest no");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is largest no");
		}
		else
		{
			System.out.println("c is largest no");
		}*/
		if(a>b)
		{
			if (a>c)
			{
				System.out.println("a is largest no");
			}
			else
			{
				System.out.println("c is largest no");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is largest no");
			}
			else
			{
				System.out.println("c is largest no");
			}
				
		}
	}

}
