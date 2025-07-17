package com.data.webData.service;

import com.data.webData.model.Producto;
import com.data.webData.repos.ProductoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository productoRepository;

    public Producto save(Producto producto){
        return productoRepository.save(producto);
    }

    public List<Producto> findAll(){
        return productoRepository.findAll();
    }

    public Producto findById(Long id){
        return  productoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));
    }

    public void delete(Long id){
        productoRepository.deleteById(id);
    }


}
