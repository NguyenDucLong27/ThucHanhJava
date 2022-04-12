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
public class configs {
    public static final int min =0,max=5;
    public static final float pi=3.14f,inch_cm=2.54f;
    public static final int dvcm=1;
    public static final int dvinch=2;
    public static int donvi=dvcm;
    
    public static float chuyencmsanginch(float cm){
        float inch=cm/inch_cm;
        return inch;
    }
    
    public static float chuyeninchsangcm(float inch){
        float cm=inch*inch_cm;
        return cm;
    }
}
