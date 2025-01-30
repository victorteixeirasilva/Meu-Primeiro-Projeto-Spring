package com.victorteixeirasilva.Meu_Primeiro_Projeto_Spring;

import com.victorteixeirasilva.Meu_Primeiro_Projeto_Spring.domain.User;
import com.victorteixeirasilva.Meu_Primeiro_Projeto_Spring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Victor");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){
        return "Hello World post" + body.getName();
    }

}
