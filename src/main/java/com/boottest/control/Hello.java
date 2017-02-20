package com.boottest.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
    @RequestMapping(value = "/")
    ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello, World!", HttpStatus.OK);
    }
}
