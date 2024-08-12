//Write program which accept number from user check wether 0 contain or  ot

import java.util.*;

class CheckZeroX
{
    public boolean CheckZero(int iNo)
    {
        int iDigit=0;
        boolean bFlag=false;

        while(iNo!=0)
        {
            iDigit=iNo%10;
           
           if(iDigit==0)
           {
            bFlag=true;
           }
            iNo=iNo/10;
        }
        return bFlag;
    }
}
class program10_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        CheckZeroX dobj = new CheckZeroX();
        bRet=dobj.CheckZero(iValue);

        if(bRet==true)
        {
            System.out.println("Zero contain");
        }
        else 
        {
            System.out.println("Zero NOT contain");
        }
    }
}