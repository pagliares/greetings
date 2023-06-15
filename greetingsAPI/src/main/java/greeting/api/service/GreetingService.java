package greeting.api.service;

import greeting.api.entity.Greeting;
import greeting.api.repository.GreetingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;
    public Greeting findById(int id) {
        return greetingRepository.findById(id);
    }
    public List<Greeting> findAll() {
        return (List<Greeting>) greetingRepository.findAll();
    }
    public Greeting save(Greeting greeting) {
        return greetingRepository.save(greeting);
    }
}
