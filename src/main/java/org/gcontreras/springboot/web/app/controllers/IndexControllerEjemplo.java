package org.gcontreras.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexControllerEjemplo {

/*    //Varias formas de pasar datos a la vista

    @GetMapping({"/index", "/home", "/", ""})
    public String index(Model model) {
        model.addAttribute("titulo", "Hola Spring Framework con Model");
        return "index";
    }
    @GetMapping({"/index2", "/home2"})
    public String index2(ModelMap model) {
        model.addAttribute("titulo", "Hola Spring Framework con ModelMap");
        return "index";
    }
    @GetMapping({"/index3", "/home3"})
    public ModelAndView index3(ModelAndView mv) {
        mv.addObject("titulo", "Hola Spring Framework con ModelAndView");
        mv.setViewName("index");
        return mv;
    }
    @GetMapping({"/index4", "/home4"})
    public String index4(Map<String, Object> map) {
        map.put("titulo", "Hola Spring Framework con Map");
        return "index";
    }*/
}
