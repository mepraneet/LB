//write a program which accept number from user and return differece btw summation of even and odd digits
//Input: 2395   output :-15
import java.util.*;

class CountDiffX
{
    public int CountDiff(int iNo)
    {
        int iDigit=0, iSumEven=0, iSumOdd=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;

            if((iDigit%2)==0)
            {
             iSumEven=iSumEven+iDigit;
            }

            if((iDigit%2)!=0)
            {
             iSumOdd=iSumOdd+iDigit;
            }
            
            iNo=iNo/10;
        }

        
        return iSumEven-iSumOdd;

    }
}
class program11_5
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        CountDiffX cobj = new CountDiffX();
        iRet=cobj.CountDiff(iValue);

        System.out.println("Diff is:"+iRet);


    }
}