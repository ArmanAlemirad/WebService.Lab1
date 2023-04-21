package org.example.provider;


import org.example.service.CurrencyConverter;

public class SekToEuroConverter implements CurrencyConverter {
    @Override
    public String convert(double amount) {
        return amount + " EUR, is " + amount*11.30 + " SEK";
    }
}
