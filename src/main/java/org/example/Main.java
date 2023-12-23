package org.example;

import suport.EmptyExeption;
import suport.Toy;
import suport.Viktorina;

import java.io.Console;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws EmptyExeption {
        Viktorina newyear= new Viktorina();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите колличество призов");
        Integer count=scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Введите данные через пробел: id имя шанс выигрыша колличество");
        for (int i = 0; i < count; i++) {
            newyear.put(scanner1.nextLine());
        }
        for (int i = 0; i < 20; i++) {
            newyear.get();
        }

    }
}