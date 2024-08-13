/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Write a program which accept string from user and copy Small characters of that string into another string
// Input: India Is My Country
// Output: ndiasyountry
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StrCpySmallX
{
    public String StrCpySmall(String str) 
    {
        // Initialize an empty string to store the uppercase characters
        String result = "";
        char Arr[]=str.toCharArray();

        // Iterate over each character in the string
        for(char ch : Arr) 
        {
            // Check if the character is lowercase
            if (Character.isLowerCase(ch)) 
            {
                result += ch; // Concatenate lowercase character to result
            }
            
        }

        return result; // Return the result string
    }

}
public class program28_4 
{
    public static void main(String[] args) {
      
        Scanner sobj = new Scanner(System.in);
        String strValue;

        System.out.println("Enter String:");
        String input = sobj.nextLine();

        StrCpySmallX cobj=new StrCpySmallX();

        strValue = cobj.StrCpySmall(input);

        System.out.println("Lowercase characters in the string: " + strValue);

    }
    
}
