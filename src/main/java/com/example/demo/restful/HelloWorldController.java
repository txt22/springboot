package com.example.demo.conf.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by think on 2017/8/19.
 */
@RestController(value = "HelloWorld")
@RequestMapping("HelloWorld")
public class HelloWorldController {


    @RequestMapping("HelloWorld")
    public String helloWorld()
    {

        return  "HelloWorld" ;
    }
}

