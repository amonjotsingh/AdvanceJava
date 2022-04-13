package co.pragra.java.SpringDemo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Car {
    private String make;
    private String model;
    private Engine engine;
}
