package com.mvpires;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        Inimigo inimigo = new Inimigo();

        List<Personagem> personagems = new ArrayList<>();
        personagems.add(player);
        personagems.add(inimigo);

        GeradorDePersonagem geradorDePersonagem = new GeradorDePersonagem();

        for(Personagem personagem : personagems)
        {
            geradorDePersonagem.criarPersonagem(personagem);
        }

    }
}
