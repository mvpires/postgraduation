package com.mvpires;

public class Main {

    public static void main(String[] args) {

       Personagem personagem = new Player();
        personagem.mover();

        personagem = new Inimigo();
        personagem.mover();
    }
}
