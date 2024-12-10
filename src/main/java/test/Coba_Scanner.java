package test;

import java.util.Scanner;

public class Coba_Scanner {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String strLanjut = "0";
        while(strLanjut.equals("0")){
            System.out.println("Masukan Panjang : ");
            int intPanjang = sc.nextInt();
            System.out.println("Masukan Lebar : ");
            int intLebar = sc.nextInt();
            int intLuasPersegiPanjang = intPanjang * intLebar;
            System.out.println("Hasil Luas dari Persegi Panjang adalah "+intLuasPersegiPanjang);
            System.out.println("apakah anda akan lanjutkan jika iya masukan nilai 0 untuk iya: ");
            strLanjut= sc.next();
        }
    }
}
