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
public class student extends person{
    public String msv,tentruong;
    String phuongthuchoc;
    public student(){        
    }
    public student(String ten,String msv){
       this.ten=ten;
       this.msv=msv;
    }
    @Override
    public String congviec(){
        return "Hoc sinh";
    }
    public void nhaptruong(){
       Scanner sc= new Scanner(System.in);
       System.out.print("Nhap ten truong : ");
       tentruong=sc.nextLine();
    }
    @Override
    public void xuatthongtin(){
        System.out.print("Hoc sinh" + ten + "msv : " + msv +"hoc o truong:" + tentruong);
    }
}
