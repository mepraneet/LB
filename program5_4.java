//write a program which accept number from user and print all odd numbers upto that number
// input :18
//output: 1`3`5`7`9`11`13

import java.util.*;

class DisplayX
{
    public void Display(int iNo)
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iCnt%2)!=0)
            {
                System.out.print(" "+iCnt);
            }
        }
    }
}
class program5_4
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