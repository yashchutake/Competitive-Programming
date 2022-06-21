import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
//bisection method :/ Math.sqrt is inaccurate.
//speed = O(log2 n)
public static long squareRoot (long l) {
long min=0;
long max=((long)Integer.MAX_VALUE)*2;
long mid=0;
while (min<=max) {
mid=(min+max)/2;
long value=mid*mid;
if (value==l) {
break;
} else if (value<l) {
min=mid+1;
} else {
max=mid-1;
}
}
return mid;
}
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
while ((s=br.readLine())!=null) {
long l=Long.parseLong(s);
if (l==0) {
break;
}
long sqrt=squareRoot(l);
if (sqrt*sqrt==l) {
System.out.println("yes");
} else {
System.out.println("no");
}
}
}
}
