// Accept one number from user and if the number is less than 10 print Hello otherwise print Demo

import java.util.*;

class DisplayX
{
    public void Display(int iNo)
    {
        if((iNo<10))
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
}
class program2_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number:");
        int iValue= sobj.nextInt();

        DisplayX dobj = new DisplayX();
        dobj.Display(iValue);
    }
}