package com.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author phantom
 */
@Controller
public class Hello {
    @RequestMapping("/helloworld")
    public String Hello() {
        System.out.println("hello");
        return "success";
    }

}
