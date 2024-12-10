package test;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kata");
        String strInput = sc.nextLine();
        char [] chArr = strInput.toCharArray();
        int intInput = chArr.length;
        String strOutput = "";
        for (int i = (intInput-1);
             i >= 0;
             i--) {
            strOutput = strOutput + chArr[i];
        }

        System.out.println("Output is : "+strOutput);
        System.out.println((strOutput.equalsIgnoreCase(strInput))?"Kata tersebut adalah Palindrom":"Kata tersebut bukan Palindrom");



    }
}
