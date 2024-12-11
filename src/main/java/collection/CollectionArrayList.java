package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionArrayList {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User usr = new User ();//5f184fc6
        System.out.println("Reference usr 0 "+usr);
        usr.setNama("Paul");
        usr.setEmail("paul@gmail.com");
        usr.setPassword("Paul@123");
        usr.setAlamat("Bogor");
        usr.setNoHp("628128498609");
        usr.setUsername("paul123");
        list.add(usr);
        usr = new User ();//4j184fc6
        System.out.println("Reference usr 1 "+usr);
        usr.setNama("Marcelino");
        usr.setEmail("marcel@gmail.com");
        usr.setPassword("Marcel@123");
        usr.setAlamat("Jakarta");
        usr.setNoHp("628578498609");
        usr.setUsername("marcel123");
        list.add(usr);
        usr = new User ();//4j184fc6
        System.out.println("Reference usr 1 "+usr);
        usr.setNama("Bella");
        usr.setEmail("bella@gmail.com");
        usr.setPassword("bella@123");
        usr.setAlamat("Bekasi");
        usr.setNoHp("628888498609");
        usr.setUsername("bella123");
        list.add(usr);
        int intListSize = list.size();
        for (int i = 0; i < intListSize; i++) {
            System.out.println("Nama : "+list.get(i).getNama());
            System.out.println("Alamat : "+list.get(i).getAlamat());
            System.out.println("NoHp : "+list.get(i).getNoHp());
            System.out.println("Username : "+list.get(i).getUsername());
            System.out.println("Password : "+list.get(i).getPassword());
            System.out.println("Email : "+list.get(i).getEmail());
            System.out.println("=======================");
        }
        System.out.println(list);
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Nama : "+list.get(i).getNama());
            System.out.println("Alamat : "+list.get(i).getAlamat());
            System.out.println("NoHp : "+list.get(i).getNoHp());
            System.out.println("Username : "+list.get(i).getUsername());
            System.out.println("Password : "+list.get(i).getPassword());
            System.out.println("Email : "+list.get(i).getEmail());
            System.out.println("=======================");
        }
        int index = intListSize - 1;
        System.out.println(list);
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Nama : "+list.get(i).getNama());
            System.out.println("Alamat : "+list.get(i).getAlamat());
            System.out.println("NoHp : "+list.get(i).getNoHp());
            System.out.println("Username : "+list.get(i).getUsername());
            System.out.println("Password : "+list.get(i).getPassword());
            System.out.println("Email : "+list.get(i).getEmail());
            System.out.println("=======================");
        }
        int index2 = intListSize - 1;
        System.out.println(list);
        String strX = new StringBuilder().append("A").append(3).append("JKT").append("F").append(15.0).toString();

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Volvo");
        list2.add("BMW");
        list2.add("Ford");
        list2.add("Mazda");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        list.clear();
    }
    }

