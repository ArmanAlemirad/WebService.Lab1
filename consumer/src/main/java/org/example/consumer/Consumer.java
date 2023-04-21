package org.example.consumer;


import org.example.service.CurrencyConverter;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Consumer {

    public static void main(String[] args) {
        ServiceLoader<CurrencyConverter> converters = ServiceLoader.load(CurrencyConverter.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to convert:");

        double amount = scanner.nextDouble();
        for (CurrencyConverter converter : converters) {
            System.out.println(converter.convert(amount));
        }
    }
}
