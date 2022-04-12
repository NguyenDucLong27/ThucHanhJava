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
public class hinhtru extends hinhtron {
    public float chieucao;
    public hinhtru(){
        ten ="Hinh tru";
    }
    public void nhapchieucao(){
    System.out.print("\nNhap chieu cao :");
    Scanner sc= new Scanner(System.in);
    chieucao=sc.nextFloat();
   }
    public void tinhthetich(){
        tinhdientich();
        thetich=dientich*chieucao;
    }
}

