package Modul9.Praktikum;

import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        try {
            System.out.println(" Masukkan angka : ");
            int num = sc.nextInt();
            if (num>10) throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception s){
            System.out.println("Angka lebih dari 10");
        }
        System.out.println("Selesai");
    }
}
