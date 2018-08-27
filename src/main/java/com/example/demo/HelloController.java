package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;

/**
 * Created by Khang Nguyen.
 * Email: khang.nguyen@banvien.com
 * Date: 27/08/2018
 * Time: 2:08 PM
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/hello")
    public ModelAndView hello(@RequestParam(name="name", required = false, defaultValue = "World")String name, Model model){
        model.addAttribute("name", name);
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("name", name);
        return mav;
    }
}
