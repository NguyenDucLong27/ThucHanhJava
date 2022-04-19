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
public class employee extends person{
    String diachi,loaicn;
    long luong;
    public static final long luongfulltime=10000000;
    public static final long luongparttime=500000;    
    public employee(){       
    }
    public employee(String ten){
        this.ten=ten;
    }
    @Override
    public String congviec(){
        return "Cong nhan";
    }
    public void nhapdiachi(){
       Scanner sc= new Scanner(System.in);
       System.out.print("Nhap dia chi :");
       diachi=sc.nextLine();
    }
    @Override
    public void xuatthongtin(){
       System.out.print("Ho va ten :" +ten);
       System.out.print("Dia chi :" +diachi);
    }
}
