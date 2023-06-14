package api;

import api.entity.Greeting;
import api.service.GreetingService;
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
        greetingService.save(new Greeting("Brasil", "Olá Mundo"));
        greetingService.save(new Greeting("Estados Unidos", "Hello World"));
        greetingService.save(new Greeting("França", "Bonjour le monde"));
        greetingService.save(new Greeting("Espanha", "Hola Mundo"));
        greetingService.save(new Greeting("Alemanha", "Hallo Welt"));
        greetingService.save(new Greeting("Itália", "Ciao Mondo"));
        greetingService.save(new Greeting("Japão", "こんにちは世界"));
        greetingService.save(new Greeting("China", "你好，世界"));
        greetingService.save(new Greeting("Rússia", "Привет, мир"));
        greetingService.save(new Greeting("Índia", "नमस्ते दुनिया"));
    }


}
