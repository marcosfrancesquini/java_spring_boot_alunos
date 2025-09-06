package br.com.fatecwebsystem.websystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecwebsystem.websystem.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{ 
    
}
