package modul3b;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] nilai = new int [10];
        int i;
        Scanner masukan = new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.print("Ketik nilai ke-"+ (i+1) +" : ");
            nilai[i] = masukan.nextInt();
        }
        System.out.println("\nData pada Array");
        for(i=0;i<10;i++){
            System.out.println("Nilai ke-"+ (i+1) +" = "+nilai[i]);            
        } 
    } 
}
