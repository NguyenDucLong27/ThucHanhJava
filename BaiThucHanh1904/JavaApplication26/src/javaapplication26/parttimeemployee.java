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
public class parttimeemployee extends employee{
    int sogiolam;
    public parttimeemployee(String ten,String loaicn){
      this.ten=ten;
      this.loaicn=loaicn;
    }
    public void nhapsogiolamviec(){
        System.out.print("Nhap so gio lam :");
        Scanner sc=new Scanner(System.in);
        sogiolam=sc.nextInt();
    }
    public void tinhluong(){
        luong=luongparttime*sogiolam;
    }
    @Override
    public void xuatthongtin(){
    System.out.print("Nhan vien : " + ten + "la :" + loaicn + "luong : " + luong);
    }
}
