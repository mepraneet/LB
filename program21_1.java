///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept N number from user and accept one another numver as No , check wether No is present or not
// Input: N=6, NO= 85   66  3   66  93
// OutPut: TRUE
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ArrayX
{
    int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements:");
        int i=0;

        for(i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public boolean Check(int iNo)
    {
        boolean bFlag=false;
        int iCnt=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==iNo)
            {
                bFlag=true;
            }
        }
        return bFlag;
    }
}
class program21_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        System.out.println("Enter number which you want to check:");
        int iNo=sobj.nextInt();

        bRet=aobj.Check(iNo);

        if(bRet==true)
        {
            System.out.println(iNo+" Number is present");
        }
        else 
        {
            System.out.println(iNo+" Number is NOT present");
        }

    }
}