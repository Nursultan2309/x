package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

String os;
        do {
            System.out.println("Введите первое число ");
            int  num= sc.nextInt();
            System.out.println("Введите второе число ");
           int   num2= sc.nextInt();
            System.out.println("Сумма ="+(num+num2));
            System.out.println("Хотите продолжить y/n");
            os= sc.next();
        }
        while(os.equals("y"));

        System.out.println("все");
    }

}
