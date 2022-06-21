#include <stdio.h>
#include <string.h>
const int N = 110;
int main ()
{
  int n;
  long long s2, s3, s4, r2, r3, r4;
  while (scanf ("%d", &n) != EOF)
    {
      s2 = s3 = s4 = r2 = r3 = r4 =0;
     for (int i = 0; i <= n; i++)
	{
	  s2 += i * i;
	  s3 += i * i * i;
	  s4 += i * i * i * i;
	}
	  
	  long long tmp = n * (n + 1) / 2;
	  r2 = tmp * tmp - s2;
	  r3 = tmp * tmp * tmp - s3;
	  r4 = tmp * tmp * tmp * tmp - s4;
	  printf ("%lld %lld %lld %lld %lld %lld\n", s2, r2, s3, r3, s4, r4);
    }
	  return 0;
}
