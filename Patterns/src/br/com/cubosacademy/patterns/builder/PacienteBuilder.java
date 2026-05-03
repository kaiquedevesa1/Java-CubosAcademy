package br.com.cubosacademy.patterns.builder;

public class PacienteBuilder implements IPacienteBuilder{

    private String nome;

    private String email;

    private String cpf;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setEmail(String email) {
       this.email = email;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public  Paciente getResult(){
        return new Paciente(nome,cpf,email);
    }
}
