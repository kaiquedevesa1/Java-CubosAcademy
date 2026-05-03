//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String txt = "Kaique Devesa";
        //imprime
        System.out.printf(txt);

        //sobrescreve variavel
        txt = "Cubos Academy";

        //imprime
        System.out.printf(txt);

        //constante
        final String txt2 = "Minha primeira constante";

        //imprime constante
        System.out.println(txt2);

        //Números
        //números inteiros
        int numeroInteiro = 12;
        System.out.println(numeroInteiro);
        //números decimais
        double numeroDecimal = 12.03441;
        System.out.println(numeroDecimal);
        //Lógico
        boolean verdadeiroOuFalso = true;
        System.out.println(verdadeiroOuFalso);


        //operadores
        // ==, >=, <=, !=, > , <
        // &&, || , !variavel

        /* numero1 = 10;
        int numero2 = 10;


        if (numero1 > numero2) {
            System.out.println("numero 1 é maior");
        } else if (numero1 == numero2){
            System.out.println("os dois números sao iguais");
        }  else {
            System.out.println("numero 2 é maior");
        } */


        int numero3 = 19;

        switch (numero3){
            case 18:
                System.out.println("o numero é 18");
                break;
            case 17 :
                System.out.println("o numero é  17");
                break;

            default:
                System.out.println("o número é desconhecido");
                break;
        }

        String resposta = (numero3 <= 17) ? "é menor de idade" : "é maior de idade";

        System.out.println(resposta);


    }
}
