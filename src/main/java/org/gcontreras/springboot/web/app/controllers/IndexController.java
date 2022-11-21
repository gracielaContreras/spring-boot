package org.gcontreras.springboot.web.app.controllers;

import org.gcontreras.springboot.web.app.models.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {
    @Value("${texto.indexController.index.titulo}")
    private String textoIndex;
    @Value("${texto.indexController.perfil.titulo}")
    private String textoPerfil;
    @Value("${texto.indexController.listar.titulo}")
    private String textoListar;

    @GetMapping({"/index", "/home", "/", ""})
    public String index(Model model) {
        model.addAttribute("titulo", textoIndex);
        return "index";
    }
    @GetMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Tom");
        usuario.setApellido("Welling");
        usuario.setEmail("twelling@gmail.com");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", textoPerfil + usuario.getNombre());
        return "perfil";
    }
    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", textoListar);
        return "listar";
    }
    @ModelAttribute("usuarios") //Es un método en común a todos los demás método
    public List<Usuario> poblarUsuario(){
        List<Usuario> usuarios = Arrays.asList(new Usuario("Tom","Welling","twelling@gmail.com"),
                new Usuario("Eduardo","Escobar","eescobar@gmail.com"),
                new Usuario("John","Doe","jdoe@gmail.com"));
        return usuarios;
    }
}
