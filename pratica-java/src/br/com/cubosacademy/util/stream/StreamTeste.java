package br.com.cubosacademy.util.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste {
    public static void main(String[] args) {
        List<String>  nomes = new ArrayList<String>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Kaique");

        //System.out.println(nomes.stream().count());

        Stream<String> nomes2 = nomes.stream();
        Stream<String> result = nomes2.filter (nome -> nome.equals("Kaique"));
       // System.out.println(result.toList());


        Pessoa kaique = new Pessoa ("kaique", "devesa");
        Pessoa pedro = new Pessoa ("pedro", "andrade");
        Pessoa ana = new Pessoa ("ana", "oliveira");

        List<Pessoa> usuarios = new ArrayList<Pessoa>();

        usuarios.add(kaique);
        usuarios.add(pedro);
        usuarios.add(ana);


        Stream<Pessoa> usuariosStream = usuarios.stream();
        Stream<String> resultado = usuariosStream.map( usuario -> {
            return usuario.getNome() + " " + usuario.getSobrenome();
        });

        System.out.println(resultado.toList());
    }


}
