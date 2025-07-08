package com.data.webData.service;

import com.data.webData.model.Producto;
import com.data.webData.repos.CategoriaRepository;
import com.data.webData.repos.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DescuentoService {

    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;

    public List<Producto> aplicarDescuentoCategoria(double descuento, Long idCategoria) {
        List<Producto> productos = productoRepository.findByCategoriaId(idCategoria);

        if (descuento <= 0 || descuento > 1)
            throw new RuntimeException("El descuento no puede ser ni menor que 0 ni mayor que 1");

        return productoRepository.saveAll(
                productos.stream()
                        .map(producto -> {
                            producto.setPrecio(producto.getPrecio() * 1.0 - descuento);
                            return producto;
                        })
                        .toList()
        );
    }

    public List<Producto> aplicarDescuentoCategorias(double descuento, List<Long> idsCategoria) {
        List<Producto> result = new ArrayList<>();

        idsCategoria.forEach(id -> {
            List<Producto> l = aplicarDescuentoCategoria(descuento, id);
            result.addAll(l);
        });

        return result;
    }


}
