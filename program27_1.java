/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which accept string from user and accept one character, check weather that character prsent in string or not
// Input: Marvellous Multi OS  N= e
// Output:TRUE
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CheckChrX
{
    public boolean CheckChr(String str, String iSearch)
    {
        char Arr[]=str.toCharArray();
        char ch=iSearch.charAt(0);

        int iCnt=0;
        boolean bFlag=false;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt])==ch)
            {
                bFlag=true;
            }
        }
        return bFlag;
    }
}
class program27_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter String");
        String sValue1=sobj.nextLine();

        System.out.println("Enter character that you want to find: ");
        String sValue2=sobj.nextLine();

        CheckChrX cobj= new CheckChrX();
        bRet=cobj.CheckChr(sValue1,sValue2);

        if(bRet==true)
        {
            System.out.println("Character is Present");
        }
        else 
        {
            System.out.println("Character is NOT Present");
        }

    }
}