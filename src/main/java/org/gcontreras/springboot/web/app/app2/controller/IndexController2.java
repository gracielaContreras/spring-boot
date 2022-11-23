package org.gcontreras.springboot.web.app.app2.controller;

import org.gcontreras.springboot.web.app.app2.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app2")
public class IndexController2 {
    @Autowired
    @Qualifier("MiServicioComplejo")
    private IServicio service;

    @GetMapping({"/", "/index"})
    public String index(Model model){
        model.addAttribute("operacion", service.operacion());
        return "app2/index";
    }
}
