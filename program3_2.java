// Write program which accept number from user and print even factor of that number

import java.util.*;

class FactorX
{
    public void Factor(int iNo)
    {
        int iCnt=0;

        System.out.println("Even Factor of Number are :");

        for(iCnt=1; iCnt<=(iNo/2); iCnt++)
        {
            if((iCnt%2)==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class program3_2
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue=sobj.nextInt();

        FactorX fobj = new FactorX();
        fobj.Factor(iValue);
    }
}