/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.Scanner;
/**
 *
 * @author TC
 */
public class hinhtron77 extends configs{
    protected float bk;
    private Scanner sc;
    public hinhtron77(){
        super();
        sc  =new Scanner(System.in);
    }
    public void nhapbankinh(){
        System.out.println("Ban dung don vi nao :");
        System.out.println("\t1-centimet");
        System.out.println("\t2-inch");
        configs.donvi= sc.nextInt();
        System.out.println("Nhap vao ban kinh hinh tron :");
        bk=sc.nextFloat();
    }
    public void inthongtin(){
        if(configs.donvi==configs.dvcm){
            System.out.println("Hinh tron co ban kinh : "+ bk + "cm");
            System.out.println("Tuong duong"+ configs.chuyencmsanginch(bk)+ "inch");
        }else {
            System.out.println("Hinh tron co ban kinh : "+ bk + "inch");
            System.out.println("Tuong duong"+ configs.chuyeninchsangcm(bk)+ "cm");           
        }
    }
}
