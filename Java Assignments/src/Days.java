
public class Days {

	public static void main(String[] args) {
		
		String month="February";
		
		switch(month)
		{
			case "January":
			case "March":
			case "May":
			case "July":
			case "August":
			case "October":
			case "December":
			
			System.out.println("Number of days in " + month + " is 31");
			break;
		
			case "April":
			case "June":
			case "September":
			case "November":
				System.out.println("Number of days in " + month + " is 30");
				break;
			
			case "February":
				System.out.println("Number of days in " + month + " is 28 or 29");
				break;
			default:
				System.out.println("Invalid Month");
				break;
			
		}

	}

}
