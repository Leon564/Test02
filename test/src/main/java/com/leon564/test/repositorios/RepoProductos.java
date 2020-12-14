package com.leon564.test.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.leon564.test.entidades.Productos;




@Repository
public interface RepoProductos extends JpaRepository<Productos, Integer> {
	
	

	@Query("select p from Productos p where p.IdCategoria_FK.id = :IdCategoria_FK")
	List<Productos> findByCategory(Integer IdCategoria_FK);
}
