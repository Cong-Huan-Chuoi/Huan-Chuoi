package Java;
import java.util.Scanner;

public class Ex63 {
    static void PrintStar(int n){

        for (int i=1; i<=n; i++){
            for (int j=1; j<=2*n-1; j++){
                if (j >= n-i+1 && j <= n+i-1)  System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner inpp = new Scanner(System.in);
        int n = inpp.nextInt();
        inpp.close(); 
        PrintStar(n);
    }
}
