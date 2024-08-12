//write a program which accept number from user and display its factors in Reverse order
import java.util.*;

class RevFactorX
{
    public void RevFactor(int iNo)
    {
        int iCnt=0;

        for(iCnt=iNo/2; iCnt>0; iCnt--)
        {
            if((iNo%iCnt)==0)
            {
                 System.out.print(" "+iCnt);
            }
           
        }
    }
}
class program4_2
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        RevFactorX mobj = new RevFactorX();

        mobj.RevFactor(iValue);

    }
}