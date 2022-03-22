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
public class app2203{
    float a , b , c , delta, x1, x2;
public static Scanner sc = new Scanner(System.in);
    void nhapheso(){
        System.out.print("\nHe so a = ");
               a = sc.nextFloat();
        System.out.print("He so b = ");
               b = sc.nextFloat();
        System.out.print("He so a = ");
               c = sc.nextFloat();
        }
    void giaipt(){
           if(a==0){
               if(b==0){
                   System.out.println("Phuong trinh co vo so nghiem");
               }
               else{
                   System.out.println("Phuong trinh co 1 nghiem duy nhat x = " + -c/b);
               }
           }
           else{
             delta = b*b-4*a*c;
                if ( delta <0 )
                {
                    System.out.println("Phuong trinh vo nghiem !");
                }
                else if ( delta == 0)
                {
                    x1 = -b/(2*a);
                    System.out.println("Phuong trinh co nghiem kep " + x1);
                }
                else{
                    x1=(float)(-b + Math.sqrt(delta))/(2*a);
                    x2 =(float)(-b - Math.sqrt(delta))/(2*a);
                    System.out.println("Phuong trinh co 2 nghiem phan biet x1= "+ x1+ "va x2 = " + x2);
                }
        }
    }
}
    
