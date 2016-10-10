package foo.bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public static final Logger log = LoggerFactory.getLogger(HelloService.class);


    public String sayHello() {

        log.info("111111");
        return "Hello world!";
    }
}
