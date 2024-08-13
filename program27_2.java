/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which accept string from user and accept one character, and return frequency of that character
// Input: Marvellous Multi OS  N= l
// Output:3
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CountFrequencyX
{
    public int CountFrequency(String str, String iSearch)
    {
        char Arr[]=str.toCharArray();
        char ch=iSearch.charAt(0);

        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]==ch))
            {
                iCount++;
            }
        }
        return iCount;

    }
}
class program27_2
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter String:");
        String sValue1=sobj.nextLine();

        System.out.println("Enter character that you want to count frequency:");
        String sValue2=sobj.nextLine();

        CountFrequencyX cobj=new CountFrequencyX();
        iRet=cobj.CountFrequency(sValue1,sValue2);

        System.out.println("Frequency of character is: "+iRet);

    }
}