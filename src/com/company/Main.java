package com.company;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public void hiThere(){
        System.out.println("HAHAHAHAH");
    }

    public void shootPerson(){
        System.out.println("Hi! Please enter your name");
        String name = sc.next();
        System.out.println("Hi " + name + "!");
    }
    public int askAboutName(){
        int age;
        System.out.println("What is your age?");
        age = sc.nextInt();
        return age;
    }

    public static void main(String[] args) {
        Main prg = new Main();
        System.out.println("It works");
        prg.shootPerson();
        prg.askAboutName();
    }
}
