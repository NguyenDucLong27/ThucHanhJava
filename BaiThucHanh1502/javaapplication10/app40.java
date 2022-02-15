package javaapplication10;
import java.util.Scanner;
public class app40 {
private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args){
    int ngay=app40.scanner.nextInt();
    switch(ngay){
        case 2: System.out.print("Thu 2");
        break;
        case 3: System.out.print("Thu 3");
        break;
        case 4: System.out.print("Thu 4");
        break;
        case 5: System.out.print("Thu 5");
        break;
        case 6: System.out.print("Thu 6");
        break;
        case 7: System.out.print("Thu 7");
        break;
        case 8: System.out.print("Chu nhat");
        break;
        default:System.out.print("So ngay trong tuan sai");
        break;
    }   
}
}