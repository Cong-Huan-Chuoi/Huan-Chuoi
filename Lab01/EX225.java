package Java;
import java.lang.Math;
import java.util.Scanner;
public class EX225 {
    static double sum2(double x, double y){
        return x+y;
    }
    static double diff(double x, double y){
        return Math.abs(x-y);
    }
    static double product(double x, double y){
        return x*y;
    }
    static double division(double x, double y){
        if (y != 0) return x/y;
        else return -1;
    }
    
    public static void main(String[] args) {
        Scanner inputdata2 = new Scanner(System.in);
            double a = inputdata2.nextDouble();
            double b = inputdata2.nextDouble();
            inputdata2.close();
            System.out.println("Tong cua "+a+" va "+b+" la "+sum2(a,b)+"");
            System.out.println("Khoang cach cua "+a+" va "+b+" la "+diff(a,b)+"");
            System.out.println("Tich cua "+a+" va "+b+" la "+product(a,b)+"");
            System.out.println("Thuong cua "+a+" va "+b+" la "+division(a,b)+"");
        
 
    }
}
