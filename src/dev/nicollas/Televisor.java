package dev.nicollas;

/*
    Crie a classe TV que extensa EletroEletronico;
    esta classe deve ter o atributo canalAtual,
    crie construtor, getters, setters e toString.
*/

public class Televisor extends EletroEletronico{
    private Float canalAtual = 6.1f;

    public Televisor(String marca, String modelo, Integer voltagem) {
        super(marca, modelo, voltagem);
        this.canalAtual = canalAtual;
    }

    public Float getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(Float canalAtual) {
        this.canalAtual = canalAtual;
    }

    @Override
    public String toString() {
        return String.format("TV{marca=%s, modelo=%s, voltagem=%s, canal=%.1f, ligado=%s}", getMarca(), getModelo(), getVoltagem(), getCanalAtual(), isLigado());
    }
}
