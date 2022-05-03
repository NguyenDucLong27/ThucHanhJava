/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author TC
 */
public class app18 {
    public static void main(String[] args) {
        ArrayList<Float> arr =new ArrayList<>();
        arr.add(0.7f);
        arr.add(7.26f);
        arr.add(1.02f);
        arr.add(9.3f);
        Iterator<Float> ite =arr.iterator();
        System.out.println("\nCac phan tu co trong arraylist la :");
        while(ite.hasNext()){
            System.out.print(ite.next()+"\t");
        }
    }
    
}
