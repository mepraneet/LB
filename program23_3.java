///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept character from user and check weather it is Digit or not
// Input:    5          &           a
// OutPut:  TRUE       FALSE       FALSE
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CheckDigitX
{
    char str;

    public CheckDigitX(char cValue)
    {
        this.str=cValue;
    }

    public boolean CheckDigit()
    {
        boolean bFlag=false;

        if((str>='0') && (str<='9'))
        {
            bFlag=true;
        }
        return bFlag;

    }
}
class program23_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter character:");
        char cValue=sobj.next().charAt(0);

        CheckDigitX cobj= new CheckDigitX(cValue);
        bRet=cobj.CheckDigit();

        if(bRet==true)
        {
            System.out.println("It is Digit");
        }
        else 
        {
            System.out.println("NOT Digit");
        }


    }
}