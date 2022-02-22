package javaapplication15;
import java.util.Scanner;        
public class app1{ 
public static void main(String[] args) {
int so1, so2;
Scanner scanner = new Scanner(System.in);
System.out.print("Nhập số thứ nhất:");
so1 = (int)scanner.nextInt();
System.out.print("Nhập số thứ hai:");
so2 = (int)scanner.nextInt();
scanner.close();
while (so1 != so2) {
if(so1 > so2)
so1 = so1 - so2;
else
so2 = so2 - so1;
}
System.out.printf("Ước chung lớn nhất là: %d", so2);
}
} 

