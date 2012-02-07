package ro.danielp.arduino.webclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ro.danielp.arduino.core.SerialTest;

@Controller
public class FrontController {

    @RequestMapping(value = {"*", "/", "dashboard", "home"})
    public ModelAndView showDashboard() throws Exception {
        SerialTest.main();

        ModelAndView modelAndView = new ModelAndView("dashboard");
        return modelAndView;
    }

}


