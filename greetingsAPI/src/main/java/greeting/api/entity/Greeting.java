package greeting.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String country;
    private String greeting;

    public Greeting(String country, String greeting) {
        this.country = country;
        this.greeting = greeting;
    }
}
