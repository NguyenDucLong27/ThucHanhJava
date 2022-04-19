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
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      offlinestudent sv1=new offlinestudent("Nguyen duc long" ,"truc tiep");
      sv1.nhaptruong();
      sv1.nhapsoluong();
      sv1.xuatthongtin();
      
      parttimeemployee nv1=new parttimeemployee("long","nhan vien thoi vu");
      nv1.nhapsogiolamviec();
      nv1.tinhluong();
      nv1.xuatthongtin();
    

    vipcustomer kh1 =new vipcustomer("long","vip");   
    kh1.nhapsogio();
    kh1.xuatthongtin();
}