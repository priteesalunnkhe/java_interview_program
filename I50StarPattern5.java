
public class I50StarPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2;i<=4;i++)
		{
			for(int k=2;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
		
			System.out.println();
		}

	}

}
