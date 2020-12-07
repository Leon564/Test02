package com.leon564.test.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leon564.test.entidades.user;

@Repository
public interface RepoUser extends JpaRepository<user, Integer> {

}
