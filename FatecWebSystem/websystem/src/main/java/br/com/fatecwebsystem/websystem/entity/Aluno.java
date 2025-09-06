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
//ou @Data
public class Aluno {
    @Id //Anotação para chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO) //gerar automaticamente serial
    private Integer idAluno;

    @Column(nullable = false, length = 40) //anotacao para criar as colunas
    private String nomeAluno;

    @Column(nullable = false, length = 50)
    private String enderecoAluno;

    @Column(nullable = false, length = 11)
    private String telefoneAluno;

    @Column(nullable = false, length = 11)
    private String cpfAluno;

    private Integer raAluno;
}
