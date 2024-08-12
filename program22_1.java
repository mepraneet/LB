///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept N number from user and return Largest number 
// Input: N=6, Elements= 85 66  3   66  93  88
// OutPut: 93
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

    public int Maximum()
    {
        int iCnt=0, iMax=Arr[0];

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]>iMax)
            {
                iMax=Arr[iCnt];
            }
        }

        return iMax;

    }
    
}
class program22_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        iRet=aobj.Maximum();

        System.out.println("Maximum elements is:"+iRet);

    }
}