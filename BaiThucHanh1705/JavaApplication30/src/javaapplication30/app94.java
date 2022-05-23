/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.Map;
import java.util.LinkedHashMap;
/**
 *
 * @author TC
 */
public class app94 {
        public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer,String>();
        hm.put(100,"Mo");
        hm.put(101,"Dia");
        hm.put(102,"Chat");
        for(Map.Entry<Integer, String> m:hm.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());
        
        System.out.println("Before invoking remove method: " +hm);
        hm.remove(101);
        System.out.println("After invoking remove method: " +hm);

    }  
}
