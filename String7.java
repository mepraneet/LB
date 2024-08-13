///////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Reverse String  
// Input: String=India is great
// OutPut: taerg si aidnI
///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class String7
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str=sobj.nextLine();

        str=str.trim();
        str=str.replaceAll("\\s+"," ");

        String Arr[]=str.split(" ");

        StringBuffer temp=null;
        StringBuffer finalstr=new StringBuffer("");

        for(String Value :Arr)
        {
            temp= new StringBuffer(str);
            temp=temp.reverse();

            finalstr.append(temp);
            finalstr.append(" ");

        }

        System.out.println(finalstr);

    }
}