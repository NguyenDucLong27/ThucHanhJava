package javaapplication15;
import java.util.Scanner;
public class app3 {
    public static boolean kiemtrant(int n) {
        if (n <= 1) {
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
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n = ");
        int n=sc.nextInt();

        if(kiemtrant(n)){
            System.out.println(n+" là số nguyên tố!");
        } else {
            System.out.println(n+" không là số nguyên tố!");
        }

        sc.close();
    }
}
