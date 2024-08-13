///////////////////////////////////////////////////////////////////////
//  Problem statement:Program to print 1 to 5 numbesr on screen
//  Input:
//  Output:
//////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Display()
{
    int iCnt=1;

    while(iCnt<=5)
    {
        printf("%d\n",iCnt);
        iCnt++;
    }
}
int main()
{
    Display();

    return 0;

}