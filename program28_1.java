/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which accept string from user copy the content of that string into another string
// Input: India Is My Country
// Output: India Is My Country
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StrCpyX
{
    public String StrCpy(String str) 
    {
        return str; // Directly return the input string as a copy
    }

}
public class program28_1
{
    public static void main(String[] args) {
      
        Scanner sobj = new Scanner(System.in);
        String strValue;

        System.out.println("Enter String:");
        String input = sobj.nextLine();

        StrCpyX cobj=new StrCpyX();

        strValue = cobj.StrCpy(input);

        System.out.println("Copy String is: "+strValue);

    }
    
}
