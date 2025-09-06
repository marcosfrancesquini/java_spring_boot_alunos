package br.com.fatecwebsystem.websystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecwebsystem.websystem.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{ //integer e a chave primaria
    
}
