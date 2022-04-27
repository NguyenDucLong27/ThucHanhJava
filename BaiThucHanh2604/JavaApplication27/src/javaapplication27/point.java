/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;
import java.util.Scanner;
/**
 *
 * @author TC
 */
public class point {
    String tendiem;
    float hd,td;
    Scanner sc=new Scanner(System.in);
public void point(){    
}
public void point(String tendiem,float x,float y){
    this.tendiem=tendiem;
    this.hd=x;
    this.td=y;
}
public void nhapdiem(){
    System.out.print("\n Nhap ten diem : ");
    tendiem=sc.nextLine();
    System.out.print("Nhap hoanh do : ");
    hd=sc.nextFloat();
    System.out.print("Nhap tung do : ");
    td=sc.nextFloat();
}
public void indiem(){
    System.out.print( tendiem + "("+hd+","+td+");");
}
}
