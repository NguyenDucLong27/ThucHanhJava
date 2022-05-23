/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author TC
 */
public class app112 {
    public static void main(String[] args) {
      class SinhVien {
 
    public String hoTen;
    public int diem;
}
 
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so sinh vien: ");
        int n = input.nextInt();
 
        ArrayList<SinhVien> danhSach = new ArrayList();
 
        for (int i = 0; i < n; i++) {
            input.nextLine();
            SinhVien x = new SinhVien();
            System.out.println("Sinh vien thu " + i + "la :");
            System.out.print("Name: ");
            x.hoTen = input.nextLine();
            System.out.print("Diem: ");
            x.diem = input.nextInt();
            danhSach.add(x);
        }
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("Ten " + danhSach.get(i).hoTen + " ; Diem : " + danhSach.get(i).diem);
        }
    }
}
