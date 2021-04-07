package dev.nicollas;

public class Principal {
    public static void main(String[] args) {
        Televisor samsung = new Televisor("Samsung", "Smart", 110);
        ControleRemoto controle = new ControleRemoto(samsung);


        System.out.println(samsung);

        controle.ligar();

        controle.proximoCanal();

        controle.voltarCanal();

        System.out.println(samsung);

        controle.desligar();
    }
}
