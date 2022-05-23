/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author TC
 */
public class app56 {
        public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Phan tu thu " + i + ": ");
            String x=sc.nextLine();
            hashSetString.add(x);
        }   

        System.out.println("Cac pahn tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();

        if(hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
    }
}
    
