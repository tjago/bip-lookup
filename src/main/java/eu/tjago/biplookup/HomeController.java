package eu.tjago.biplookup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tomasz on 2016-01-13.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String greeting() {
        return "greeting";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

/*
  already mapped somewhere in config
    @RequestMapping("/error")
    public String errorPage(Model model) {
        return "error";
    }
    */
}
