package javaapplication15;
import java.util.Scanner;
public class app4 {
private static Scanner scanner = new Scanner(System.in);
public static boolean kiemtrant(int n) {
        if (n < 2) {
            return false;
        }
        int canbac2 = (int) Math.sqrt(n);
        for (int i = 2; i <= canbac2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (kiemtrant(i)==true) {
                System.out.print(" " + i);
            }
        }
    }
}