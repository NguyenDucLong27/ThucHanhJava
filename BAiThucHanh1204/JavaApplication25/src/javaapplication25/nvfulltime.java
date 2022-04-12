/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.Scanner;
import javaapplication25.configs79;
/**
 *
 * @author TC
 */
public class nvfulltime extends nhanvien{
   private Scanner sc;
    private int songaylamthem;
    private int loainv;

    public nvfulltime(String ten) {
        this.ten = ten;
    }
    public nvfulltime(String ten, int songaylamthem){
        this.ten = ten;
        this.songaylamthem = songaylamthem;
    }
    public void setloaichucvu(int loainv){
       
        this.loainv= loainv;
    }
    @Override
    public String loainv() {
        return "Nhan vien toan phan";
    }
    public void tinhLuong(){
        if(loainv==configs79.nv_linh){
            if(songaylamthem>=1){
                luong = configs79.luong_nvfulltimelinh*songaylamthem;}
            else {
                luong= configs79.luong_nvfulltimelinh;}
            }
        else{
                luong = configs79.luong_sep ;
            }
        }
    @Override    
    public void xuatThongTin() {
        System.out.println("Ten nhan vien : "+ ten );
        System.out.println("loai chuc vu :"+ loainv);
        System.out.println("Luong:" + luong);
    }

}
