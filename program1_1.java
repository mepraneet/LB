// Program to divide two numbers

import java.util.*;

class DivideX
{
    public int iNo1, iNo2;

    public DivideX(int iValue1, int iValue2)
    {
        this.iNo1=iValue1;
        this.iNo2=iValue2;
    }

    public int Devide()
    {
        int iAns= iNo1/iNo2;
        return iAns;
    }
}

class program1_1
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner (System.in);
        int iRet=0;

        System.out.println("Enter First Number:");
        int iValue1=sobj.nextInt();

        System.out.println("Enter Second Number:");
        int iValue2=sobj.nextInt();

        DivideX dobj = new DivideX(iValue1,iValue2);
        iRet=dobj.Devide();

        System.out.println("Division is :"+iRet);



    }
}