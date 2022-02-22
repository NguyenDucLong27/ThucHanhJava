package javaapplication15;
public class app11 {
    public static void main(String[] args) {
        int tong = 200000;
        int a = 10000;
        int b = 20000;
        int c = 50000;

        for (int i = 0; i <= tong / c; i++) {
            for (int j = 0; (j*b + i*c) <= tong; j++) {
                for (int k = 0; (k*a + j*b + i*c) <= tong; k++) {
                    if ((k*a + j*b + i*c) == tong){
                        System.out.println(k + " dong 10000, " + j + " dong 20000, " + i + " dong 50000");
                    }
                }
            }
        }
    }
}
