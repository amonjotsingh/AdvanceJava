package co.pragra.java.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String course;
    private List<String> hobbies;
    private Map<String,String>  parents;

    public void init() {
        if (hobbies == null) {
            hobbies = new ArrayList<>();
        }
        hobbies.add("Sleeping");
    }

    public void destroy() {
        System.out.println("Destroying");
    }
}
