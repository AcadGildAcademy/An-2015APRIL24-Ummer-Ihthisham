
public class Leap_Yr {

	public static void main(String[] args) {

		int year=2000;
		
		if(year%100==0 && year%400==0)
		{
			System.out.println(+year+ " is a Leap Year" );
		}
		
		else if(year%100!=0 && year%4==0)
		{
			System.out.println( +year+ " is a Leap Year " );
		}
		
		else
		{
			System.out.println( +year+ " is Not a Leap Year" );
		}
			

	}

}
