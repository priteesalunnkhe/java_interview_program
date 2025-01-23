
public class I17PrimeNoFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,6,9,7,11,13,12};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
		for(int j=2;j<=a[i]-1;j++)
		{
			if(a[i]%j==0)
			{
				temp=temp+1;
				
				
			}
		}
		if(temp==0)
		{
			System.out.println(a[i]);
		}
		temp=0;
		}
	}

}
