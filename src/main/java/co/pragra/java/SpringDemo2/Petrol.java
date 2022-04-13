package co.pragra.java.SpringDemo2;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Engine {

    @Override
    public String getEngine() {
        return "Petrol";
    }
}
