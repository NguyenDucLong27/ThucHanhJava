/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;
import java.util.Scanner;

/**
 *
 * @author TC
 */
public class hinhchunhat {
    public float cd,cr,cv,dt;
    Scanner sc = new Scanner(System.in);
public void nhapchieudai(){
     System.out.print("Chieu dai cua hinh chu nhat la : ");
     cd=sc.nextFloat();
    }
public void nhapchieurong(){
     System.out.print("Chieu rong cua hinh chu nhat la : ");
     cr=sc.nextFloat();
    }
void tinhchuvi(){
    cv=(cd+cr)*2;
       }
void tinhdientich(){
    dt=cd*cr;
}
void inchuvi(){
           System.out.println("Chu vi la :" +cv);
       }
void indientich(){
           System.out.println("Dien tich la :" +dt);
       }
}
