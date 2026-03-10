package br.com.cubosacademy.patterns.singleton;

public class Conexao {

    private static Conexao instancia;

    public String bancodedados;



    private  Conexao(String bancodedados){
        this.bancodedados = bancodedados;
    }

    public static Conexao getInstance(String bancodedados){
        if(instancia == null){
            instancia = new Conexao(bancodedados);
        }

        return instancia;
    }
}
