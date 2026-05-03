package br.com.cubosacademy.patterns.builder;

public class BuilderTeste {

    public static void main(String[] args) {
        //Paciente devesa = new Paciente("dasds");
        PacienteBuilder builder = new PacienteBuilder();
        builder.setNome("Devesa");
        builder.setCpf("12332132132121");
        builder.setEmail("dsadss@outlok.com");

        Paciente devesa = builder.getResult();
        System.out.println(devesa.imprimir());


    }
}
