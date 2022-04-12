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
public class nhanvien {
    protected String ten;
    protected long luong;

    public nhanvien(){

    }
    public nhanvien(String ten){
        this.ten = ten;
    }
    protected String loainv(){
        return "";
    }
    
    public void xuatThongTin(){
        System.out.println("=== Nhan vien : "+ ten +" ===");
        System.out.println("= Loai nhan vien: "+ loainv());
        System.out.println("= Luong : "+ luong + " VND");
    }
}