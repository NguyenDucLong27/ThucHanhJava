package app;
import java.util.Scanner;

public class App {
private static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
         System.out.print("Nh?p h? s? bac 2, a = ");
        float a = App.scanner.nextFloat();
        System.out.print("Nhap he so bac 1, b = ");
        float b = App.scanner.nextFloat();
        System.out.print("Nhap he so tu do, c = ");
        float c = scanner.nextFloat();
        App.giaiPTBac2(a, b, c);
    }
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co mot nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // t�nh delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem : "
                    + "x1 = " + x1 + " v� x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }

    }
    
