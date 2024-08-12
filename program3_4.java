//Assignment No :3.4 accept one chararchr from user and conver case of that character
//Input : a          b
//Output : A         B

import java.util.*;

class DisplayConvertX
{
    public void DisplayConvert(char cValue)
    {
        if((cValue>='a')  &&  (cValue<='z'))
        {
            cValue=(cValue-32); // Getting Error  not feasiblein java , only in C
            System.out.println(cValue);
        }
        else if((cValue>='A')  &&  (cValue<='Z'))
        {
            cValue=(cValue+32);
            System.out.println(cValue);
        }
    }
}
class program3_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character:");
        char cValue=sobj.next().charAt(0);

        DisplayConvertX dobj = new DisplayConvertX();
        dobj.DisplayConvert(cValue);
    }
}