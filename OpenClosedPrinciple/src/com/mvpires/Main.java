package com.mvpires;

public class Main {



    public static void main(String[] args) {

        Ingles ingles = new Ingles();
        Alemao alemao = new Alemao();
        Espanhol espanhol = new Espanhol();

        ingles.traduzir(alemao);
        ingles.traduzir(espanhol);

        alemao.traduzir(ingles);
        alemao.traduzir(espanhol);

        espanhol.traduzir(ingles);
        espanhol.traduzir(alemao);
    }
}
