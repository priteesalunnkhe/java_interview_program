
public class I3CharacterCountOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		String s="Hello Java";
		int count=0;
	//with whitespace
	/*
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
   System.out.println(count);
	}*/
	//without white space
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	
}
