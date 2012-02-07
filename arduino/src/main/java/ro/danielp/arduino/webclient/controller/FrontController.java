package ro.danielp.arduino.webclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {

    @RequestMapping(value = {"*", "/", "dashboard", "home"})
    public ModelAndView showDashboard() {
        ModelAndView modelAndView = new ModelAndView("dashboard");
        return modelAndView;
    }

}
