// write a program which accept number from user and return the count of even number

import java.util.*;

class CountEvenDigitX
{
    public int CountEvenDigit(int iNo)
    {
        int iDigit=0, iEvenCount=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;

            if((iDigit%2)==0)
            {
                iEvenCount++;
            }

            iNo=iNo/10;
        }

        return iEvenCount;
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

        CountEvenDigitX cobj = new CountEvenDigitX();

        iRet=cobj.CountEvenDigit(iValue);
        System.out.println("Count of Even digits are :"+iRet);
    }
}