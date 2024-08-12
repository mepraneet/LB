///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept N number from user and accept one another number as No ,return index of first occurance of that NO
// Input: N=6, NO= 66, Element=85   66  3   66  93
// OutPut: 1
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

    public int FirstOcc(int iNo)
    {
        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==iNo)
            {
              break;
            }
            iCount++;
        }
        return iCount;
    }

    
}
class program21_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        System.out.println("Enter elements you want to find Index:");
        int iNo=sobj.nextInt();

        iRet=aobj.FirstOcc(iNo);

        System.out.println("Index of First occurance of "+iNo+" is :"+iRet);
       
    }
}