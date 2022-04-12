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
public class hinhvuong extends hinhchunhat{
   public hinhvuong(){
       ten="Hinh vuong";
   }
   public void nhapcanh(){
       System.out.print("\nNhap canh ");
       Scanner sc=new Scanner(System.in);
       dai=rong=sc.nextFloat();
   }
}
