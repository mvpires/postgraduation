package com.mvpires;

/**
 * Created by mv_pi on 07/06/2016.
 */
public class Player implements Personagem{


    @Override
    public void inicializar() {
        System.out.println("Criando o Player");
    }

    @Override
    public void atacar() {
        System.out.println("Player atacando");
    }

    @Override
    public void mover() {
        System.out.println("Player se movendo");
    }
}
