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
public class app54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Phan tu thu " + i + ": ");
            int x=sc.nextInt();
            hashSetInteger.add(x);
        }        
        System.out.println("Cac phan tu trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();

        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(hashSetInteger);

        } else {
            System.out.println("Phan tu " + number + " da ton tai ");
        }
    }
}

