/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import javaapplication25.configs79;
/**
 *
 * @author TC
 */
public class nvparttime extends nhanvien{
    private int giolamviec;
    public nvparttime(String ten, int giolamviec){
        this.ten = ten;
        this.giolamviec = giolamviec;
    }
@Override
    public String loainv(){
        return "Nhan vien thoi vu";
    }
    public void tinhLuong(){
        luong = configs79.luong_nvparttimegio * giolamviec;
    }
@Override
    public void xuatThongTin(){
        System.out.println("ten nhan vien : " + ten);
        System.out.println("loai chuc vu : Nhan vien thoi vu" );
        System.out.println("Luong:"+luong);
    }
}
