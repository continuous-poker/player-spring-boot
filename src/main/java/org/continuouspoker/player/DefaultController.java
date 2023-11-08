package org.continuouspoker.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/")
    public String defaultEndpoint(){
        return "It works!";
    }

}
