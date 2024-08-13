/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which accept string from user and accept one character, and return index of Last occurance of that character
// Input: Marvellous Multi OS  Data= l
// Output:7
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LastOccuranceX
{
    public int LastOccurance(String str, String iSearch)
    {

        char Arr[]=str.toCharArray();
        char ch=iSearch.charAt(0);

        int iCnt=0;

        for(iCnt=Arr.length-1; iCnt>=0; iCnt--)
        {
            if((Arr[iCnt]==ch))
            {
                return iCnt;
            }

        }
        return -1;

    }
}
class program27_4
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter String:");
        String sValue1=sobj.nextLine();

        System.out.println("Enter character that you want to count Last Occurance:");
        String sValue2=sobj.nextLine();

        LastOccuranceX cobj=new LastOccuranceX();
        iRet=cobj.LastOccurance(sValue1,sValue2);

        if(iRet==-1)
        {
            System.out.println("Character Not Present");
        }
        else 
        {
            System.out.println("Last Occurance of character is: "+iRet);
        }

    }
}