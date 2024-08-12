///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept N number from user and return Minimum number 
// Input: N=6, Elements= 85 66  3   66  93  88
// OutPut: 3
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

    public int Minimum()
    {
        int iCnt=0, iMin=Arr[0];

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]<iMin)
            {
                iMin=Arr[iCnt];
            }
        }
        return iMin;
    }
    
}
class program22_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        iRet=aobj.Minimum();

        System.out.println("Minimum elements is:"+iRet);

    }
}