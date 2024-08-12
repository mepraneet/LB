//Write program which accept number from user count frequency of such number which is less than 6

import java.util.*;

class CountX
{
    public int Count(int iNo)
    {
        int iDigit=0;
        int iCount=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
           
           if(iDigit<6)
           {
            iCount++;
           }
            iNo=iNo/10;
        }
        return iCount;
    }
}
class program10_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        CountX dobj = new CountX();
        iRet=dobj.Count(iValue);

        System.out.println("Frequency of number less than is:"+iRet);

    }
}