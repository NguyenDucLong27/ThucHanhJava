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
public class person {
    public String ten;
    public String diachi;
    public person(){    
    }
    public person(String ten,String diachi){
        this.ten =ten;
        this.diachi=diachi;
    }
    public String congviec(){
        return "";
    }
    public void xuatthongtin(){
       System.out.print("Ho va ten :" +ten);
       System.out.print("Cong viec :" +congviec());
       System.out.print("Dia chi :" +diachi); 
    }
}
