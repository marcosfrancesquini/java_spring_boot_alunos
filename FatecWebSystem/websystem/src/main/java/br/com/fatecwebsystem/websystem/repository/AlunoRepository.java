package br.com.fatecwebsystem.websystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fatecwebsystem.websystem.dto.AlunoTelefone;
import br.com.fatecwebsystem.websystem.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{ //integer e a chave primaria
    //Método para Listar nome e telefone de alunos
     @Query("SELECT new br.com.fatecwebsystem.websystem.dto.AlunoTelefone(a.nomeAluno, a.telefoneAluno) from Aluno a")
     List<AlunoTelefone> buscarNomesETelefone();
}
