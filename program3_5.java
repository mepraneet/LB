// Accept character and check wether that character is vowel (a,e,i,o,u) or not

import java.util.*;

class VowelX
{
    public boolean Vowel(char cValue)
    {
        boolean bFlag=false;

        if((cValue=='a') || (cValue=='e') ||(cValue=='i') ||(cValue=='o') ||(cValue=='u'))
           {
                bFlag=true;
           }

           return bFlag;
    }
}
class program3_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner (System.in);
        boolean bRet=false;

        System.out.println("Enter character:");
        char cValue=sobj.next().charAt(0);

        VowelX vobj = new VowelX();

        bRet=vobj.Vowel(cValue);

        if(bRet==true)
        {
            System.out.println("Character is Vowel");
        }
        else 
        {
            System.out.println("Character NOT Vowel");
        }
    }
}