//Write a program which acceptrange from user and return addition of all numbers in btw that range

import java.util.*;

class RangeSumX
{
    public int RangeSum(int iNo1, int iNo2)
    {
        int iCnt=0, iSum=0;

        for(iCnt=iNo1; iCnt<=iNo2; iCnt++)
        {
            iSum=iSum+iCnt;
        }

        return iSum;
    }
}
class program9_3
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Starting Number:");
        int iValue1=sobj.nextInt();

        System.out.println("Enter Ending Number:");
        int iValue2=sobj.nextInt();

        RangeSumX robj= new RangeSumX();
        iRet= robj.RangeSum(iValue1, iValue2);
        System.out.println("Addition of Range numbers are:"+iRet);
        
    }
}