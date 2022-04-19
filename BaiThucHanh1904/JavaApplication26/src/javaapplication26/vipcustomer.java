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
public class vipcustomer extends customer{
    int sogiomuasam;
    public vipcustomer(String ten,String loaikh){
        this.ten=ten;
        this.loaikh=loaikh;
    }
    public void nhapsogio(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap so gio mua sam :");
    sogiomuasam=sc.nextInt();
    }
    @Override
    public void xuatthongtin(){
       System.out.print("Khach hang :" + ten + " ,la khach hang:" + loaikh + " ,da mua " + sogiomuasam + " ,gio");
    }
}
