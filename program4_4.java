////write a program which accept number from user and display its summation of its all non factors 

import java.util.*;

class SumNonFactorX
{

    public void DisplayNonFactors(int iNo)
    {
        int iCnt=0;

        System.out.println("NON Factors are:");

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iNo%iCnt)!=0)
            {
                System.out.println(iCnt);
            }
        }

    }

    public int SumNonFactor(int iNo)
    {
        int iCnt=0;
        int iSum=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iNo%iCnt)!=0)
            {
                iSum=iSum+iCnt;
            }
        }
        return iSum;
    }
}
class program4_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter Number:");
        int iValue=sobj.nextInt();

        SumNonFactorX dobj = new SumNonFactorX();
        dobj.DisplayNonFactors(iValue);
        int iRet=dobj.SumNonFactor(iValue);

        System.out.println("Summation of its all Non Factors are:"+iRet);
    }
}