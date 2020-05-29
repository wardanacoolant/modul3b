package modul3b;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
            System.out.print("Ketik bilangan yang akan dipangkatkan : ");
            float a = masukan.nextInt();
            System.out.print("Ketik nilai pangkat : ");
            float b = masukan.nextInt ();
            float c =(int) Math.pow(a, b);
            masukan.nextLine();
            System.out.println("Hasil dari " + a + " pangkat " + b + " adalah " + c);
    } 
}
