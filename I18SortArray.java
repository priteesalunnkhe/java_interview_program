
public class I18SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,7,1,65,9};
		int temp;
		System.out.println("Original array" );
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i] + " ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array After Sorting" );
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		
	}

}
