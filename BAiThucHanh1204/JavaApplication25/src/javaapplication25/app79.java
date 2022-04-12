/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import javaapplication25.nvfulltime;
import javaapplication25.nvparttime;
import javaapplication25.configs79;
/**
 *
 * @author TC
 */
public class app79 {
    public static void main(String[] args) {
        
        nvfulltime sep = new nvfulltime("Tran Van Sep");
        sep.setloaichucvu(configs79.nv_sep);
        nvfulltime linh1 = new nvfulltime("Nguyen Van Linh"); 
        nvfulltime linh2 = new nvfulltime("Le Thi Linh", 3); 
        linh1.setloaichucvu(configs79.nv_linh);
        linh2.setloaichucvu(configs79.nv_linh);
        
        nvparttime thoiVu = new nvparttime("Phan Thi Thoi Vu", 240); 
       
        System.out.println("Loai chuc vu :");
        System.out.println("\t1 = sep " );
        System.out.println("\t2 = linh");
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
      
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }

}