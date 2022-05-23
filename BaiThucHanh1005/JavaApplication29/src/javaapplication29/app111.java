/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

/**
 *
 * @author TC
 */
import java.util.LinkedList;
import java.util.Scanner;
public class app111 {
    public static void main(String[] args){
        LinkedList<Integer> a = new LinkedList<>();
        int n, tong = 0, sopt = 0;
        System.out.println("Nhap so phan tu: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Phan tu thu " + i + ": ");
            int x = sc.nextInt();
            if (x % 2 == 0){
            tong += x;
            sopt++;
        }
        a.add(x);
        }
        System.out.println("Trung binh cong cua cac so chan la: " + tong/sopt);
}
}

