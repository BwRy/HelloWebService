package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController
{
    @Autowired
    private Greeter greeter;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Greeting greetToJson(@RequestParam(required = true) String name) {
        return new Greeting(42, "Hello, " + name);
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "text/plain")
    public @ResponseBody String greetToText(@RequestParam(required = true) String name) {
        return greeter.greet(name);
    }
}
