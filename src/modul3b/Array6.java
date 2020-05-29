package modul3b;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner data = new Scanner (System.in);
        int tahun;
        System.out.print("Masukan Tahun (1900 - 2020) : ");
        tahun = data.nextInt();
        data.nextLine();
        if (tahun < 1900){
            System.out.println ("Maaf, Tahun Input Di Bawah 1900");
        }
        else if (tahun > 2020){
            System.out.println ("Maaf, Tahun Input Diatas 2020");
        }
        else {
            if ((tahun % 4==0 && tahun % 100!=0) || tahun % 400==0)
                System.out.println(+ tahun +" adalah tahun kabisat.");                        
            else
                System.out.println(+ tahun +" bukan tahun kabisat.");
        }
    }
} 
