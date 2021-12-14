package test.demo.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/greet")
@CrossOrigin("*")
public class Greet {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    
     @RequestMapping("/hi")
    public String hi(){
        return "hi";
    }
}
