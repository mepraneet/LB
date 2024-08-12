// write program to accept number from user and display below pattern
// Input : 5
//output : *****#####

import java.util.*;

class DisplayX
{
    public void Display(int iNo)
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            System.out.print("*");
        }
        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            System.out.print("#");
        }
    }
}
class program7_1
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number");
        int iValue=sobj.nextInt();

        DisplayX dobj = new DisplayX();
        dobj.Display(iValue);
    }
}