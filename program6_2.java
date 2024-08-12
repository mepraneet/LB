// Accept single digit number from user and print it into word

import java.util.*;

class NumberX
{
    public void Number(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        
        if(iNo==1)
        {
            System.out.println("One");
        }
        else if(iNo==2)
        {
            System.out.println("Two");
        }
        else if(iNo==3)
        {
            System.out.println("Three");
        }
        else if(iNo==4)
        {
            System.out.println("Four");
        }
        else if(iNo==5)
        {
            System.out.println("Five");
        }
        else if(iNo==6)
        {
            System.out.println("Six");
        }
        else if(iNo==7)
        {
           System.out.println("Seven"); 
        }
        else if(iNo==8)
        {
            System.out.println("Eight");
        }
        else if(iNo==9)
        {
            System.out.println("Nine");
        }
        else if(iNo==10)
        {
            System.out.println("Ten");
        }
        else
        {
            System.out.println("Number Greater than 10");
        }
    }
}
class program6_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        NumberX nobj= new NumberX();
        nobj.Number(iValue);
    }
}