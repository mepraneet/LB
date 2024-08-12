// Accept one number from user and print that times * on screen 
//Use Updator

import java.util.*;

class DisplayX
{
    
    public void Display(int iNo)
    {
        int iCnt=0;

        if(iNo<0)
        {
            iNo=-iNo;
        }

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            System.out.print(" * ");
        }
    }
}
class program2_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        DisplayX dobj= new DisplayX();
        dobj.Display(iValue);
    }
}