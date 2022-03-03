package javaapplication20;
import java.util.Scanner;
public class appBai6 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       	int a,giaithua=1;
	do {
	System.out.print("Nhap vao mot so nguyen duong: ");
	a=sc.nextInt();
	}
	while(a<=0);
	for(int i=2;i<=a;i++)
	{
	giaithua=giaithua*i;
	}
	System.out.println("Giai thua cua so " +a+ " la: "+giaithua);
    } 
}

