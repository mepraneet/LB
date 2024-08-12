///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept N number from user and display all such number which contain 3 digits in it 
// Input: N=6, Elements= 8225   665 3   76  953 858
// OutPut: 665  953 858
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

    public void Display()
    {
        int iCnt=0;
        int iDigit=0;
        int iCount=0;
        int temp=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            temp=Arr[iCnt];
            iCount=0; //ReInitialize iCount bcz Count Value Increase in Loop

            while(temp!=0)
            {
                iDigit=temp%10;
                iCount++;
                temp=temp/10;
            }

            if(iCount==3)
            {
                System.out.println(Arr[iCnt]);
            }

        }

    }
    
}
class program22_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        aobj.Display();

    }
}