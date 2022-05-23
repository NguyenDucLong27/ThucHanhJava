/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
/**
 *
 * @author TC
 */
public class app88 {
  public static void main(String[] args) {

    HashMap<String, String> HashMapCity = new HashMap<>();
    HashMapCity.put("QNg", "Quang Ngai");
    HashMapCity.put("QN", "Quang Nam");
    HashMapCity.put("QN", "Quang Ninh");
    HashMapCity.put("HCM", "Thanh pho Ho Chi Minh");

    System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
    Set<Map.Entry<String, String>> setCity = HashMapCity.entrySet();
    System.out.println(setCity);

    System.out.println("QNg: " + HashMapCity.get("QNg"));

    System.out.println("NT: " + HashMapCity.get("NT"));

    if (HashMapCity.containsValue("Thanh pho Ho Chi Minh")) {
        System.out.println("Co Thanh pho Ho Chi Minh trong hashMapCity");
    }
}
}

