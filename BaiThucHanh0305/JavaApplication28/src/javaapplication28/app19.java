/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author TC
 */
public class app19 {
    public static void main(String[] args) {
                ArrayList<Character> arr =new ArrayList<>();
        arr.add('a');
        arr.add('b');
        arr.add('c');
        arr.add('d');
        
        ListIterator<Character> lt=arr.listIterator();
        System.out.println("\nCac phan tu co trong arraylist la :");
        while(lt.hasNext()){
          System.out.print(lt.next()+"\t");
    }
}