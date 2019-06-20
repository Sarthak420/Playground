#include <stdio.h>
int main() {
	//Type your code
  int i,n,mul=1;
  scanf("%d",&n);
  for(i=n;i>0;i--)
  {
    mul=mul*i;
  }
  printf("%d",mul);
	return 0;
}