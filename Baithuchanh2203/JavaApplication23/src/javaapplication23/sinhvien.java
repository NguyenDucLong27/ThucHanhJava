/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;
import java.util.Scanner;
/**
 *
 * @author TC
 */
public class sinhvien {
    Scanner sc=new Scanner(System.in);
    String msv,ht,diachi,namsinh;
    String gioitinh;
    void nhapmsv(){
        System.out.print("\nNhap vao ma sinh vien :");
        msv=sc.nextLine();
    }
    void nhapht(){
        System.out.print("Nhap vao ho va ten : ");
        ht=sc.nextLine();
    }
    void nhapdc(){
        System.out.print("Nhap vao dia chi : ");
        diachi=sc.nextLine();
    }
    void nhapngaysinh(){
        System.out.print("Nhap vao ngay thang nam sinh : ");
        namsinh=sc.nextLine();
    }
    void nhapgioitinh(){
    System.out.print("Nhap vao gioi tinh sinh vien : ");
    gioitinh=sc.nextLine();
    }
    void insinhvien(){
    System.out.print( msv + "" + ht+ "" + gioitinh+ "" + namsinh+ "" + diachi  );
}
}
