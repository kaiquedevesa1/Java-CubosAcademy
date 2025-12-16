public class ManipulacaoStrings {

    public static void main(String[] args) {

        /*double numero1 = 13.5;
        String variavelConvertida = String.valueOf(numero1);
        System.out.println(variavelConvertida.charAt(1));

        //verifica se a string comeca com a ocorrencia informada

        String variavel1 = "Kaique Devesa";
        boolean resultado1 = variavel1.startsWith("Devesa");
        boolean resultado2 = variavel1.startsWith("Kaique Devesa", 0);
        System.out.println(resultado2);
        // verifica se a string termina com a ocorrencia informada
        boolean resultado3 = variavel1.endsWith("a");
        System.out.println(resultado3);*/


        //verifica o tamanho da string e tira os espacos

        /*String variavel2 = "Kaique Devesa  ";
        System.out.println(variavel2.length());
        String variavelSemEspaco = variavel2.trim();
        System.out.println(variavel2);
        System.out.println(variavelSemEspaco.length());*/

        //Transforma as String em maiusculo e minusculo

       /* String variavel3 = "Kaique Devesa";
        System.out.println(variavel3.toLowerCase());
        System.out.println(variavel3.toUpperCase());*/

        // verifica a ocorrencia da string
        /*String variavel4 = "banana";
        System.out.println(variavel4.indexOf("an"));
        System.out.println(variavel4.indexOf('a', 4));
        System.out.println(variavel4.lastIndexOf("a"));
        System.out.println(variavel4.lastIndexOf("a", 7));*/


        String variavel5 = "banana";
        System.out.println(variavel5.replace("a", "e"));
        System.out.println(variavel5.substring(1, 4));
        System.out.println(variavel5.substring(1));

    }
}
