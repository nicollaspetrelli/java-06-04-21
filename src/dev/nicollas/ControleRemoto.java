package dev.nicollas;

/*
    Crie a classe ControleRemoto, esta classe
    deve possuir o atributo do tipo TV.
    Crie o método que altere o canal da TV.
*/

public class ControleRemoto {
    private Televisor aparelho;

    public Televisor getAparelho() {
        return aparelho;
    }

    public void setAparelho(Televisor aparelho) {
        this.aparelho = aparelho;
    }

    public ControleRemoto(Televisor aparelho) {
        this.aparelho = aparelho;
    }

    public void ligar(){
        this.aparelho.ligar();
    }

    public void desligar(){
        this.aparelho.desligar();
    }

    public void mudarCanal(Float canal) {
        aparelho.setCanalAtual(canal);
    }

    public void proximoCanal() {
        Float canalAtual = aparelho.getCanalAtual();
        aparelho.setCanalAtual(canalAtual + 1);
    }

    public void voltarCanal() {
        Float canalAtual = aparelho.getCanalAtual();
        aparelho.setCanalAtual(canalAtual - 1);
    }
}
