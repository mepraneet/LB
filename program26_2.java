///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Write a program which accept string from user and convert it into UpperCase   
// Input:  India 
// OutPut: INDIA 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ToUpperCaseX
{
    public void ToUpperCase(String str)
    {
        String UpperCase=str.toUpperCase();
        System.out.println(UpperCase);
    }
}
class program26_2
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter String:");
        String sValue=sobj.nextLine();

        ToUpperCaseX lobj= new ToUpperCaseX();
        lobj.ToUpperCase(sValue);
    }
}