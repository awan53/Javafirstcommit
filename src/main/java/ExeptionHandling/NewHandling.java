package ExeptionHandling;

import java.sql.SQLException;
import java.util.Scanner;

public class NewHandling {
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Masuk ke Sini");
            Scanner sc = new Scanner(System.in);
            System.out.print("Masuk Angka");
            int input = sc.nextInt();

        }catch(Exception e)
        {
            System.out.println("Masuk Kesini Illegal Argument Error nya adalah "+e.getMessage());
        }finally {
            System.out.println("ini akan di running");
        }

        Scanner scn = new Scanner(System.in);
        int intx = scn.nextInt();
        if (intx>10)
        {
            throw new IllegalArgumentException("Harus lebih dari 10");
        }else{
            System.out.println("Done !!");
        }
        System.out.println("Hue");

        try
        {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }
    public static void callData()throws SQLException
    {
        System.out.println("Masuk Sini");
    }
}
