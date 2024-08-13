///////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Count frequency of word from string
// Input: String=India is great is all is , N=is
// OutPut: 3
///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class String5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str=sobj.nextLine();

        System.out.println("Enter the character that you want to search:");
        String ch=sobj.nextLine();

        str=str.trim();
        str=str.replaceAll("\\s+"," ");

        String Arr[]=str.split(" ");

        int iCount=0;

        for(String Value :Arr)   //for iterate multiple values from array we acn use this syntax as well
        {
            if(ch.equals(Value))
            {
                iCount++;
            }
        }

        System.out.println("Frequency of Word is: "+iCount);
       
    }
}