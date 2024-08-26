////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Accept number from user and print that number of star(*) using while loop and updator
//  Input: 5
//  Output: * * * * *
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>


void Display(int iNo)
{
    if(iNo<0)
    {
        iNo=-iNo;
    }

    int iCnt=1;

    while(iCnt<=iNo)
    {
        printf("*\n");
        iCnt++;
    }
}
int main()
{
    int iValue=0;

    printf("Enter Number:\n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}