
public class I15PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=121;
		int temp=no;
		int rem,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}

	}

}
