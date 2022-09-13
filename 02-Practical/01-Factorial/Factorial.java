class Factorial
{
	public static void main(String args[])
	{
		//variable declarations
		int iFact = 1,iNum = 5,i;
		
		//code
		for(i = 1;i <= iNum;i++)
		{
			iFact = iFact * i;
			
		}
		System.out.println("Factorial of " +iNum+" Is " +iFact);
	}
}
