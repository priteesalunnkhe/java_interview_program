
public class I26LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2015;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not leap year");
				}
			}
			else
			{
				System.out.println("leap year");
			}
		}
		else
		{
			System.out.println("not leap year");
		}

	int year1=2008;
	
	if((year1%400==0) || ((year1%4==0) && (year1%100!=0)))
	{
		System.out.println("year 1 leap year");
	}
	else
	{
		System.out.println("year 1 not leap year");
	}
		

}
}