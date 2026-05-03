public class carro {


    private String modelo;

    private String marca;

    private String cor;

    private int ano;

    private boolean ligado;
    private int aceleracao;

    private  int idade;

    public carro(String modelo, String marca ,String cor , int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.ligado = false;
        this.aceleracao = 0;
        this.setIdade();

    }

    //usase o void caso nao queira retornar nada
    public void ligar(){
    if (this.ligado){
        return;
    }

    this.ligado = true;

    }


    public void desligar(){
        if (!this.ligado){
            return;
        }
        this.aceleracao = 0;
        this.ligado = false;

    }

    public void acelerar(String tipoAceleracao){
        switch (tipoAceleracao){
            case "forte":
                this.aceleracao += 1000;
                break;
            case "fraco":
                this.aceleracao += 500;
                break;
        }
    }

    public void acelerar(){
        this.aceleracao += 750;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public boolean getLigado() {
        return ligado;
    }

    public int getAceleracao() {
        return aceleracao;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    private void setIdade(){
        this.idade = 2023 - this.ano;
    }

    public  int getIdade(){
        return idade;
    }

}
