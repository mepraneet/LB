////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Accept number from user and if number less than 10 print hello otherwise print demo
//  Input: 5            15
//  Output: Hello       Demo
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    if(iNo<=10)
    {
        printf("Hello\n");
    }
    else 
    {
        printf("Demo\n");
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