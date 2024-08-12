// Print 5 times Marvellous
import java.util.*;

class DisplayX
{
    int iNo;

    public DisplayX(int iValue)
    {
        this.iNo=iValue;
    }

    public void Display()
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            System.out.println("Marvellous");
        }
    }
}
class program1_2
{
    public static void main(String A[])
    {
        int iValue=5;

        DisplayX dobj = new DisplayX(iValue);
        dobj.Display();
    }
}