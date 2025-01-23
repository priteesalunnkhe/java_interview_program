import java.util.HashSet;
import java.util.Set;

public class I9DuplicateStringFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"priti","sachin","nitin","sachin","sunny","sunny"};
		/*for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]) && (i!=j))
				{
					System.out.println(s[j]);
				}
			}
		}*/

		Set<String> se=new HashSet<>();
		for(String str:s)
		{
			if(se.add(str)==false)
			{
				System.out.println(str);
			}

		}
	}

}
