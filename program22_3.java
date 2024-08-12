///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept N number from user and return difference btw largest and smallest number 
// Input: N=6, Elements= 85 66  3   66  93  88
// OutPut: 90(93-3)
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

    public int Difference()
    {
        int iCnt=0, iMax=Arr[0],iMin=Arr[0];

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]>iMax)
            {
                iMax=Arr[iCnt];
            }

            if(Arr[iCnt]<iMin)
            {
                iMin=Arr[iCnt];
            }
        }

        return iMax-iMin;
    }
    
}
class program22_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        iRet=aobj.Difference();

        System.out.println("Difference of maximum and minimum elements is:"+iRet);

    }
}