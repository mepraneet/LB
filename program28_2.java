/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which accept string from user and copy this string into another string
// Input: India Is My Country
// Output: India Is My Country
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StrCpyX
{
    public String StrCpy(String str) 
    {
        String CoppiedString= new String(str);
        return CoppiedString;   
    }

}
public class program28_2
{
    public static void main(String[] args) {
      
        Scanner sobj = new Scanner(System.in);
        String strValue;

        System.out.println("Enter String:");
        String sValue = sobj.nextLine();

        StrCpyX cobj=new StrCpyX();

        strValue = cobj.StrCpy(sValue);

        System.out.println("Coppied string is: "+strValue);

    }
    
}
