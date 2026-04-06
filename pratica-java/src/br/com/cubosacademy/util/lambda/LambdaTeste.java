package br.com.cubosacademy.util.lambda;

import java.util.ArrayList;
import java.util.List;

interface TesteLambda {
    public String executar(String texto);
}

interface ICalc {
    public double soma(double numero1, double numero2);
}



public class LambdaTeste {

    public static void main(String[] args) {
//        Runnable olaPessoal = () -> {
//            System.out.println("Ola Pessoal");
//        };
//        olaPessoal.run();

        TesteLambda lambdaTeste = (String texto) -> {
            return texto;
        };

        System.out.println(lambdaTeste.executar("Olá amigos"));

        ICalc calculadora = (double num1, double num2) -> {
            return num1 + num2;
        };

        System.out.println(calculadora.soma(5, 5.3));


        List<String> usuarios = new ArrayList<String>();
        usuarios.add("kaique");
        usuarios.add("ana");


//        for (String usuario : usuarios) {
//            System.out.println(usuario);
//        }

        usuarios.forEach ((usuario) -> {
            System.out.println(usuario);
        });

    }
}
