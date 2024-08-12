//write a program which accept one number from user and print that number of even number 
//Input :7 
//Output: 2   4   6   8   10  12  14

import java.util.*;

class DisplayEvenX
{
    public void DisplayEven(int iNo)
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            // if((iCnt%2)==0)
            // {
            //     System.out.println(iCnt);
            // }

            System.out.println(2*iCnt);
        }
    }
}
class program3_1
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue= sobj.nextInt();

        DisplayEvenX dobj = new DisplayEvenX();
        dobj.DisplayEven(iValue);

    }

}