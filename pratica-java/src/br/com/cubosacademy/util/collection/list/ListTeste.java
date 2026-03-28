package br.com.cubosacademy.util.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Morango");
        lista.add("Abacaxi");
        lista.add("Banana");
        lista.add("Laranja");
        //lista.remove("Laranja");
        //lista.remove(0);
        //lista.clear();
        //System.out.println(lista.get(1));
        //System.out.println(lista.contains("Abacaxi"));
        //System.out.println(lista.isEmpty());
        //lista.set(2, "Manga"); troca um indice
       // System.out.println(lista.size());

       // System.out.println(lista);

        Pessoa devesa = new Pessoa("Kaique", 30);
        Pessoa joao = new Pessoa("joao", 22);
        Pessoa maria = new Pessoa("maria", 16);
        Pessoa ana = new Pessoa("ana", 19);


        List<Pessoa> usuarios = new ArrayList<Pessoa>();

        usuarios.add(devesa);
        usuarios.add(joao);
        usuarios.add(maria);
        usuarios.add(ana);
        //usuario.remove(devesa);


        System.out.println(usuarios.size());



        for (Pessoa usuario : usuarios) {
            System.out.println(usuario.getNome());
        }

    }
}
