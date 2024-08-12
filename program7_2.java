// Accept amount in USD and convert it into INR, 1$=70INR

import java.util.*;

class DollerX
{
    public int Doller(int iNo)
    {
        int iConverter=0;
        iConverter=iNo*70;

        return iConverter;
    }
}
class program7_2
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number");
        int iValue=sobj.nextInt();

        DollerX dobj = new DollerX();
        iRet=dobj.Doller(iValue);

        System.out.println("US to INR is :"+iRet);
    }
}