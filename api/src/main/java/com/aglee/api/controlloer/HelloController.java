package com.aglee.api.controlloer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/greeting")
public class HelloController {

    @GetMapping("korean")
    public String korea() {
        return "안녕";
    }

    @GetMapping("english")
    public String english() {
        return "Hello";
    }

    @GetMapping("french")
    public String french() {
        return "Bonjour";
    }

}
