import java.io.*;
import java.util.*;
class Main
{
 static String ReadLn (int maxLg) // utility function to read from stdin
 {
 byte lin[] = new byte [maxLg];
 int lg = 0, car = -1;
 try
 {
 while (lg < maxLg)
 {
 car = System.in.read();
 if ((car < 0) || (car == '\n')) break;
 lin [lg++] += car;
 }
 }
 catch (IOException e)
 {
 return (null);
 }
 if ((car < 0) && (lg == 0)) return (null); // eof
 return (new String (lin, 0, lg));
 }
 public static void main (String args[]) // entry point from OS
 {
 Main myWork = new Main(); // create a dinamic instance
 myWork.Begin(); // the true entry point
 }
 void Begin()
 {
 StringTokenizer idata;
 String input;
 while ((input = Main.ReadLn (255)) != null){
 idata = new StringTokenizer (input);
 if(!idata.hasMoreTokens()){
 return;
 }
 int size = Integer.parseInt(idata.nextToken());
 int k = Integer.parseInt(idata.nextToken());
 if(k == 0 && size == 0){
 return;
 }
 littleBishops(size, k);
 }
 return;
 }
 static int count;
 void littleBishops(int size, int k) {
 int sum = 0;
 if(size == 1 && k == 1){
 System.out.println(1);
 return;
 }
 if(k > size + size-2){
 System.out.println(0);
 return;
 }
 boolean[] even;
 boolean[] odd;
 if(size%2 == 0){
 even = new boolean[size-1];
 odd = new boolean[size];
 }
 else{
 even = new boolean[size];
 odd = new boolean[size-1];
 }
 for(int i = 0; i<k+1; i++){
 count = 0;
 numWays(even, odd, i, 1);
 int a = count;
 count = 0;
 numWays(even, odd, k-i, 0);
 int b = count;
 sum += a*b;
 }
 numWays(even, odd, k, 0);
 /*
 boolean[][] board = new boolean[size][size];
 numWays(board, k, 0, 0);
 */
 System.out.println(sum);
 }
 void numWays(boolean[] even, boolean[] odd, int k, int x) {
 if(k == 0){
 count++;
 return;
 }
 int middleo = (odd.length-1)/2;
 int middlee = (even.length)/2;
 int size = even.length + odd.length;
 for(int i = x; i<size-k+1; i+=2){
 int h = i;
 if(h > size/2){
 h = (size - h-1);
 }
 h = h/2;
 if(i%2 == 0){
 for(int j = middlee-h; j<middlee+h+1; j++){
 if(!even[j]){
 even[j] = true;
numWays(even, odd, k-1, i+2);
even[j] = false;
 }
 }
 }
 if(i%2 == 1){
 for(int j = middleo-h; j<middleo+h+2; j++){
 if(!odd[j]){
 odd[j] = true;
 numWays(even, odd, k-1, i+2);
 odd[j] = false;
 }
 }
 }
 /*
 for(int j = middle-h; j<middle+h+1; j+=2){
 if(!column[j]){
 boolean[] temp = column.clone();
 temp[j] = true;
 numWays(temp, k-1, i+1);
 }
 }
 */
 }
 }
}
