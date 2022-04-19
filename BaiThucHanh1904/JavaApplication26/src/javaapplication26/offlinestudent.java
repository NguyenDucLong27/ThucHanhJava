/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;
import java.util.Scanner;
/**
 *
 * @author TC
 */
public class offlinestudent extends student{
    int sosv;
    public offlinestudent(String ten,String phuongthuchoc){
      this.ten=ten;
      this.phuongthuchoc=phuongthuchoc;
    }
    public void nhapsoluong(){
        System.out.print("Nhap so sinh vien cua lop");
        Scanner sc=new Scanner(System.in);
        sosv=sc.nextInt();
    }
    @Override
    public void xuatthongtin(){
        System.out.print("Hoc sinh" + ten  +"hoc o truong:" + tentruong +"dang hoc : "+phuongthuchoc + "lop co :"+sosv);
    }
}
