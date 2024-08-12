//Accept N numbers from user and return difference btw freqency of even and odd numbers

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
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter elements:");
        int i=0;

        for(i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public int Frequency()
    {
        int iCnt=0, iEvenFrequency=0,iOddFrequency=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]%2)==0)
            {
                iEvenFrequency++;
            }

            if((Arr[iCnt]%2)!=0)
            {
                iOddFrequency++;
            }
        }

        return iEvenFrequency-iOddFrequency;
    }
}
class program20_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj=new ArrayX(iValue);
        aobj.Accept();
        iRet=aobj.Frequency();
        System.out.println("Difference of frequency is:"+iRet);
    }
}