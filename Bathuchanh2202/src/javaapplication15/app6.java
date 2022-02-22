package javaapplication15;
import java.util.Scanner;
public class app6 {
private static Scanner scanner = new Scanner(System.in);
public static boolean sohoanhao(int n) {
  int sum=0;
  for(int i=1;i<n;i++){
      if(n%i==0){
          sum+=i;
      }
  }
  if(sum==n)
      return true;
  else return false;
}
public static void main(String[] args) {
System.out.print("Nhập n = ");
int n = scanner.nextInt();
System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
for (int i = 1; i < n; i++) {
if (sohoanhao(i)==true) {
System.out.print(" " + i);
}
}
}
}