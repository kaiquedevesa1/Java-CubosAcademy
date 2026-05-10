package br.com.cubosacademy.util.io.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("src/teste.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //fileWriter.write("Hello World");
        fileWriter.append("Hello World");
        fileWriter.append("\nHello World");
        fileWriter.close();






    }
}
