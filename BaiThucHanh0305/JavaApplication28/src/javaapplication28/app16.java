/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.ArrayList;

/**
 *
 * @author TC
 */
public class app16 {
        public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> arr =new ArrayList<>();
        arr.add("Phan tu 1");
        arr.add("Phan tu 2");
        arr.add("Phan tu 3");
        System.out.println("Cac phan tu co trong arraylist la :");
        for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+ "\t");
        }
        arr.set(2,"Phan tu 5");
        System.out.println("\nCac phan tu co trong arraylist la :");
        for( int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+ "\t");
        }
}
