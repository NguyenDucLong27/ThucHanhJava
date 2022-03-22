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
public class person {
    public String id,hvt,diachi,gt;
    Scanner sc = new Scanner(System.in);
    void nhapcancuoc(){
        System.out.print("\nNhap so can cuoc cong dan : ");
        id=sc.nextLine();
    }
    void nhaphovaten(){
        System.out.print("Nhap ho va ten : ");
        hvt=sc.nextLine();
    }
    void nhapdiachi(){
        System.out.print("Nhap dia chi : ");
        diachi=sc.nextLine();
    }
    void gioitinh(){
     System.out.print("Nhap gioi tinh : ");
     gt=sc.nextLine();
      }
    void inperson(){
       System.out.println("Cong dan  " + id + "" + hvt + ""  + gt + ""  +diachi);
   }
    }
    
