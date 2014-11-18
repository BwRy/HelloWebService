package hello;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Component
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class GreeterTests
{
    @Autowired
    private Greeter greeter;

    @Test
    public void testGreeter() {
        Assert.assertEquals("Hello, Stefan!", greeter.greet("Stefan"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreeterWithNullName() {
        greeter.greet(null);
    }
}
