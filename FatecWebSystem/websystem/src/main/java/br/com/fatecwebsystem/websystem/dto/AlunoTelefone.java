package br.com.fatecwebsystem.websystem.dto;

public class AlunoTelefone {
    
    private String nomeAluno;
    private String telefoneAluno;

    //metodo construtor
    public AlunoTelefone(String nomeAluno, String telefoneAluno) {
        this.nomeAluno = nomeAluno;
        this.telefoneAluno = telefoneAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

}
