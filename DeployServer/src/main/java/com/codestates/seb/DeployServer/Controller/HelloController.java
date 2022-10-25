package com.codestates.seb.DeployServer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello () {
        return "이게 나오면 성공입니다 ! if you see this, you succeeded on working with githubActions+AWS ! ";
    }

}
