import java.util.ArrayList;

public class I31EvenOddNo_EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,3,7,11,4,9,19};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		
		}
	/*	ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			else
			{
				al2.add(a[i]);
			}
		}
		System.out.print("Even No=" );
		int total1=0,total2=0;
		for(int no:al1)
		{
			total1=total1+no;
			System.out.print(no + " ");
		}
		System.out.println("Total Even Number in array="+al1.size());
		System.out.println("Sum of Even Number"+total1);
		System.out.print("odd No=" );
		for(int no:al2)
		{
			total2=total2+no;
			System.out.print(no + " ");
		}
		System.out.println("Total odd Number in array="+al2.size());
		System.out.println("Sum of Odd Number"+total2);
*/
	}

}
