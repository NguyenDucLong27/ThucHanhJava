package javaapplication15;
import java.util.Scanner;

public class app10 {
    public static void main(String[] args) {
        System.out.print("Nhap vao 1 so nguyen duong: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int i = 0;
        while (n > 0){
            i++;
            n /= 10;
        }
        System.out.println("So " + x + " co " + i + " chu so");
    }
}