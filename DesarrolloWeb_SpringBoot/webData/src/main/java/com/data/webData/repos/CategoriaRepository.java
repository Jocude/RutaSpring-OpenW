package com.data.webData.repos;

import com.data.webData.model.Categoria;
import com.data.webData.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
