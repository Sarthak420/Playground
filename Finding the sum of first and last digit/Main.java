#include <stdio.h>
int main() {
	//Type your code
  int n,fn,ln;
  scanf("%d",&n);
  ln=n%10;
  while(n>10)
  {
    n/=10;
    fn=n%10;
  }
  printf("%d",ln+fn);
	return 0;
}