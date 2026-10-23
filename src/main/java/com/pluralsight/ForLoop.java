package com.pluralsight;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 10; ; i--) {
            System.out.println(i);
            if (i == 1) {
                System.out.println("Launch!");
                break;
            }
        }
    }
}
