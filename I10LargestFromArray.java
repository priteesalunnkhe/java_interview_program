
public class I10LargestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,21,12,76,2};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
			

	}

}
