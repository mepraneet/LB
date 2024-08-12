//Write program which accept number from user and display digit in reverse

import java.util.*;

class DisplayDigitX
{
    public void DisplayDigit(int iNo)
    {
        int iDigit=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            System.out.println(iDigit);
            iNo=iNo/10;
        }
    }
}
class program10_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        DisplayDigitX dobj = new DisplayDigitX();
        dobj.DisplayDigit(iValue);
    }
}