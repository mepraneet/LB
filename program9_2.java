//Write a program which acceptrange from user and display all Even numbers in btw that range 

import java.util.*;

class RangeEvenDisplay
{
    public void RangeDisplay(int iNo1, int iNo2)
    {
        int iCnt=0;

        for(iCnt=iNo1; iCnt<=iNo2; iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class program9_2
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Starting Number:");
        int iValue1=sobj.nextInt();

        System.out.println("Enter Ending Number:");
        int iValue2=sobj.nextInt();

        RangeEvenDisplay robj= new RangeEvenDisplay();
        robj.RangeDisplay(iValue1, iValue2);
        
    }
}