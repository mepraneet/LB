///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Write a program which accept string from user and Revesre string   
// Input:  India 
// OutPut: aidnI 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class DisplayReverseX
{
    public void DisplayReverse(String str)
    {
        char Arr[]=str.toCharArray();

        int iCnt=0;

        for(iCnt=Arr.length-1; iCnt>=0; iCnt--)
        {
            System.out.print(Arr[iCnt]);
        }
    }
}
class program25_5
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter String:");
        String sValue=sobj.nextLine();

        DisplayReverseX dobj = new DisplayReverseX();

        dobj.DisplayReverse(sValue);
    }
}