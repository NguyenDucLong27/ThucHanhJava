package javaapplication10;
import java.util.Scanner;
public class JavaApplication10 {   
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){ 
     int n,soDu,tong=0;
     System.out.print("Nhap so n, n=");
     n= JavaApplication10.scanner.nextInt();
         while (n>0){
             soDu=n%10;
             n=n/10;
             tong+=soDu; 
         }
   System.out.print("Tong cac chu so cua n = " + tong);
    }
    
}

