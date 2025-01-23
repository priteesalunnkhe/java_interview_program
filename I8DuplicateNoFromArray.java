import java.util.HashSet;
import java.util.Set;

public class I8DuplicateNoFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,2,3,4};
	/*	System.out.print("duplicate no=");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)	
			{
				if((a[i]==a[j])&& (i!=j))
				{
					System.out.print(a[j]+",");
				}
			}
		}*/
		
		Set<Integer> s=new HashSet<>();
		for(int no:a)
		{
			if(s.add(no)==false)
			{
				System.out.println (no);
			}
		}
	}
		

}
