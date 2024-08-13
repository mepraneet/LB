/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which accept string from user and Revese that String
// Input: India Is Great
// Output:taerG sI aidnI
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StrRevX
{
    public void StrRev(String str)
    {
        str=str.trim();
        str=str.replaceAll("\\s+"," ");

        StringBuilder sb= new StringBuilder(str);

        sb=sb.reverse();
        System.out.print(sb);

    }
}
class program27_5
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter String:");
        String sValue=sobj.nextLine();

        StrRevX cobj=new StrRevX();
        cobj.StrRev(sValue);

    }
}