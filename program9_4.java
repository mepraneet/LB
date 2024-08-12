//Write a program which acceptrange from user and return addition of Even numbers in btw that range

import java.util.*;

class RangeSumEvenEvenX
{
    public int RangeSumEven(int iNo1, int iNo2)
    {
        int iCnt=0, iSum=0;

        for(iCnt=iNo1; iCnt<=iNo2; iCnt++)
        {
            if(iCnt%2==0)
            {
                iSum=iSum+iCnt;
            }
        }

        return iSum;
    }
}
class program9_4
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Starting Number:");
        int iValue1=sobj.nextInt();

        System.out.println("Enter Ending Number:");
        int iValue2=sobj.nextInt();

        RangeSumEvenEvenX robj= new RangeSumEvenEvenX();
        iRet= robj.RangeSumEven(iValue1, iValue2);
        System.out.println("Addition of Range Even numbers are:"+iRet);
        
    }
}