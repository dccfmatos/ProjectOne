package mainPackage.ControllersREST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleControllerRest {
    @GetMapping("/hello")
    public String hello (@RequestParam(value= "name", defaultValue = "Dia4na") String name) {
        return String.format("Hello %s", name);
    }

    @GetMapping("/hello2/{name}")
    public String hello2 (@PathVariable final String name) {
        return String.format("Hello %s", name);
        }

}
