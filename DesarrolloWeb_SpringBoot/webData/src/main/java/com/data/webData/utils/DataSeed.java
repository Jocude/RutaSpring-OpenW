package com.data.webData.utils;

import com.data.webData.model.Categoria;
import com.data.webData.model.Producto;
import com.data.webData.repos.CategoriaRepository;
import com.data.webData.repos.ProductoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataSeed {
    private final CategoriaRepository categoriaRepository;
    private final ProductoRepository productoRepository;

    @PostConstruct
    public void insertData(){
        Categoria categoriaElectronica = Categoria.builder()
                .nombre("Electronica")
                .build();

        Categoria categoriaHogar = Categoria.builder()
                .nombre("Hogar")
                .build();

        categoriaRepository.save(categoriaElectronica);
        categoriaRepository.save(categoriaHogar);

        //ELECTRONICA
        Producto producto1 = Producto.builder()
                .nombre("Televisor LED 43 pulgadas")
                .precio(399.99)
                .categoria(categoriaElectronica)
                .build();

        Producto producto2 = Producto.builder()
                .nombre("Auriculares Bluetooth")
                .precio(89.99)
                .categoria(categoriaElectronica)
                .build();

        Producto producto3 = Producto.builder()
                .nombre("Smartphone Android 128GB")
                .precio(299.99)
                .categoria(categoriaElectronica)
                .build();

        Producto producto4 = Producto.builder()
                .nombre("Tablet 10 pulgadas")
                .precio(199.99)
                .categoria(categoriaElectronica)
                .build();

        Producto producto5 = Producto.builder()
                .nombre("Cargador inalámbrico")
                .precio(24.99)
                .categoria(categoriaElectronica)
                .build();

        //HOGAR
        Producto producto6 = Producto.builder()
                .nombre("Lámpara de mesa LED")
                .precio(29.99)
                .categoria(categoriaHogar)
                .build();

        Producto producto7 = Producto.builder()
                .nombre("Aspiradora sin cable")
                .precio(149.99)
                .categoria(categoriaHogar)
                .build();

        Producto producto8 = Producto.builder()
                .nombre("Cafetera automática")
                .precio(79.99)
                .categoria(categoriaHogar)
                .build();

        Producto producto9 = Producto.builder()
                .nombre("Juego de sartenes antiadherentes")
                .precio(59.99)
                .categoria(categoriaHogar)
                .build();

        Producto producto10 = Producto.builder()
                .nombre("Humidificador ultrasónico")
                .precio(39.99)
                .categoria(categoriaHogar)
                .build();

        List<Producto> productos = List.of(producto1,producto2,producto3,producto4,producto5,producto6,producto7,producto8,producto9,producto10);

        productoRepository.saveAll(productos);

    }
}
