/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author TC
 */
public class app2203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    hinhchunhat hcn = new hinhchunhat();
    hcn.nhapchieurong();
    hcn.nhapchieudai();
    hcn.tinhchuvi();
    hcn.inchuvi();
    hcn.tinhdientich();
    hcn.indientich();
    
    
    person a= new person();
    a.nhapcancuoc();
    a.nhaphovaten();
    a.nhapdiachi();
    a.gioitinh();
    a.inperson();
    
    
    sinhvien sv=new sinhvien();
    sv.nhapmsv();
    sv.nhapht();
    sv.nhapngaysinh();
    sv.nhapdc();
    sv.nhapgioitinh();
    sv.insinhvien();
    
    
    
    phuongtrinhbac2 pt = new phuongtrinhbac2();
    pt.nhapheso();
    pt.giaipt();
    }  
}
