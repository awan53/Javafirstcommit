package wrapperclass;

import java.util.ArrayList;
import java.util.List;

public class contohWrapperClass {
    public static void main(String[] args) {
        List<ClassPassing> ListInt = new ArrayList<>();
        ListInt.add(new ClassPassing());
        ListInt.add(new ClassPassing());
        System.out.println(ListInt);

        System.out.println(Integer.toBinaryString(15));
        System.out.println(Integer.parseInt("1000")+20);
        System.out.println("1000"+20);
        System.out.println(Double.parseDouble("100"));
        System.out.println(String.valueOf(10.0));
        System.out.println(String.valueOf(10));
        System.out.println(String.valueOf(10L));
        System.out.println("true");
        System.out.println(true);

        Character c = 'A';
        int intC = c;
        //jika angka ok else not ok?
        if(c>=48 && c<=57){
            System.out.println("OK");
        }else {
            System.out.println("NOT OK");
        }

    }
}
