package oop.package2;

public class CallMobil {

    public static void main(String[] args) {
      /*  Mobil mobil = new Mobil();
        mobil.setNamamerk("Suzuki");
        mobil.setJumlahduduk(3);
        mobil.setTahun("2024");
        mobil.setWarna("hitam");*/

       // Mobil mobil = new Mobil("x");


        //ini penganggilang constructor
        ReadOnly readOnly = new ReadOnly(
                "Gunawan",
                "Root",
                "localhost:3306");
        System.out.println(readOnly.getPassword());
        System.out.println(readOnly.getUsername());
        System.out.println(readOnly.getConnectionString());

    }

}
