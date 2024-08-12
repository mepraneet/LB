//write program to find Odd factorial of given number

import java.util.*;

class OddFactorialX
{
    public int OddFactorial(int iNo)
    {
        int iCnt=0;
        int OddFact=1;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iCnt%2)!=0)
            {
                OddFact=OddFact*iCnt;
            }
        }
        return OddFact;

    }
    
}
class program7_4
{
    public static void main(String A[])
    {
        Scanner sobj =new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        OddFactorialX eobj = new OddFactorialX();
        iRet=eobj.OddFactorial(iValue);

        System.out.println("Odd Factorial is:"+iRet);
    }
}