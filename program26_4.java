///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Write a program which accept string from user and Display only digits from that string   
// Input:  MarveLL46Ou98s
// OutPut: 4698 
// Remark: Incompete Logic
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class DisplayDigitX
{
    public void DisplayDigit(String str)
    {
        char Arr[]=str.toCharArray();
        char ch=str.charAt(0);

        int iCnt=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
                
        }
       
    }
}

class program26_4
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter String:");
        String sValue=sobj.nextLine();

        DisplayDigitX dobj= new DisplayDigitX();
        dobj.DisplayDigit(sValue);

    }
}