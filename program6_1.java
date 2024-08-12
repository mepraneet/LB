//write a program which accept number from user and if 
// number less than 50 print  = small
//number greater and less than 100=medium
//greter than 100= large

// input :75
//output: medium

import java.util.*;

class NumberX
{
    public void Display(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        
        if((iNo>=0) && (iNo<=50))
        {
            System.out.println("Small");
        }
        else if((iNo>50) && (iNo<=100))
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("Large");
        }
    }
}
class program6_1
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        NumberX dobj = new NumberX();
        dobj.Display(iValue);
    }
}