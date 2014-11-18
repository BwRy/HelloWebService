package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{
    @Autowired
    private Greeter greeter;

//    @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "application/json")
//    public Greeting greetToJson(@RequestParam(required = true) String name) {
//        return new Greeting(42, "Hello, " + name);
//    }

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greetToText(@RequestParam(required = true) String name) {
        return greeter.greet(name);
    }
}
