package com.mvpires;

/**
 * Created by mv_pi on 07/06/2016.
 */
public class Inimigo implements Personagem {
    @Override
    public void inicializar() {
        System.out.println("Criando o Inimigo");
    }

    @Override
    public void atacar() {
        System.out.println("Inimigo atacando");
    }

    @Override
    public void mover() {
        System.out.println("Inimigo se movendo");
    }
}
