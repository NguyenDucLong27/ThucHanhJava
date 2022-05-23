/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
/**
 *
 * @author TC
 */
public class app69 {
      public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Phan tu thu " + i + ": ");
            int x=sc.nextInt();
            treeSetInteger.add(x);
        }   

        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(treeSetInteger);
        System.out.println("Nhap phan tu an them: ");
        number= sc.nextInt();

        if (!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong treeSetInteger sau khi them: ");
            System.out.print(treeSetInteger);
        } else {
            System.out.println("Phan tu " + number + " da ton tai!");
        }
    }
    
}
