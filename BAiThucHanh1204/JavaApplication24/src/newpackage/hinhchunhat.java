/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.Scanner;
/**
 *
 * @author TC
 */
public class hinhchunhat extends hinhhoc{
    Scanner sc= new Scanner(System.in);
    public float dai,rong;
    public hinhchunhat(){
        ten= "hinh chu nhat";
    }
    public void nhapchieudai(){
        System.out.print("\nChieu dai =");
        dai=sc.nextFloat();
    }
    public void nhapchieurong(){
        System.out.print("\nChieu rong =");
        rong=sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi=(dai+rong)*2;
    }
    public void tinhdientich(){
        dientich=dai*rong;
    }
}
