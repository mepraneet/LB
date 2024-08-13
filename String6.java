///////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Reverse String 
// Input: String=India is great
// OutPut: taerg si aidnI 
///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class String6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str=sobj.nextLine();

        StringBuffer sb= new StringBuffer(str); 

        sb=sb.reverse(); //inbulid function from stringbuffer class

        System.out.println("Reverse String is :"+sb);

    }
}