class SwitchCase
{
	public static void main(String args[])
	{
		//variable declaration
		String str = "Monday";
		
		//code
		switch(str)
		{
			case "Monday":
			case "monday":
			case "MONDAY":
				System.out.println("Aloo Paratha");
				break;
			
			case "Tuesday":
			case "tuesday":
			case "TUESDAY":
				System.out.println("Muttor Paneer");
				break;
			
			case "Wednesday":
			case "wednesday":
			case "WEDNESDAY":
				System.out.println("Fried Rice");
				break;
			
			case "Thursday":
			case "thursday":
			case "THURSDAY":
				System.out.println("Pav Bhaji");
				break;
			
			case "Friday":
			case "friday":
			case "FRIDAY":
				System.out.println("Masala Dosa");
				break;
			
			case "Saturday":
			case "saturday":
			case "SATURDAY":
				System.out.println("Aloo Gobi");
				break;
			
			case "Sunday":
			case "sunday":
			case "SUNDAY":
				System.out.println("Closed !!!");
				break;
				
			default:
				System.out.println("Invalid Entry Of Day's");
				break;
				
		}
	}
}