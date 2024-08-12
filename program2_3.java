// Accept two numbers from user and display first number in second number of times

import java.util.*;
class DisplayX
{
    int iNo1, iNo2;

    public DisplayX(int iValue1, int iValue2)
    {
        this.iNo1=iValue1;
        this.iNo2=iValue2;
    }
    public void Display()
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=iNo2; iCnt++)
        {
            System.out.println(iNo1);
        }
    }
}
class program2_3
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter first number");
        int iValue1= sobj.nextInt();

        System.out.println("Enter second number");
        int iValue2= sobj.nextInt();

        DisplayX dobj= new DisplayX(iValue1, iValue2);
        dobj.Display();


    }
}