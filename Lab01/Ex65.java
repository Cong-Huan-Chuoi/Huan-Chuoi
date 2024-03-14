package Java;

import java.util.Scanner;

public class Ex65 {
    static int partition(int a[], int low, int high){
        int pivot = a[high];
        int left = low;
        int right = high-1;
        int temp;
        while(1!=0){
            while (left <= right && a[left] <= pivot) left++;
            while (right >= left && a[right] >= pivot) right--;
            if (left >= right) break;
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
         
        int temp1 = a[left];
        a[left] = a[high];
        a[high] = temp1;
        return left;
    }
    
    static void QuickSort(int a[], int low, int high){
        if (low < high){
            int pi = partition(a, low, high);
            
                QuickSort(a, low, pi-1);
            
            QuickSort(a, pi+1, high);
        } 

    }
    
    public static void main(String[] args) {
        Scanner inpp = new Scanner(System.in);

        int a[]  = new int[100000];
        int n = inpp.nextInt();

        for (int i=0; i<n; i++) a[i] = inpp.nextInt();
        inpp.close();
        QuickSort(a, 0, n-1);
        for (int i=0; i<n; i++) System.out.print(""+a[i]+" ");
    }
}
