///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept character from user and check weather it is alphabet or not
// Input:    F          &           10
// OutPut:  TRUE       FALSE       FALSE
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CheckCharacterX
{
    char str;

    public CheckCharacterX(char cValue)
    {
        this.str=cValue;
    }

    public boolean CheckCharacter()
    {
        boolean bFlag=false;

        if((str>='a') && (str<='z') || (str>='A') && (str<='Z'))
        {
            bFlag=true;
        }
        return bFlag;

    }
}
class program23_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter character:");
        char cValue=sobj.next().charAt(0);

        CheckCharacterX cobj= new CheckCharacterX(cValue);
        bRet=cobj.CheckCharacter();

        if(bRet==true)
        {
            System.out.println("It is character");
        }
        else 
        {
            System.out.println("NOT character");
        }


    }
}