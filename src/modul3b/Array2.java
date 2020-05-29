package modul3b;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        String [][]array = new String [20][20];
        int i;
        Scanner masukan = new Scanner(System.in);
        for(i=1;i<6;i++){
            System.out.print("Ketik nama mahasiswa ke-"+ i +" : ");
            array [i][0] = masukan.nextLine();
            System.out.print("Ketik NIM Mahasiswa ke-"+ i +" : ");
            array [i][1] = masukan.nextLine();
        }
        System.out.println("\nData pada Array");
        for(i=1;i<6;i++){
            System.out.println("Nama mahasiswa ke-" + i +" = "+array[i][0]);
            System.out.println("NIM mahasiswa ke-" + i +" = "+array[i][1]);
        } 
    } 
}
