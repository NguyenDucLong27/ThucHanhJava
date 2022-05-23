/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author TC
 */
public class app86 {
    public static void main(String[] args) {

    HashMap<String, String> hashMap = new HashMap<>();

    hashMap.put("CSLT", "Co so lap trinh");
    hashMap.put("C++", "C++");
    hashMap.put("C#", "C Sharp");
    hashMap.put("PHP", "PHP");
    hashMap.put("Java", "Java");

    Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

    System.out.println("Cac entry co trong setHashMap:");
    System.out.println(setHashMap);
}
}

