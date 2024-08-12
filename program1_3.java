//Print 1 to 5 numbers 

import java.util.*;

class DisplayX
{
    public void Display()
    {
        int iCnt=1;

        while(iCnt<=5)
        {
            System.out.println(iCnt);
            iCnt++;
        }
    }
}
class program1_3
{
    public static void main(String A[])
    {
        DisplayX dobj= new DisplayX();
        dobj.Display();
    }
}