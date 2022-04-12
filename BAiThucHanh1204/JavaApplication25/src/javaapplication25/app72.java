/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author TC
 */
public class app72 {
    public static void main(String[] args) {
        sinhvien sv1=new sinhvien();
        sinhvien sv2=new sinhvien();
        sv1.setten("");
        sv1.settuoi(23);
        
        sv2.setten("PETTER");
        sv2.settuoi(17);
        
        System.out.println("Sinh vien 1 co ten " + sv1.getten() + " tuoi " + sv1.gettuoi());
        System.out.println("Sinh vien 2 co ten " + sv2.getten() + " tuoi " + sv2.gettuoi());
    }
    
}
