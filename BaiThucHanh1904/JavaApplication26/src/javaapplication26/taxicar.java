/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author TC
 */
class taxicar implements car{
    public void move(){
        System.out.println("Toc do : 50-70 km ");
    }
    public void stop(){
        System.out.println("Dừng lại khi hết xăng hoặc hỏng! ");
    }
    public void turnleft(){
        System.out.println("Quay cần sang trái để rẽ trái : ");
    }
    public void turnright(){
        System.out.println("Quay cần sang phải để rẽ phải : ");
    }
    public void reverse(){
        System.out.println("Đảo ngược:?? ");
    }
    
}
