///////////////////////////////////////////////////////////////////////
//  Problem statement:Accept one number and check whether is it divisible by 5 or not
//  Input:
//  Output:
//////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdbool.h>

//Getting error when use typedef
#define TRUE 1
#define FALSE 2

bool Check(int iNo)
{
    if((iNo%5)==0)
    {
        return true ;
    }
    else
    {
        return false ;
    }
}
int main()
{
    int iValue=0;
    bool bRet=false;

    printf("Enter Number:\n");
    scanf("%d",&iValue);

    bRet=Check(iValue);

    if(bRet==true)
    {
        printf("Divisible by 5\n");
    }
    else
    {
        printf("Not Divisible by 5\n");
    }


    return 0;

}