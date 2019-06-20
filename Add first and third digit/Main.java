#include<stdio.h>
int main()
{
  //Type your code here
  int x,y,z;
  scanf("%d", &x);
  y=x%10;
  z=x/100;
  printf("%d", y+z);
  return 0;
}