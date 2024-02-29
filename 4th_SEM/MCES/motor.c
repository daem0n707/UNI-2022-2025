//DC Motor
#include <lpc214x.h>
void clock(void);
void anti_clock(void);
unsigned int i=0;

int main()
{
    PINSEL0 = 0x00000000;
    IO0DIR = 0x00000900;
    IO0SET = 0x00000100;
    while(1)
    {
        clock();
        for(i=0; i<400000; i++);
        anti_clock();
    }
}

void clock(void)
{
    IO0CLR = 0x00000900;
    for(i=0; i<1000; i++);
    IO0SET = 0x00000900;
}
void anti_clock(void)
{
    IO0CLR = 0x00000900;
    for(i=0; i<1000; i++);
    IO0SET = 0x00000100;
}

// STEPPER MOTOR
#include<lpc214x.h>
void clock(void);
void anti_clock(void);
int var1[] = {8,4,2,1};
int var2[] = {1,2,4,8};
unsigned int i=0; j=0;

int main()
{
    PINSEL0 = 0x00000000;
    IO0DIR = 0x0000F000;
    while(1)
    {
        clock();
        anti_clock();
    }
    
}

void clock(void)
{
    for(i=0; i<100; i++)
    {
        IO0PIN = var2[i%4]<<12;
        for(j=0; j<15000; j++);
    }
}
void anti_clock(void)
{
    for(i=0; i<100; i++)
    {
        IO0PIN = var1[i%4]<<12;
        for(j=0; j<15000; j++);
    }
}