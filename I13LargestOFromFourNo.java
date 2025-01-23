
public class I13LargestOFromFourNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=310,b=21,c=186,d=590;
	/*	if(a>b && a>c && a>d)
		{
			System.out.println("a is greater no");
		}
		else if (b>a && b>c && b>d) {
			System.out.println("b is greater no");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("c is greater no");
		}
		else
		{
			System.out.println("d is greater no");
		}*/
		
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("a is greater no ");
				}
				else
				{
					System.out.println("d is greater no");
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is greater no");
				}
				else
				{
					System.out.println("d is greater no");
				}
			}
		}
		else if(b>c)
		{
			if(b>d)
			{
				System.out.println("b is greater no");
			}
			else
			{
				System.out.println("d is greater no");
			}
		}
		else if(c>a)
		{
			if(c>d)
			{
				System.out.println("c is greater no");
			}
			else
			{
				System.out.println("d is greater o");
			}
		}
		else
		{
			System.out.println("d is greater no");
		}

	}

}
