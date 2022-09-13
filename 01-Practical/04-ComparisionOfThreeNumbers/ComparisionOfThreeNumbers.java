class ComparisionOfThreeNumbers
{
	public static void main(String args[])
	{
		//variable declarations
		int iNum1 = 200, iNum2 = 50, iNum3 = 26;
		
		//code
		if(iNum1 > iNum2)
		{
			if(iNum1 > iNum3)
				System.out.println(" "+iNum1+" Is Biggest Number");
			else
				System.out.println(" "+iNum3+" Is Biggest Number");
		}
		else
			System.out.println(" "+iNum2+" Is Biggest Number");
	}
}