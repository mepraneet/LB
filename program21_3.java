///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept N number from user and accept one another number as No ,return index of Last occurance of that NO
// Input: N=6, NO= 66, Element=85   66  3   66  93
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

    public int LastOcc(int iNo)
    {
        int iCnt=0, iCount=0;

        for(iCnt=Arr.length-1; iCnt>=0; iCnt--)
        {
            if(Arr[iCnt]==iNo)
            {
               return iCnt;
            }
        }

        return -1;
    }

    
}
class program21_3
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

        iRet=aobj.LastOcc(iNo);

        if(iRet!=-1)
        {
            System.out.println("Index of Last occurance of "+iNo+" is :"+iRet);
        }
        else 
        {
            System.out.println("Element not present in array");
        }

        
       
    }
}