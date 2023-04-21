package org.example.provider;

import org.example.service.CurrencyConverter;

public class EuroToSekConverter implements CurrencyConverter {
    @Override
    public String convert(double amount) {
        return amount + " SEK, is " + amount/11.30 + " EUR";
    }
}
