// Accept N nmubers from user and return difference btw summation of even and odd elements

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

        System.out.println("Enter Elements:");

        int i=0;

        for(i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public int SumEvenOdd()
    {
        int iCnt=0, iSumEven=0, iSumOdd=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]%2)==0)
            {
                iSumEven=iSumEven+Arr[iCnt];
            }

            if((Arr[iCnt]%2)!=0)
            {
                iSumOdd=iSumOdd+Arr[iCnt];
            }
        }

        return iSumEven-iSumOdd;
    }
}
class program19_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        iRet=aobj.SumEvenOdd();

        System.out.println("Summation of odd and even digits are:"+iRet);

    }
}