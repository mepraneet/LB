//write a program which accept number from user and display its table in reverse 

import java.util.*;

class TableX
{
    public void Table(int iNo)
    {
        int iCnt=0;

        for(iCnt=10; iCnt>=iNo; iCnt--)
        {
            System.out.println(iNo*iCnt);
        }

    }
   
}
class program6_5
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        TableX fobj = new TableX();
        fobj.Table(iValue);
       
    }
}