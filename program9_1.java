//Write a program which acceptrange from user and display all numbers in btw that range 

import java.util.*;

class RangeDisplayX
{
    public void RangeDisplay(int iNo1, int iNo2)
    {
        int iCnt=0;

        for(iCnt=iNo1; iCnt<=iNo2; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}
class program9_1
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Starting Number:");
        int iValue1=sobj.nextInt();

        System.out.println("Enter Ending Number:");
        int iValue2=sobj.nextInt();

        RangeDisplayX robj= new RangeDisplayX();
        robj.RangeDisplay(iValue1, iValue2);
        
    }
}