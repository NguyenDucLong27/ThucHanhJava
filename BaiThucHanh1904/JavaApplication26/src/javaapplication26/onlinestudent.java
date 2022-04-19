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
public class onlinestudent extends student{
    public onlinestudent(String ten,String phuongthuchoc){
        this.ten=ten;
        this.phuongthuchoc=phuongthuchoc;
    }
    String ungdunghoc;
    public void nhapungdung(){
        Scanner sc=new Scanner (System.in);
        System.out.print("\nUng dung hoc la :");
        ungdunghoc=sc.nextLine();
    }
    @Override
    public void xuatthongtin(){
        System.out.print("Hoc sinh" + ten + "hoc o truong:" + tentruong +"dang hoc : "+phuongthuchoc + "tai ung dung :" +ungdunghoc);
    }
}
