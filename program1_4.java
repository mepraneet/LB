//Accept one number and check is it devisible by 3 and 5 or not

import java.util.*;

class DivideX
{
    int iNo;

    public DivideX(int iValue)
    {
        this.iNo=iValue;
    }

    public boolean Divisible()
    {
        boolean bFlag=false;

        if((iNo%3)==0 && (iNo%5)==0)
        {
            bFlag=true;
        }
        return bFlag;
    }
}
class program1_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter Number:");
        int iValue= sobj.nextInt();

        DivideX dobj =new DivideX(iValue);
        
        bRet=dobj.Divisible();

        if(bRet==true)
        {
            System.out.println(iValue+" Number is divisible by 3 & 5");
        }
        else
        {
             System.out.println(iValue+" Number is NOT divisible by 3 & 5");
        }



    }
}