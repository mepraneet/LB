/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which accept string from user and accept one character, and return index of first occurance of that character
// Input: Marvellous Multi OS  Data= M
// Output:0
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class FirstOccuranceX
{
    public int FirstOccurance(String str, String iSearch)
    {
        char Arr[]=str.toCharArray();
        char ch=iSearch.charAt(0);

        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]==ch))
            {
                break;
            }
            iCount++;

        }
        return iCount;

    }
}
class program27_3
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter String:");
        String sValue1=sobj.nextLine();

        System.out.println("Enter character that you want to count First Occurance:");
        String sValue2=sobj.nextLine();

        FirstOccuranceX cobj=new FirstOccuranceX();
        iRet=cobj.FirstOccurance(sValue1,sValue2);

        System.out.println("Fist Occurance of character is: "+iRet);

    }
}