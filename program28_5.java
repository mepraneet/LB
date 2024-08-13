/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which 2 string from user and concat second string after first string
// Input: String 1=India String 2= Is Great
//Output: India Is Great
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StrConcatX
{
    public String StrConcat(String str1,String str2) 
    {
        String ConcatStr=str1+" "+str2;
        return ConcatStr;
        
    }

}
public class program28_5
{
    public static void main(String[] args) {
      
        Scanner sobj = new Scanner(System.in);
        String strValue;

        System.out.println("Enter First String:");
        String sValue1 = sobj.nextLine();

        System.out.println("Enter Second String:");
        String sValue2 = sobj.nextLine();

        StrConcatX cobj=new StrConcatX();

        strValue = cobj.StrConcat(sValue1,sValue2);

        System.out.println("Concat String is: "+strValue);

    }
    
}
