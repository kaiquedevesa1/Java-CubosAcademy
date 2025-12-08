public class ManipulacaoStrings {

    public static void main(String[] args) {

        double numero1 = 13.5;
        String variavelConvertida = String.valueOf(numero1);
        System.out.println(variavelConvertida.charAt(1));

        //verifica se a string comeca com a ocorrencia informada

        String variavel1 = "Kaique Devesa";
        boolean resultado1 = variavel1.startsWith("Devesa");
        boolean resultado2 = variavel1.startsWith("Kaique Devesa", 0);
        System.out.println(resultado2);
        // verifica se a string termina com a ocorrencia informada
        boolean resultado3 = variavel1.endsWith("a");
        System.out.println(resultado3);


    }
}
