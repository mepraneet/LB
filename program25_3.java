///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Write a program which accept string from user and return diffference btw frequency of small and capital characters        
// Input:  MarvellouS 
// OutPut: 6(8-2)
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class DifferenceX
{
    public int Difference(String str)
    {
        char Arr[]=str.toCharArray();

        int iCnt=0,  iCapFrequency=0,   iSmallFrequency=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]>='a') && (Arr[iCnt]<='z'))
            {
                iCapFrequency++;
            }

            if((Arr[iCnt]>='A') && (Arr[iCnt]<='Z'))
            {
                iSmallFrequency++;
            }

        }

        return iCapFrequency-iSmallFrequency;
       
    }
}

class program25_3
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter String:");
        String sValue=sobj.nextLine();

        DifferenceX dobj = new DifferenceX();
        iRet=dobj.Difference(sValue);

        System.out.println("Difference of small and capital character is:"+iRet);
    }
}