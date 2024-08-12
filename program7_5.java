//write program to find difference btwn odd and even factorial of given number

import java.util.*;

class FactorialDiffX
{
    public int FactorialDiff(int iNo)
    {
        int iCnt=0;
        int EvenFact=1;
         int OddFact=1;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iCnt%2)==0)
            {
                EvenFact=EvenFact*iCnt;
            }
        }

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iCnt%2)!=0)
            {
                OddFact=OddFact*iCnt;
            }
        }
        return EvenFact-OddFact;

    }
    
}
class program7_5
{
    public static void main(String A[])
    {
        Scanner sobj =new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        FactorialDiffX eobj = new FactorialDiffX();
        iRet=eobj.FactorialDiff(iValue);

        System.out.println("Factorial Difference is:"+iRet);
    }
}