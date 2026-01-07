public class carro {


    public String modelo;

    public String marca;

    public String cor;

    public int ano;

    public boolean ligado;
    public int aceleracao;

    public carro(String modelo, String marca ,String cor , int ano){
    this.modelo = modelo;
    this.marca = marca;
    this.cor = cor;
    this.ano = ano;
    this.ligado = false;
    this.aceleracao = 0;

    }

    //usase o void caso nao queira retornar nada
    public void ligar(){
    if (this.ligado){
        return;
    }

    this.ligado = true;

    }


    public void desligado(){
        if (!this.ligado){
            return;
        }

        this.ligado = false;

    }

    public void acelerrar(String tipoAceleracao){
        switch (tipoAceleracao){
            case "forte":
                this.aceleracao += 1000;
                break;
            case "fraca":
                this.aceleracao += 500;
                break;
            default:
                this.aceleracao += 750;
                break;
        }
    }
}
