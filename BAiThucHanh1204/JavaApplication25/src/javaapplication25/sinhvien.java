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
public class sinhvien {
    private String ten,tuoi;
    public String getten(){
        return ten;
    }
    public void setten(String ten){
        if(ten==null||ten.isEmpty()){
            this.ten="Khong biet";
        } else {
            this.ten=ten;
        }
    }
    public String gettuoi(){
        if(Integer.valueOf(tuoi) !=-1){
        return tuoi;
    }else {
            return "Tuoi khong hop le";
        }
    }
    public void settuoi(int tuoi){
       if(tuoi>18){
           this.tuoi=String.valueOf(tuoi);
       }else {
           this.tuoi=String.valueOf(-1);
       } 
    }
}
