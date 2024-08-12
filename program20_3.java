//Accept N numbers from user and check wether that number contain 11 in it or not

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

    public boolean Check()
    {
        boolean bFlag=false;
        int iCnt=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==11)
            {
                bFlag=true;
            }
        }
        return bFlag;
    }
   
}
class program20_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter Number of elements you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj=new ArrayX(iValue);
        aobj.Accept();
        bRet=aobj.Check();

        if(bRet==true)
        {
            System.out.println("11 is contain in numbers");
        }
        else 
        {
            System.out.println("11 is NOT contain in numbers");
        }
        
    }
}