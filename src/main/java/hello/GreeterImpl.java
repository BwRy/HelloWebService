package hello;

import org.springframework.stereotype.Component;

@Component
public class GreeterImpl implements Greeter {
    @Override
    public String greet(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        return "Hello, " + name + "!";
    }
}
