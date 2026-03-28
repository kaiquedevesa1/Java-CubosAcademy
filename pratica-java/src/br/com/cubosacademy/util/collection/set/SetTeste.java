package br.com.cubosacademy.util.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();

        nomes.add("João");
        nomes.add("Kaique"); //cria uma certa ordenação
        nomes.add("kaique");
        nomes.remove("kaique");
        System.out.println(nomes.size());


        System.out.println(nomes);
    }
}
