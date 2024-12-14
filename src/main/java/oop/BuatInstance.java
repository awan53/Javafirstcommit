package oop;

import collection.User;

public class BuatInstance {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);
        User user1 = new User();
        System.out.println(user1);
    }
}
