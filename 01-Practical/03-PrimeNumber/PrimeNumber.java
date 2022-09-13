class PrimeNumber
{
	public static void main(String args[])
	{
		//variable declarations
		int iNum = 13,i = 2,iFlag = 0;
				
		//code
		do
		{
			if((iNum != 2) && (iNum%i == 0))
			{
						
					iFlag = 1;
					break;	
			}
			i++;
		}while(i<=(iNum/2));
		
		if(iFlag == 0)
			System.out.println(" "+iNum+" Is A Prime Number");
		else
			System.out.println(" "+iNum+" Is Not A Prime Number");
	}
}
