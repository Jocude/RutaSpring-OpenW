package com.data.webData.controller;

import com.data.webData.model.Categoria;
import com.data.webData.model.Producto;
import com.data.webData.service.CategoriaService;
import com.data.webData.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    @ModelAttribute("categorias")
    public List<Categoria> categorias(){ return categoriaService.findAll();}

    @GetMapping("/new")
    public String mostrarFormularioProducto(Model model){
        model.addAttribute("producto",new Producto());
        return  "form-producto.html";
    }



}
