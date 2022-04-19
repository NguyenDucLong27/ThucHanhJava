/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author TC
 */
public class customer extends person{
    String loaikh;
    public customer(){       
    }
    public customer(String ten){
        this.ten=ten;
    }
    @Override
    public String congviec(){
        return "khach hang";
    }
    @Override
    public void xuatthongtin(){
       System.out.print("Ho va ten :" +ten);
    }
}
