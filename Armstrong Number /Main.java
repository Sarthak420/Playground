#include <stdio.h>
int main() {
	//Type your code
  int x,n,i,a[10],sum=0;
  scanf("%d",&n);
  x=n;
  for(i=0;i<3;i++)
  {
    a[i]=n%10;
    n=n/10;
  }
  for(i=0;i<3;i++)
  {
    sum=sum+((a[i])*a[i]*a[i]);
  }
  if(sum==x)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}