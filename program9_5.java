//Write a program which acceptrange from user and display all numbers in btw that range  Revers order

import java.util.*;

class RangeDisplayRevRevX
{
    public void RangeDisplayRev(int iNo1, int iNo2)
    {
        int iCnt=0;

        for(iCnt=iNo2; iCnt>=iNo1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}
class program9_5
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Starting Number:");
        int iValue1=sobj.nextInt();

        System.out.println("Enter Ending Number:");
        int iValue2=sobj.nextInt();

        RangeDisplayRevRevX robj= new RangeDisplayRevRevX();
        robj.RangeDisplayRev(iValue1, iValue2);
        
    }
}