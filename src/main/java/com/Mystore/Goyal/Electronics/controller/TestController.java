package com.Mystore.Goyal.Electronics.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {


    @GetMapping("/")
    public String testFunction(){

    return "Welcome in our store.....";


}

}
