#include <stdio.h>
int main() {
	//Type your code
  int i,j,n,x,a[10],b[10],mul=1,sum=0;
  scanf("%d",&n);
  x=n;
  for(i=0;i<3;i++)
  {
    a[i]=n%10;
    for(j=a[i];j>0;j--)
    {
      mul=mul*j;
    }
    b[i]=mul;
    mul=1;
    n=n/10;
  }
  for(i=0;i<3;i++)
  {
    sum=sum+b[i];
  }
  if(x==sum)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}