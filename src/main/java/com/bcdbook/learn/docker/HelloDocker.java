package com.bcdbook.learn.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author summer
 * @date 2018/3/16 下午1:28
 */
@Controller
public class HelloDocker {

    @GetMapping
    public String index(){
        return "index";
    }
}
