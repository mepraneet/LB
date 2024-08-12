//write a program which accept number from user and displya its multiplication of factors
import java.util.*;

class MultiFactorX
{
    public int MultiFactor(int iNo)
    {
        int iCnt=0, iMult=1;

        for(iCnt=1; iCnt<=(iNo/2); iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                iMult=iMult*iCnt;
            }
        }

        return iMult;
    }
}
class program4_1
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        MultiFactorX mobj = new MultiFactorX();

        iRet=mobj.MultiFactor(iValue);

        System.out.println("Multilpication of factor is:"+iRet);



    }
}