///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Write a program which accept string from user and check wether it contain CheckVowels or not (a,e,i,o,u)   
// Input:  MarvellouS 
// OutPut: TRUE 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CheckVowelX
{
    public boolean CheckVowel(String str)
    {
        char Arr[]=str.toCharArray();

        int iCnt=0;
        boolean bFlag=false;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]=='a') || (Arr[iCnt]=='e') || (Arr[iCnt]=='i') ||(Arr[iCnt]=='o') || (Arr[iCnt]=='u'))
               {
                bFlag=true;
               }
        }

        return bFlag;
    }
}
class program25_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter String:");
        String sValue=sobj.nextLine();

        CheckVowelX vobj=new CheckVowelX();
        bRet=vobj.CheckVowel(sValue);

        if(bRet==true)
        {
            System.out.println("Vowel is Present in String");
        }
        else 
        {
            System.out.println("Vowel is NOT Present in String");
        }

    }
}