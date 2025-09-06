package br.com.fatecwebsystem.websystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecwebsystem.websystem.dto.AlunoTelefone;
import br.com.fatecwebsystem.websystem.entity.Aluno;
import br.com.fatecwebsystem.websystem.repository.AlunoRepository;

@Service
public class AlunoService {

    //Injeção de dependÊncia do repositório de alunos com a anotacao abaixo
    @Autowired
    private AlunoRepository alunoRepository; //AlunoRepository ja troxe todos os metodos da Jpa para alunoRepository que e um objeto

    //Método salvar aluno
    public Aluno save(Aluno aluno) { //esse save pode ter quqlquer nome
        return alunoRepository.save(aluno);
    }

    //Método para listar todos os alunos    
    public List<Aluno> findALL() {
        return alunoRepository.findAll();
    }
    
    // Método para excluir um aluno pelo ID
    public void deleteById(Integer id) {
        alunoRepository.deleteById(id);
    }
    
    //Método para buscar o aluno pelo ID
    public Aluno findById(Integer id) {
        return alunoRepository.findById(id).orElse(null);
    }

    //Método para buscar nome e telefone - metodo criado e no DTO Data Transfer Object
    public List<AlunoTelefone> buscarNomesEtelefone() { //aqui poderia ser outro nome
        return alunoRepository.buscarNomesETelefone();
    };
}
