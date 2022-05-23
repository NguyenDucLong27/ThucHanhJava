/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
/**
 *
 * @author TC
 */
public class app98 {
    public static void main(String [] args) {
    
    TreeMap<String, Double> treeMap1 = new TreeMap<>();

    Map<Float, Integer> map = new HashMap<>();
    TreeMap<Float, Integer> treeMap2 = new TreeMap<>(map);
}
    
}
