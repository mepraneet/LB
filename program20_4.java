//Accept N numbers from user and return frequecny of 11

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
        int iCount=0;
        int iCnt=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==11)
            {
                iCount++;
            }
        }
        return iCount;
    }
   
}
class program20_4
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

        System.out.println("Frequency of 11 is:"+iRet);

    }
}