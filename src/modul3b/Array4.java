package modul3b;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        int i, max, sum = 0, pos = 0;
        float rata;
        Scanner masukan = new Scanner(System.in);
        int[] nilai = new int [10];
        for(i=0;i<10;i++){
            System.out.print("Ketik nilai ke-"+ (i+1) +" : ");
            nilai[i] = masukan.nextInt();
        }
        System.out.println("\nData pada Array\n");
        for(i=0;i<10;i++)
            System.out.println("Nilai array ke-" + i + " = " + nilai[i]);
        max = nilai[0];
        for(i=0; i<10; i++){
            if (nilai[i]>max){
                max = nilai[i];
                pos = i;
            }
        }
        for(i=0; i<10; i++)
            sum = sum + nilai[i];
        rata = sum/10;
        System.out.println("\nNilai terbesar adalah " + max + ", terdapat pada array ke-" + pos);
        System.out.println("Nilai rata-rata adalah " + rata);
    }
}
