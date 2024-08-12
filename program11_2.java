// write a program which accept number from user and return the count of Odd number

import java.util.*;

class CountOddDigitX
{
    public int CountOddDigit(int iNo)
    {
        int iDigit=0, iOddCount=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;

            if((iDigit%2)!=0)
            {
                iOddCount++;
            }

            iNo=iNo/10;
        }

        return iOddCount;
    }
}
class program11_1
{
    public static void main(String A[])
    {
        Scanner sobj =new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        CountOddDigitX cobj = new CountOddDigitX();

        iRet=cobj.CountOddDigit(iValue);
        System.out.println("Count of Odd digits are :"+iRet);
    }
}