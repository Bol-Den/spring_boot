package spring_boot_udemy.com.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${coach.name}" )
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    /// expose "/" to return Hello world!
    @GetMapping("/")
    public String helloWorld(){
        return "Hello world $$$777!";
    }

    /// expose new endpoint "workout"
    @GetMapping("/workout")
    public String hardWorkout(){
       return "This is hard workout 5k running";
    }

    /// expose new endpoint "fortune"
    @GetMapping("/fortune")
    public String dailyFortune(){
        return "My daily fortune";
    }


}
