package com.company;

import java.util.Scanner;

public class Main {
    public static void chat() {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        chat();

        Scanner input = new Scanner(System.in);
        System.out.println("" +
                " Press 1 to show an integer\n Press 2 to show a double\n Press 3 to show a float\n"
        );

        int choice = input.nextInt();

    }
}
