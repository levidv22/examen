package examen.upeu.edu.lp.infraestructure.controller;

import examen.upeu.edu.lp.app.service.RegistroService;
import examen.upeu.edu.lp.infraestructure.entity.RegistroEntity;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    private final RegistroService registroService;

    public RegistroController(RegistroService registroService) {
        this.registroService = registroService;
    }

    @GetMapping("/show")
    public String showRegistro(Model model) {
        List<RegistroEntity> registro = registroService.getRegistro();
        model.addAttribute("registro", registro);
        return "show";
    }

    @GetMapping("/create")
    public String Registro(Model model) {
        model.addAttribute("registro", new RegistroEntity());
        return "create";
    }

    @PostMapping("/create")
    public String saveRegistro(@ModelAttribute RegistroEntity registroEntity) {
        registroService.saveRegistro(registroEntity);
        return "redirect:/registro/show";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {
        RegistroEntity registro = registroService.getRegistroById(id).orElseThrow(() -> new IllegalArgumentException("ID no válido:" + id));
        model.addAttribute("registro", registro);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String eliminarRegistro(@PathVariable Integer id) {
        registroService.deleteRegistroById(id);
        return "redirect:/registro/show";
    }
}
