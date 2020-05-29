package modul3b;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int i, min, max, sum = 0;
        float rata;
        Scanner masukan = new Scanner(System.in);
        int[] nilai = new int [10];
        for(i=0;i<10;i++){
            System.out.print("Ketik nilai ke-"+ (i+1) +" : ");
            nilai[i] = masukan.nextInt();
        }
        System.out.println("\nData pada Array\n");
        for(i=0;i<10;i++)
            System.out.println("Nilai ke-" + (i + 1) + " : " + nilai[i]);
        min = max = nilai[0];
        for(i=0; i<10; i++){
            if (nilai[i]>max)
                max = nilai[i];
            if (nilai[i]<min)
                min = nilai[i];
        }
        for(i=0; i<10; i++)
            sum = sum + nilai[i];
        rata = sum/10;
        System.out.println("\nNilai terbesar adalah " + max);
        System.out.println("Nilai terkecil adalah " + min);
        System.out.println("Nilai rata-rata adalah " + rata);
    }
}
