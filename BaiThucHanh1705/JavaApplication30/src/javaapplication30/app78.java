/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.HashMap;
import java.util.TreeMap;
/**
 *
 * @author TC
 */
public class app78 {
    public static void main (String[] args) { 

    HashMap<Integer, Float> hashMap1 = new HashMap<>();

    HashMap<String, String> hashMap2 = new HashMap<>(10);

    HashMap<Double, Double> hashMap3 = new HashMap<>(4, 0.75f);

    HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap<>());

}
}
