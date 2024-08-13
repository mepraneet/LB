///////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Count white spaces from string
// Input: India is Great
// OutPut: 2
///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class String1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str=sobj.nextLine();

        char Arr[]=str.toCharArray();

        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==' ')
            {
                iCount++;
            }
        }

        System.out.println("White Space are: "+iCount);

    }
}