package br.com.cubosacademy.util.io.reader;

import java.io.*;

public class InputTeste {

    public static void main(String[] args) throws IOException {
        FileInputStream arquivo = new FileInputStream("src/teste.txt");
        InputStreamReader arquivoLido = new InputStreamReader(arquivo);
        BufferedReader arquivoFinal = new BufferedReader(arquivoLido);


        //System.out.println(arquivoFinal.readLine());

        String linha = arquivoFinal.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = arquivoFinal.readLine();
        }

    }
}
