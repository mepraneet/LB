// write a program which accept number from user and return multiplication of all digits

import java.util.*;

class MultiDigitX
{
    public int MultiDigit(int iNo)
    {
        int iDigit=0, iMult=1;

        while(iNo!=0)
        {
            iDigit=iNo%10;

            iMult=iMult*iDigit;

            iNo=iNo/10;
        }

        return iMult;
    }
}
class program11_4
{
    public static void main(String A[])
    {
        Scanner sobj =new Scanner(System.in);
        int iValue= sobj.nextInt();

        System.out.println("Enter Number");

        MultiDigitX mobj= new MultiDigitX();
        int iRet=mobj.MultiDigit(iValue);

        System.out.println("Multiplication of digits are"+iRet);
    }
}