////write a program which accept number from user and display its all Non factors 

import java.util.*;

class DisplayFactorX
{
    public void DisplayFactors(int iNo)
    {
        int iCnt=0;

        System.out.println("Factors are:");
        for(iCnt=1; iCnt<=(iNo/2); iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                System.out.println(iCnt);
            }
        }
    }

    public void DisplayNonFactors(int iNo)
    {
        int iCnt=0;

        System.out.println(" NON Factors are:");

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iNo%iCnt)!=0)
            {
                System.out.println(iCnt);
            }
        }

    }
}
class program4_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter Number:");
        int iValue=sobj.nextInt();

        DisplayFactorX dobj = new DisplayFactorX();
        dobj.DisplayFactors(iValue);
        dobj.DisplayNonFactors(iValue);
    }
}