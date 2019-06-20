#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int a[100];
  int i=0;
  while(n>0)
  {
    a[i]=n%10;
    n/=10;
    i++;
  }
  printf("%d",a[i-2]);
	return 0;
}