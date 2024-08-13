///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Write a program which accept string from user and count number of capital character          
// Input:  Marvellous Multi OS 
// OutPut: 4
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CountCapitalX
{

    public int CountCapital(String str)
    {
        char Arr[]=str.toCharArray();
        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]>='A' && Arr[iCnt]<='Z')
            {
                iCount++;
            }
        }
        return iCount;
    }
    
}
class program25_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter String");
        String sValue=sobj.nextLine();

        CountCapitalX cobj =new CountCapitalX();
        iRet=cobj.CountCapital(sValue);
        System.out.println("Count of capital Character is:"+iRet);

    }
}