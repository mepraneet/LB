///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statment: Accept divison of student from user and depends on the divison display exam timing, there are four divison in school as
//                   A,B,C,D Exam of divison A at 7AM, B at 8:30AM, C at 9:20AM and D at 10:30AM (Application should be case sensitive) 
// Input:    C                                   d   
// OutPut: Your Exam at 9:20AM          Your Exam at 10:30AM
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class DisplayScheduleX
{
    char str;

    public DisplayScheduleX(char cValue)
    {
        this.str=cValue;
    }

    public void DisplaySchedule()
    {
        if((str=='a') || (str=='A'))
        {
            System.out.println("Your Exam at 7AM");
        }
        else if((str=='b') || (str=='B'))
        {
            System.out.println("Your Exam at 08:30AM");
        }
        else if((str=='c') || (str=='C'))
        {
            System.out.println("Your Exam at 09:20AM");
        }
        else if((str=='d') || (str=='D'))
        {
            System.out.println("Your Exam at 10:30AM");
        }
        else
        {
            System.out.println("Invalid Divison");
        }
        
      
    }
}
class program23_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter Divison:");
        char cValue=sobj.next().charAt(0);

        DisplayScheduleX cobj= new DisplayScheduleX(cValue);
        cobj.DisplaySchedule();

        
    }
}