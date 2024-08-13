/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which accept string from user and copy capital characters of that string into another string
// Input: India Is My Country
// Output: IIMC
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StrCpyCapX
{
    public String StrCpyCap(String str) 
    {
        // Initialize an empty string to store the uppercase characters
        String result = "";
        char Arr[]=str.toCharArray();

        // Iterate over each character in the string
        for(char ch : Arr) 
        {
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) 
            {
                result += ch; // Concatenate uppercase character to result
            }
            
        }

        return result; // Return the result string
    }

}
public class program28_3 
{
    public static void main(String[] args) {
      
        Scanner sobj = new Scanner(System.in);
        String strValue;

        System.out.println("Enter String:");
        String input = sobj.nextLine();

        StrCpyCapX cobj=new StrCpyCapX();

        strValue = cobj.StrCpyCap(input);

        System.out.println("Uppercase characters in the string: " + strValue);

    }
    
}
