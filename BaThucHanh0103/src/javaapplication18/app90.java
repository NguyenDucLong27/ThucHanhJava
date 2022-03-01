package javaapplication18;
import java.util.Scanner;
public class app90 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String chuoi;
    char kitu;
    System.out.print("Nhap vao chuoi ki tu bat ky:");
    chuoi=sc.nextLine();
    System.out.print("Cac ki tu cua chuoi la :\n");
    for(int i=0;i<chuoi.length();i++){
        kitu=chuoi.charAt(i);
        System.out.println(kitu);
    }
    }    
}
