package br.com.fatecwebsystem.websystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecwebsystem.websystem.dto.AlunoTelefone;
import br.com.fatecwebsystem.websystem.entity.Aluno;
import br.com.fatecwebsystem.websystem.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/alunos") //alunos
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    //Método para abriri o formulário de criação de alunos
    @GetMapping("/criar") // /alunos/criar/ que ta no href da html
    public String criarForme(Model model) {
        model.addAttribute("aluno", new Aluno()); //cria novo objeto vazio!!!
        return "aluno/formularioAluno"; //cria e manda pro formulario de aluno "${aluno}"
    }
    
    @PostMapping("/salvar") //isso sao rotas!
    public String salvar(@ModelAttribute Aluno aluno) {
        alunoService.save(aluno);
        return "redirect:/alunos/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Aluno> alunos = alunoService.findALL();
        model.addAttribute("alunos", alunos);
        return "aluno/listaAluno";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        alunoService.deleteById(id);
        return "redirect:/alunos/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
        Aluno aluno = alunoService.findById(id);
        model.addAttribute("aluno", aluno);
        return "aluno/formularioAluno";
    }

    @GetMapping("/listar-nome-telefone")
    public String listarNomeTelefone(Model model) {
        List<AlunoTelefone> alunos = alunoService.buscarNomesEtelefone();
        model.addAttribute("alunos", alunos);
        return "aluno/listaNomeTelefone"; //o listaNomeTelefone.html
    }
    
    
}
