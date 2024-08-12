///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept character from user and check weather it is CAPITAL or not
// Input:    F          a           g
// OutPut:  TRUE       FALSE       FALSE
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CheckCapitalX
{
    char str;

    public CheckCapitalX(char cValue)
    {
        this.str=cValue;
    }

    public boolean CheckCapital()
    {
        boolean bFlag=false;

        if((str>=0) && (str<=9))
        {
            bFlag=true;
        }
        return bFlag;

    }
}
class program23_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter character:");
        char cValue=sobj.next().charAt(0);

        CheckCapitalX cobj= new CheckCapitalX(cValue);
        bRet=cobj.CheckCapital();

        if(bRet==true)
        {
            System.out.println("It is capital character");
        }
        else 
        {
            System.out.println("NOT capital character");
        }


    }
}