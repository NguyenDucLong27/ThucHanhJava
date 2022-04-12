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
public class hinhtron extends hinhhoc {
   public float bk;
   public hinhtron(){
       ten = "Hinh tron";
   }
   public void nhapbankinh(){
       System.out.print("\nNhap ban kinh :");
       Scanner sc= new Scanner(System.in);
       bk=sc.nextFloat();
   }
   public void tinhchuvi(){
       chuvi= 2*pi*bk;
   }
   public void tinhdientich(){
       dientich= pi*bk*bk;
   }   
}
