import java.util.Scanner;

public class I22CalculatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	String yn;
		do
		{
		System.out.println("Enter No 1" );
		int no1=s.nextInt();
		System.out.println("Enter No 2" );
		int no2=s.nextInt();
		System.out.println("Select Symbol +,-,*,/");
		String sym=s.next();
		int res;
		switch(sym)
		{
		case "+":
			res=no1+no2;
			System.out.println(res);
			break;
		case "-":
			res=no1-no2;
			System.out.println(res);
			break;
		case "*":
			res=no1*no2;
			System.out.println(res);
			break;
		case "/":
			res=no1/no2;
			System.out.println(res);
			break;	
		default:
			System.out.println("Invalid Symbol");
			
		}
		System.out.println("do you want continue press Y or y");
		yn=s.next();
		}while(yn.equals("y") || yn.equals("Y"));
			
		

	}

}
