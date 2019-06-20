#include <stdio.h>
int main() {
	//Type your code
  int n,y,x=0;
  scanf("%d",&n);
  while(n!=0)
  {
    y=n%10;
    x=x+y;
    n=n/10;
  }
  printf("%d",x);
	return 0;
}