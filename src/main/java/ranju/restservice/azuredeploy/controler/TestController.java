package ranju.restservice.azuredeploy.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String getdata()
    {
       return "Hello Ranju";
    }

}
