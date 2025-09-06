package br.com.fatecwebsystem.websystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecwebsystem.websystem.entity.Curso;
import br.com.fatecwebsystem.websystem.service.CursoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/cursos") 
public class CursoController {

    @Autowired
    private CursoService cursoService;

    //Método para abriri o formulário de criação de cursos
    @GetMapping("/criar") // /cursos/criar/ que ta no href da html
    public String criarForme(Model model) {
        model.addAttribute("curso", new Curso()); //cria novo objeto vazio!!!
        return "curso/formularioCurso"; //cria e manda pro formulario de curso "${curso}"
    }
    
    @PostMapping("/salvar") //isso sao rotas!
    public String salvar(@ModelAttribute Curso curso) {
        cursoService.save(curso);
        return "redirect:/cursos/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Curso> cursos = cursoService.findALL();
        model.addAttribute("cursos", cursos);
        return "curso/listaCurso";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        cursoService.deleteById(id);
        return "redirect:/cursos/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
        Curso curso = cursoService.findById(id);
        model.addAttribute("curso", curso);
        return "curso/formularioCurso";
    }   
    
}