package com.springblog.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HelloController {

//    @GetMapping("/")
//    @ResponseBody
//    public String hello() {
//        return "This is the landing page!";
//    }


    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int responseAdd(@PathVariable int num1, @PathVariable int num2)
    {
        return num1 + num2;
    }
    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public int responseSub(@PathVariable int num1, @PathVariable int num2)
    {
        return num1 - num2;
    }
    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int responseMulti(@PathVariable int num1, @PathVariable int num2)
    {
        return num1 * num2;
    }
    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public Double responseDivide(@PathVariable double num1, @PathVariable double num2)
    {
        return num1 / num2;
    }
}

