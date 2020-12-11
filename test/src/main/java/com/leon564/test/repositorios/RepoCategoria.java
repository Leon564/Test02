package com.leon564.test.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leon564.test.entidades.Categoria;


@Repository
public interface RepoCategoria extends JpaRepository<Categoria, Integer> {

}
