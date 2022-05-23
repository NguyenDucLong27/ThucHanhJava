/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
/**
 *
 * @author TC
 */
public class app60 {
    public static void main(String[] args){


Set<String> LinkedHashSet = new LinkedHashSet<String>();
Scanner sc = new Scanner(System.in);
System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Phan tu thu " + i + ": ");
            String x=sc.nextLine();
            LinkedHashSet.add(x);
        }   
for (String str : LinkedHashSet) {
    System.out.println(str);
        }
    }
}