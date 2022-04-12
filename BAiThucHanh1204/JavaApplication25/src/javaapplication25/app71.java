/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author TC
 */
public class app71 {
    public static void main(String[] args) {
        HinhTron71 ht=new HinhTron71();
        ht.setbankinh(10);
        float chuvi=ht.tinhchuvi();
        float dientich=ht.tinhdientich();
        System.out.println("Chu vi la : " +chuvi + "va dien tich la : " + dientich);
    }
    
}
