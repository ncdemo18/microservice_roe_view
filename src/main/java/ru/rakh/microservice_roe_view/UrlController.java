package ru.rakh.microservice_roe_view;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1")
public class UrlController {

    @RequestMapping("/")
    public String index(){
        return "125";
    }

}
