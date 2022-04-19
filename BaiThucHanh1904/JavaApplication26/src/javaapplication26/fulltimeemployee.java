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
public class fulltimeemployee extends employee{
    public fulltimeemployee(String ten,String loaicn){
      this.ten=ten;
      this.loaicn=loaicn;
    }
    @Override
    public void xuatthongtin(){
    System.out.print("Nhan vien : " + ten + "la :" + loaicn + "luong : " + luongfulltime);
    }
    
}
