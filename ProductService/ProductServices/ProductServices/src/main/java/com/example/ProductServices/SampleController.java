package com.example.ProductServices;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable; // Add missing import;

@RestController
@RequestMapping("/sample")
public class SampleController {
    @RequestMapping(method = RequestMethod.GET, value = "/sayhello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/saybye")
    public String sayBye() {
        return "Bye Everyone";
    }
}
