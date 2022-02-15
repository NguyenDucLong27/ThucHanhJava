
package javaapplication10;
import java.util.Scanner;
public class app35 {
private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args){
    int so1,so2;
    System.out.print("Nhap so thu nhat =");
    so1=app35.scanner.nextInt();
    System.out.print("Nhap so thu hai =");
    so2=app35.scanner.nextInt();
    int min=so1;
    if(so2<min)
        min=so2;
    System.out.print("So nho nhat trong 2 so " +so1+ "va" +so2+ "la" +min);
}
}