////write a program which accept number from user and return difference btw summation of FactDiffs and non FactDiffs 

import java.util.*;

class FactDiffX
{
    public int FactDiff(int iNo)
    {
        int iCnt=0;
        int iDiff=0;
        int iSumFact=0;
        int iSumNonFact=0;

        for(iCnt=1; iCnt<=(iNo/2); iCnt++)
        {
            if((iNo%iCnt)==0)
            {
              iSumFact=iSumFact+iCnt;
            }
        }

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iNo%iCnt)!=0)
            {
                iSumNonFact=iSumNonFact+iCnt;
            }
        }
        iDiff=iSumFact-iSumNonFact;
         return iDiff;
    }
    
}
class program4_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        FactDiffX dobj = new FactDiffX();
        int iRet=dobj.FactDiff(iValue);

        System.out.println("Difference is :"+iRet);
    }
}