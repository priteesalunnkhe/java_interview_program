
public class I28MinMaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,12,1,67};
//max
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum="+max);		

		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
			}
		}
		System.out.println("minimum=" +min);
		
	}

}
