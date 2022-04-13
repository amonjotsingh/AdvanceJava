package co.pragra.java.SpringDemo2;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ElectricCar implements Engine{

    @Override
    public String getEngine() {
        return "Electric";
    }
}
