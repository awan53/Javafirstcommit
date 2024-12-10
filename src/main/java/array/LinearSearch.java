package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int Intarry [] = {2,47,8,57,35,97,49};

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Angka yang di pilih");
        int Intput = sc.nextInt();

        boolean isValid = false;

        for (int i = 0; i < Intarry.length; i++) {
            if (Intput == Intarry[i]) {
                isValid = true;
                System.out.println("Data ditemukan pada index ke "+i);
                break;
            }
        }

        if (!isValid) {
            System.out.println("Data Index tidak ditemukan");
        }

    }
}
