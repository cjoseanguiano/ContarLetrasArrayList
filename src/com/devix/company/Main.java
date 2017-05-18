package com.devix.company;

public class Main {

    public static void main(String[] args) {

        String[] values = {"holaA", "holaAb", "holaabc"};

        Object[] array = values;

        for (Object v : array) {
            System.out.println(((String) v).length());
        }

    }
}
