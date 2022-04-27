/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author TC
 */
public class tugiac extends point{
    public void tugiac(){        
    }
    public void check(){
    point d1=new point();
    point d2=new point();
    point d3=new point();
    point d4=new point();
    System.out.print("Nhap diem thu nhat :");
    d1.nhapdiem();
    System.out.print("Nhap diem thu hai :");
    d2.nhapdiem();
    System.out.print("Nhap diem thu ba :");
    d3.nhapdiem();
    System.out.print("Nhap diem thu tu :");
    d4.nhapdiem();    
    System.out.print("Cac diem vua nhap la :" );
    d1.indiem(); d2.indiem(); d3.indiem();d4.indiem();
    
    
    System.out.print("Bài này là điểm ở không gian 2 chiều nên em chưa nghĩ ra thuật toán chứng minh a!");
}
}
