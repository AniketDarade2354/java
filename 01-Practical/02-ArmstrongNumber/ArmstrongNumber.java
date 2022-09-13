import java.lang.Math;
class ArmstrongNumber
{
	public static void main(String args[])
	{
		//variable declarations
		int iNumber = 370, iNum = 0;
		int iRemainder, iAvg = 0, iDividend;
		
		//code
		iNum = iNumber;
		while(iNum > 0)
		{
			
			iDividend = iNum / 10;
			iRemainder = iNum % 10;
			iNum = iDividend;
			iAvg = iAvg  + (int) Math.pow(iRemainder, 3);
		}
		
		if(iAvg == iNumber)
			System.out.println(" "+iNumber+" Is Armstrong Number !!!");
		else
			System.out.println(" "+iNumber+" Is Not Armstrong Number !!!");

		System.exit(0);
	}
}
