package com.przemolec;

public class Main {

    public static void main(String[] args) {
        Stos stos = new Stos(10);
        stos.put("One");
        stos.put("Two");
        System.out.println(stos);
        System.out.println(stos.pull());
        System.out.println(stos.pull());
    }
}
