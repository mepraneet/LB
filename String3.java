///////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Count Largets lenght word from string
// Input: India is gretest
// OutPut: 7 (gretest)
///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class String3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str=sobj.nextLine();

        str=str.trim(); 
        str=str.replaceAll("\\s+"," ");  

        String Arr[]=str.split(" ");

        int iCnt=0; 
        int iMax=0;
        int iMaxIndex=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt].length() > iMax)
            {
                iMax=Arr[iCnt].length();
                iMaxIndex=iCnt;
            }
        }

        System.out.println("Largest lenght words is: "+iMax);
        System.out.println("Largest  words is: "+Arr[iMaxIndex]);

    }
}