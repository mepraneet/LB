///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept N number from user and accept Range,Display all element from that range
// Input: N=6, Start=60, End=90, Elements= 85   66  3   66  93
// OutPut: 66   76  88
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

    public void DisplayRange(int iStart, int iEnd)
    {
        int iCnt=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]>=iStart)  && (Arr[iCnt]<=iEnd))
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }

    
}
class program21_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        System.out.println("Enter Starting Point Number:");
        int iStart=sobj.nextInt();

        System.out.println("Enter Ending Point Number:");
        int iEnd=sobj.nextInt();

        aobj.DisplayRange(iStart,iEnd);

    }
}