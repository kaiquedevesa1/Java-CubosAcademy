package br.com.cubosacademy.patterns.strategy;

public class CompraTeste {

    public static void main(String[] args) {
        Compra notebook = new Compra(1000000);

        notebook.processarCompra(new CompraCredito());
    }
}
