// write a program which accept number from user and return the count digit in btw 3 and 7

import java.util.*;

class CountRangeX
{
    public int CountRange(int iNo)
    {
        int iDigit=0,iCount=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;

            if((iDigit>=3) && (iDigit<=7))
            {
                iCount++;
            }

            iNo=iNo/10;
        }

        return iCount;
    }
}
class program11_3
{
    public static void main(String A[])
    {
        Scanner sobj =new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        CountRangeX cobj = new CountRangeX();

        iRet=cobj.CountRange(iValue);
        System.out.println("Count digits btw 3 to 7 are :"+iRet);
    }
}