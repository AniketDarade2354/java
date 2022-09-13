class FebonnaciSeries
{
	public static void main(String args[])
	{
		//variable declarations
		int iNum1 = 0, iNum2 = 1;
		int iSum, i;
		int iCount =10;
		
		//code
		System.out.print("Febonnaci Series : ");
		System.out.print("\n "+iNum1+"\n "+iNum2);
	
		for(i = 2;i < iCount;i++)
		{
		    iSum = iNum1 + iNum2;
			System.out.print("\n "+iSum);
			iNum1 = iNum2;
			iNum2 = iSum;
		
		}
		
		System.exit(0);
	}
}

