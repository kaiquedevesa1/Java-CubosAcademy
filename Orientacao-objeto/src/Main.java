//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /* carro fusca = new carro();
       fusca.modelo = "fusca";
       fusca.marca = "Volkswagen";
       fusca.cor = "preto";
       fusca.ano= 1978; */


        carro gol = new carro("Gol", "Volkswagen", "branco", 2010);

        //gol.ano = 2012;
        gol.ligar();
        gol.acelerar("forte");
        gol.acelerar("fraco");
        gol.acelerar();
        gol.desligar();
        System.out.println(gol.getCor());
        gol.setCor("azul");

        System.out.println(gol.getLigado());
        System.out.println(gol.getAceleracao());
        System.out.println(gol.getCor());
        System.out.println(gol.getIdade());


        /**/
        //Pessoa devesa = new Pessoa("Kaique", "12345678890"); classe concreta
        Aluno devesa = new Aluno("Kaique", "12345678900");
        Professor joao = new Professor("João", "12341432432423", 1000000);
        joao.calcularPontos(30);
        devesa.calcularPontos(15);
        System.out.println(joao.getPontos());
        System.out.println(devesa.getPontos());
        System.out.println(devesa.imprimirSaudacao());
        System.out.println(joao.imprimirSaudacao());
    }
}