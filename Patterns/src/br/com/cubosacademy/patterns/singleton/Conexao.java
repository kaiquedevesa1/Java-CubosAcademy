package br.com.cubosacademy.patterns.singleton;

public class Conexao {  //classe

    private static Conexao instancia; //variável estática que guarda a única instância da classe

    public String bancodedados; //Isso é um atributo da classe, Guarda o nome do banco.





    private  Conexao(String bancodedados){
        this.bancodedados = bancodedados;
    } //criando um construtor privado que recebe o banco de dados.

    public static Conexao getInstance(String bancodedados){ // Método estático que controla a criação do objeto
        if(instancia == null){ // Se não existe instância → cria
            instancia = new Conexao(bancodedados); //Se já existe → reutiliza
        }

        return instancia; //Se já existe → reutiliza
    }
}
