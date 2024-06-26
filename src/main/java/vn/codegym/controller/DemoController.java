package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @RequestMapping("demo")
    public ModelAndView demo() {
        ModelAndView modelAndView = new ModelAndView("/demo");
        return modelAndView;
    }

}
