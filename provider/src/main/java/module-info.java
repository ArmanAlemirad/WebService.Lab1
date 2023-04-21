import org.example.provider.EuroToSekConverter;
import org.example.provider.SekToEuroConverter;
import org.example.service.CurrencyConverter;

module org.example.provider {
    requires org.example.service;
    opens org.example.provider;
    provides CurrencyConverter with EuroToSekConverter, SekToEuroConverter;

}
