package br.com.fatecwebsystem.websystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity // Model, isso faz ele saber que tem que criar tabela
@NoArgsConstructor //contrutor cheio
@AllArgsConstructor //construtor vazio
@Getter
@Setter

public class Curso {
     @Id   
     @GeneratedValue(strategy = GenerationType.AUTO) //gerar automaticamente serial
     private Integer idCurso;
     
     @Column(nullable = false, length = 40)
     private String nomeCurso;

     @Column(nullable = false, length = 30)
     private String periodoCurso;

     private Integer chCurso;

     @Column(nullable = false, length = 40)
     private String tipoCurso;     
}
