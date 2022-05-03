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
public class app21 {
    public static void main(String[] args) {
        ArrayList<String> color =new ArrayList<>();
        color.add("red");
        color.add("blue");
        color.add("orange");
        color.add("green");
        color.remove("green");
        color.add("pink");
        color.add("yellow");
        System.out.println(color.get(1));
        System.out.println(color.contains("orange"));
        System.out.println(color.size());
        System.out.println(color);       
    }    
}
