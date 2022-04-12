/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;
    import newpackage.hinhtron;
    import newpackage.hinhchunhat;
    import newpackage.hinhvuong;
    import newpackage.hinhtru;
/**
 *
 * @author TC
 */
public class app54 {
    public static void main(String[] args) {
        hinhtron hc=new hinhtron();
        hc.xuatten();
        hc.nhapbankinh();
        hc.tinhchuvi();
        hc.tinhdientich();
        hc.inchuvi();
        hc.indientich();
        
        hinhchunhat hcn =new hinhchunhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
        
        hinhtru ht=new hinhtru();
        ht.xuatten();
        ht.nhapchieucao();
        ht.nhapbankinh();
        ht.tinhthetich();
        ht.inthetich();
        
        hinhvuong hv=new hinhvuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }    
}
