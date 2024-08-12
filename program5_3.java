//write a program which accept number from user and print number line
// input 4
//output: -4    -3  -2  -1  0   1   2   3   4

import java.util.*;

class DisplayX
{
    public void Display(int iNo)
    {
        int iCnt=0;

        for(iCnt=(-iNo); iCnt<=iNo; iCnt++)
        {
            System.out.print(" "+iCnt);
        }
    }
}
class program5_3
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