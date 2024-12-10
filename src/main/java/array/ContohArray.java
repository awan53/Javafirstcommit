package array;

public class ContohArray {

    public static void main(String[] args)
    {
        int intArry [] = {5,4,9};
       for (int i = 0; i < intArry.length; i++)
      {
           System.out.println(intArry[i]);
        }

        System.out.println("Sesudah dirubah");
        intArry[0] = 4;
        intArry[1] = 8;
        for (int i = 0; i < intArry.length; i++)
        {
            System.out.println(intArry[i]);
        }
    }
}
