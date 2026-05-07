package br.com.cubosacademy.util.io.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTeste {

    public static void main(String[] args) throws IOException {
        FileWriter fileredWriter = new FileWriter("src/teste.txt", true); // abre uma portaq no arquivo
        BufferedWriter bufferedWriter = new BufferedWriter(fileredWriter); //embrulha na memoria pra enviar tudo de uma vez

        bufferedWriter.write("Hello World"); //escreve o que voce quer colocar no arquivo
        bufferedWriter.append("\nteste1");
        bufferedWriter.close();





    }
}
