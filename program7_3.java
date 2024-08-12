//write program to find even factorial of given number

import java.util.*;

class EvenFactorialX
{
    public int EvenFactorial(int iNo)
    {
        int iCnt=0;
        int EvenFact=1;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iCnt%2)==0)
            {
                EvenFact=EvenFact*iCnt;
            }
        }
        return EvenFact;

    }
    
}
class program7_3
{
    public static void main(String A[])
    {
        Scanner sobj =new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        EvenFactorialX eobj = new EvenFactorialX();
        iRet=eobj.EvenFactorial(iValue);

        System.out.println("Even Factorial is:"+iRet);
    }
}