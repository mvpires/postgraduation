package com.mvpires;

/**
 * Created by mv_pi on 07/06/2016.
 */
public class Personagem {

    private int posicaoX;
    private int posicaoY;
    private int health;
    private int velocidadeMovimento = 5;
    private int novaPosicaoX;
    private int novaPosicaoY;

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getVelocidadeMovimento() {
        return velocidadeMovimento;
    }

    public void setVelocidadeMovimento(int velocidadeMovimento) {
        this.velocidadeMovimento = velocidadeMovimento;
    }

    public Personagem()
    {

    }

    public void mover()
    {
        novaPosicaoX = posicaoX * velocidadeMovimento;
        novaPosicaoY = posicaoY * velocidadeMovimento;

        System.out.println("Movendo " + getClass().getSimpleName() + " para a posição X " + novaPosicaoX + " e posição Y para " +  novaPosicaoY);
    }
}
