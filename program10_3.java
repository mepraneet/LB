//Write program which accept number from user count frequency of 2

import java.util.*;

class CountTwoX
{
    public int CountTwo(int iNo)
    {
        int iDigit=0;
        int iCount=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
           
           if(iDigit==2)
           {
            iCount++;
           }
            iNo=iNo/10;
        }
        return iCount;
    }
}
class program10_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        CountTwoX dobj = new CountTwoX();
        iRet=dobj.CountTwo(iValue);

        System.out.println("Frequency of Two is:"+iRet);

       
    }
}