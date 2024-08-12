///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept character from user and check weather it is small case or not
// Input:    a          H           R
// OutPut:  TRUE       FALSE       FALSE
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CheckSmallX
{
    char str;

    public CheckSmallX(char cValue)
    {
        this.str=cValue;
    }

    public boolean CheckSmall()
    {
        boolean bFlag=false;

        if((str>='a') && (str<='z'))
        {
            bFlag=true;
        }
        return bFlag;

    }
}
class program23_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter character:");
        char cValue=sobj.next().charAt(0);

        CheckSmallX cobj= new CheckSmallX(cValue);
        bRet=cobj.CheckSmall();

        if(bRet==true)
        {
            System.out.println("It is Small case character");
        }
        else 
        {
            System.out.println("NOT Small case charactergit");
        }


    }
}