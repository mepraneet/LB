///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Write a program which accept string from user and Count white spaces   
// Input:  India Is My Country
// OutPut: 4 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CountWhiteSpaceX
{
    public int CountWhiteSpace(String str)
    {
        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<str.length(); iCnt++)
        {
            if(str.charAt(iCnt)==' ')
            {
                iCount++;
            } 
        }

        return iCount;
       
    }
}

class program26_3
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter String:");
        String sValue=sobj.nextLine();

        CountWhiteSpaceX cobj= new CountWhiteSpaceX();
        iRet=cobj.CountWhiteSpace(sValue);

        System.out.println("Number of white spaces are:"+iRet);

    }
}