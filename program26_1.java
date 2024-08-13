///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Write a program which accept string from user and convert it into lowercase   
// Input:  India 
// OutPut: india 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ToLowerCaseX
{
    public void ToLowerCase(String str)
    {
        String LowerCase=str.toLowerCase();
        System.out.println(LowerCase);
    }
}
class program26_1
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter String:");
        String sValue=sobj.nextLine();

        ToLowerCaseX lobj= new ToLowerCaseX();
        lobj.ToLowerCase(sValue);
    }
}