// Accept N numberfrom user and display all such elements which are Even and  divisible by 5

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

    public void DivisibleByEvenAndFive()
    {
        int iCnt=0;

        System.out.println("Element which is Even and  Divisible by 5 are");

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]%2)==0 && (Arr[iCnt]%5)==0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}
class program19_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        aobj.DivisibleByEvenAndFive();

    }
}