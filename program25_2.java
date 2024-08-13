///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Write a program which accept string from user and count number of small character          
// Input:  Marvellous Multi OS 
// OutPut: 13
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CountSmallX
{
    public int CountSmall(String str)
    {
        char Arr[]=str.toCharArray();

        int iCnt=0,iCount=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]>='a') && (Arr[iCnt]<='z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class program25_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter String:");
        String sValue=sobj.nextLine();

        CountSmallX cobj=new CountSmallX();
        iRet=cobj.CountSmall(sValue);

        System.out.println("Count of small character is:"+iRet);

    }
}