package com.openwebinars.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/producto/{id:[0-9]+}")
    public String emjemploPathVariable(
        @PathVariable("id") Long id,
        Model model){
            model.addAttribute("id",id);
            return "producto";
        }


    @GetMapping("/saludo")
    public String ejemploQueryParam(
            @RequestParam(
                    name="nombre",
                    required = false,
                    defaultValue = "User"
            ) String nombre,
            Model model
    )   {
        String msg = "Hola, "+ nombre;
        model.addAttribute("message",msg);
        return "index";
    }

    @GetMapping("/multimap")
    public ResponseEntity<String> ejemploMultiValue(
            @RequestParam MultiValueMap<String,String> params
            ) {
        return ResponseEntity.ok(params.toString());
    }

}
