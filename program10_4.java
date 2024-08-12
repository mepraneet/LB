//Write program which accept number from user count frequency of 4

import java.util.*;

class CountFourX
{
    public int CountFour(int iNo)
    {
        int iDigit=0;
        int iCount=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
           
           if(iDigit==4)
           {
            iCount++;
           }
            iNo=iNo/10;
        }
        return iCount;
    }
}
class program10_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        CountFourX dobj = new CountFourX();
        iRet=dobj.CountFour(iValue);

        System.out.println("Frequency of Four is:"+iRet);

       
    }
}