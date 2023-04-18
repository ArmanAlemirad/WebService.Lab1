import org.example.provider.EnglishGreeting;
import org.example.provider.SwedishGreetings;
import org.example.service.Greeting;

module org.example.provider {
    requires org.example.service;
    provides Greeting with SwedishGreetings, EnglishGreeting;

}
