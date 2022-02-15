package javaapplication10;
import java.util.Scanner;
public class app47 {
private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args){
    int n,sum=0;
    do{
        System.out.print("Nhap vao so n");
        n=app47.scanner.nextInt();
        sum+=n;
    }while (sum<100);
    System.out.print("Tong cac so nguyen vua nhap"+sum);
}
}