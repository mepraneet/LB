//write a program which accept number from user and print numbers till that  number

import java.util.*;

class DisplayX
{
    public void Display(int iNo)
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}
class program5_2
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        DisplayX dobj = new DisplayX();
        dobj.Display(iValue);
    }
}