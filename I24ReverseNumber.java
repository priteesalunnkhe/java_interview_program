
public class I24ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=2316;
		int rev=0,rem;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
	}

}
