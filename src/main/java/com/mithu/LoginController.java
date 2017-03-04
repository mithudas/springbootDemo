package com.mithu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mithu on 4/3/17.
 */
@RestController
public class LoginController {
    @RequestMapping("/")
    public String home() {
        return "hello world!!";
    }
}
