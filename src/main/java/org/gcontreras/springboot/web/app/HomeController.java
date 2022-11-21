package org.gcontreras.springboot.web.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Retornando redirect y forward como respuesta en métodos del controlador
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home2() {
        return "forward:/app/index";
    }
/*    @GetMapping("/")
    public String home() {
        return "redirect:/app/index";
    }*/
/*    @GetMapping("/")
    public String home3() {
        return "redirect:https://www.google.com/";
    }*/
}
