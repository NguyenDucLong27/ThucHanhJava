package javaapplication20;
import java.util.Scanner;
public class appBai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,tong,hieu,du,min=0,thuong;
        System.out.print("Nhap so thu nhat :");
        a=sc.nextInt();
        System.out.print("Nhap so thu hai :");
        b=sc.nextInt();
        tong=a+b;
        System.out.print("Tong cua hai so la :"+tong);
        if(a>b)
        {
            hieu=a-b;min=b;
            System.out.print("\nHieu cua hai so do la : "+hieu);
            if(b!=0)
            {
            thuong=a/b;du=a%b;
            System.out.print("\nThuong cua phep chia hai so la :"+thuong);
            System.out.print("\nSo du chua phep chia hai so la :"+du);
            }
            else {System.out.print("\nKhong thuc hien duoc phep chia");}
            System.out.print("\nSo lon la : "+a);
            System.out.print("\nSo be la : " +b);
        }
        else  
        { 
            hieu=b-a;min=a;
            if(a!=0)
            {
            thuong=b/a;du=b%a;
            System.out.print("\nThuong cua phep chia hai so la :"+thuong);
            System.out.print("\nSo du chua phep chia hai so la :"+du);
            }
            else {System.out.print("\nKhong thuc hien duoc phep chia");}
            System.out.print("\nSo lon la : "+b);
            System.out.print("\nSo be la : " +a);
        }
    
}
}

