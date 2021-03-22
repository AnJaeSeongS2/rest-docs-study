package com.sonan.restdocsstudy.controller;

import com.sonan.restdocsstudy.model.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jaeseong on 2021/03/22
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@Controller
public class HelloController {
    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloworldString() {
        return "helloworld";
    }

    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    public Hello helloworldJson() {
        Hello hello = new Hello("helloworld");
        return hello;
    }

    // show view resolver's response.
    @PostMapping(value = "/helloworld/page")
    public ModelAndView helloworldPage(@ModelAttribute("hello") Hello hello) {
        ModelAndView mav = new ModelAndView("helloworld");
        mav.addObject("hello", hello);
        return mav;
    }
}
