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
public class HinhTron71 {
    private final float pi=3.14f;
    private float bk;
    public float getbankinh(){
        return bk;
    }
    public void setbankinh(float bk){
        this.bk=bk;
    }
    public float tinhchuvi(){
        return 2*pi*bk;
    }
    public float tinhdientich(){
        return pi*bk*bk;
    }
}
