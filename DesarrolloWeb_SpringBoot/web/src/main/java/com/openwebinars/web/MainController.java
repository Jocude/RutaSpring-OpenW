package com.openwebinars.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    public String Welcome(Model model) {
        model.addAttribute("message","Hola Mundo!!");
        return "index";
    }

    @ModelAttribute("otroSaludo")
    public String otroSaludo(){
        return  "Espero aprender mucho con este curso de Desarrollo Web con Spring";
    }

    @GetMapping("/other1")
    @ResponseBody
    public String responseString(){
        return "Hola desde @ResponseBody!!";
    }

    @GetMapping("/other2")
    public ResponseEntity<String> responseEntity(){
        return ResponseEntity.ok("Hola desde ResponseEntity<String>!!");
    }

    @GetMapping("/forward")
    public String forward(){
        return "forward:/";
    }

    @GetMapping("/redirect")
    public String redirect(){
        return "redirect:/";
    }
}
