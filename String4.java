///////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Count frequency of character from string
// Input: String=India is great is all is, N=i
// OutPut: 4
///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class String4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str=sobj.nextLine();

        System.out.println("Enter the character that you want to search:");
        String ch=sobj.nextLine();

        char cValue=ch.charAt(0);

        char Arr[]=str.toCharArray();

        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==cValue)
            {
                iCount++;
            }
        }

        System.out.println("Frequency of character is: "+iCount);
       
    }
}