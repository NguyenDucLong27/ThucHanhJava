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
public class tamgiac extends point{
  
    point d1=new point();
    point d2=new point();
    point d3=new point();
    public void tamgiac(){        
    }
    public void nhap(){   
    System.out.print("Nhap diem thu nhat :");
    d1.nhapdiem();
    System.out.print("Nhap diem thu hai :");
    d2.nhapdiem();
    System.out.print("Nhap diem thu ba :");
    d3.nhapdiem();
    System.out.print("Cac diem vua nhap la :" );
    d1.indiem(); d2.indiem(); d3.indiem();
    }
    public void check(){
    float c1=(float)Math.sqrt((d1.hd-d2.hd)*(d1.hd-d2.hd)+(d1.td-d2.td)*(d1.td-d2.td));
    float c2=(float)Math.sqrt((d1.hd-d3.hd)*(d1.hd-d3.hd)+(d1.td-d3.td)*(d1.td-d3.td));
    float c3=(float)Math.sqrt((d3.hd-d2.hd)*(d3.hd-d2.hd)+(d3.td-d2.td)*(d3.td-d2.td));
    if(c1+c2>c3||c1+c3>c2||c2+c3>c1){
        if(c1*c1+c2*c2==c3*c3||c1*c1+c3*c3==c2*c2||c2*c2+c3*c3==c1*c1){
            System.out.print("\nBa diem vua nhap tao ra tam giac vuong.");
        }
        else
        {
            if(c1==c2&&c2==c3){
                System.out.print("\nBa diem vua nhap tao ra tam giac deu.");
            }
            else
            {
                if(c1==c2||c1==c3||c2==c3){
                    System.out.print("\nBa diem vua nhap tao ra tam giac can.");
                }
                else                    
                    System.out.print("\nBa diem vua nhap tao ra tam giac thuong.");                    
            }
        }
    }
    else{
        System.out.print("\nBa diem vua nhap khong tao ra tam giac.");
    }
    }
    }
