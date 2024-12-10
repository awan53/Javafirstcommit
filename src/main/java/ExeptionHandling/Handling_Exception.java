package ExeptionHandling;

import java.util.Scanner;

public class Handling_Exception {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Angka 10 s.d 20 : ");
        int inInput = sc.nextInt();
        if(!(inInput >= 10 && inInput <= 20))
        {
            System.out.println("Program Berhenti");
            System.exit(0);
        }

        while (true) {
            System.out.println("Program Tetap Berjalan");
            try
            {
                Thread.sleep(10000);
            }catch(InterruptedException e)
            {
                throw  new RuntimeException(e);
            }
        }
    }
}
