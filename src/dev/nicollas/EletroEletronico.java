package dev.nicollas;

/*
    Criar a classe abstrata EletroEletronico com os atributos [marca, modelo, voltagem, ligado(boolean)].
    Criar o construtor, os Getters e Setters, toString().
    Crie também os métodos ligar e desligar que considerem o estado atual do objeto.
*/

public abstract class EletroEletronico {
    private String marca;
    private String modelo;
    private Integer voltagem;
    private Boolean ligado = false;

    public EletroEletronico(String marca, String modelo, Integer voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.voltagem = voltagem;
    }

    public void ligar() {
        if (!this.isLigado()) {
            this.ligado = true;
            System.out.println("Ligando o aparelho: " + this.isLigado());
        }
    }

    public void desligar() {
        if (this.isLigado()) {
            this.ligado = false;
            System.out.println("Desligando o aparelho: " + this.isLigado());
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(Integer voltagem) {
        this.voltagem = voltagem;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "EletroEletronico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", voltagem=" + voltagem +
                ", ligado=" + ligado +
                '}';
    }
}
