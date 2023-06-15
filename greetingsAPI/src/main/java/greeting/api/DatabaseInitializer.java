package greeting.api;

import greeting.api.entity.Greeting;
import greeting.api.service.GreetingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {
    private final GreetingService greetingService;

    @Autowired
    public DatabaseInitializer(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @Override
    public void run(String... args) throws Exception {
        greetingService.save(new Greeting("Brazil", "Olá Mundo"));
        greetingService.save(new Greeting("United States", "Hello World"));
        greetingService.save(new Greeting("France", "Bonjour le monde"));
        greetingService.save(new Greeting("Spain", "Hola Mundo"));
        greetingService.save(new Greeting("Germany", "Hallo Welt"));
        greetingService.save(new Greeting("Italy", "Ciao Mondo"));
        greetingService.save(new Greeting("Japan", "こんにちは世界"));
        greetingService.save(new Greeting("China", "你好，世界"));
        greetingService.save(new Greeting("Russia", "Привет, мир"));
        greetingService.save(new Greeting("India", "नमस्ते दुनिया"));
        greetingService.save(new Greeting("Mexico", "Hola Mundo"));
        greetingService.save(new Greeting("Netherlands", "Hallo Wereld"));
        greetingService.save(new Greeting("Portugal", "Olá Mundo"));
        greetingService.save(new Greeting("South Korea", "안녕하세요 세상"));
        greetingService.save(new Greeting("Australia", "Hello World"));
        greetingService.save(new Greeting("Canada", "Hello World"));
    }
}
