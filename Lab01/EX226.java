package Java;
import java.util.Scanner;
import java.lang.Math;
public class EX226 {
    
    static void FirstDegreeEquation(double a, double b){
        if (a == 0) {
            if (b == 0)
                System.out.println("Phuong trinh vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        }
        else 
            System.out.println("Nghiem cua phuong trinh la: " + -b/a);
    }
    static void Sysof2equation(double D, double D1, double D2){
        if (D != 0) {
            System.out.printf("He co 1 nghiem duy nhat (%d; %d)", D1/D, D2/D);
        }
        else {
            if (D1 == 0 && D2 == 0)
            {
                System.out.println("He co vo so nghiem");
            }
            else 
                System.out.println("He vo nghiem");
        }
    }
    static void Seconddegreeequation(double a, double b, double c) {
        if (a == 0)
            FirstDegreeEquation(b, c);
        else {
            double delta = b*b - 4*a*c;
            if (delta == 0) {
                double x = -b/(2*a);
                System.out.println("Phuong trinh co 1 nghiem kep " + x);
            }
            else if (delta < 0)
                System.out.println("Phuong trinh vo nghiem");
            else {
                double x1 = (-b + Math.sqrt(delta))/(4*a);
                double x2 = (-b - Math.sqrt(delta))/(4*a);
                System.out.printf("Phuong trinh co 2 nghiem la %.2f va %.2f", x1, x2);
            }
        }
    }
    public static void main(String[] args) {

        double[][] arr = new double[10][10];
        Scanner inpp = new Scanner(System.in);

        System.out.println("Giai phuong trinh bac nhat ax + b = 0\n  a = ");
        double a = inpp.nextDouble();
        System.out.println("b = ");
        double b = inpp.nextDouble();
        FirstDegreeEquation(a, b);

        System.out.println("Giai he phuong trinh bac nhat 2 an . Nhap vao ma tran he so");
        for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= 3; j++){
                arr[i][j] = inpp.nextDouble();
            }
        }
        double d = arr[1][1] * arr[2][2] - arr[1][2] * arr[2][1];
        double d1 = arr[1][3] * arr[2][2] - arr[2][3] * arr[1][2];
        double d2 = arr[1][1] * arr[2][3] - arr[2][1] * arr[1][3];
        Sysof2equation(d, d1, d2);

        System.out.println("Giai phuong trinh bac hai a*x^2 + b*x + c = 0\n");
        System.out.println("a =  \n");
        double a1 = inpp.nextDouble();
        System.out.println("b =  \n");
        double b1 = inpp.nextDouble();
        System.out.println("c =  \n");
        double c1 = inpp.nextDouble();
        Seconddegreeequation(a1, b1, c1);

        inpp.close();

    }

}
