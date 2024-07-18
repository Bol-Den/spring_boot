package spring_boot_udemy.com.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    /// expose "/" to return Hello world!
    @GetMapping("/")
    public String helloWorld(){
        return "Hello world!";
    }

}
