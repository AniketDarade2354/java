class GradeProgram
{
	public static void main(String args[])
	{
		//variable declaration
		int iNum = 75; 
		
		//code
		if(iNum >= 70)
		{
			if(iNum <= 100)
				System.out.println("A Grade");
			else
				System.out.println("Invalid Entry Of Marks !!!");
		}
		else if(iNum >= 60)
		{
			if(iNum < 70)
				System.out.println("B Grade");
			else
				System.out.println("Invalid Entry Of Marks !!!");
		}
		
		else if(iNum >= 50)
		{
			if(iNum < 60)
				System.out.println("C Grade");
			else
				System.out.println("Invalid Entry Of Marks !!!");
		}
		
		else if(iNum >= 40)
		{
			if(iNum < 50)
				System.out.println("D Grade");
			else
				System.out.println("Invalid Entry Of Marks !!!");
		}
		
		else if(iNum >= 35)
		{
			if(iNum < 40)
				System.out.println("E Grade");
			else
				System.out.println("Invalid Entry Of Marks !!!");
		}
		
		else
			System.out.println("FAIL !!!");
		
	}
}
