// Accept N numberfrom user and display all such elements which are multiple of 11


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

    public void DivisibleByThreeAndFive()
    {
        int iCnt=0;

        System.out.println("Element which are multiple of 11");

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]%11)==0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}
class program19_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        aobj.DivisibleByThreeAndFive();

    }
}