///////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Count number of words from string
// Input: India is Great
// OutPut: 3
///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class String2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str=sobj.nextLine();

        str=str.trim(); // to remove starting and ending white spaces
        str=str.replaceAll("\\s+"," ");  // to remove inbetween spaces

        char Arr[]=str.toCharArray();

        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==' ')
            {
                iCount++;
            }
        }

        System.out.println("Number of words are: "+(iCount+1));

    }
}