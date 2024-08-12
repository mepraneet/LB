//write a program which accept N and print first 5 multiple of N
// input :18
//output: 

import java.util.*;

class MultipleDisplay
{
    public void Display(int iNo)
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=5; iCnt++)
        {
           System.out.println(iCnt*iNo);
        }
    }
}
class program5_5
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        MultipleDisplay dobj = new MultipleDisplay();
        dobj.Display(iValue);
    }
}