package com.mvpires;

public class Main {

    public static void main(String[] args) {

       Player player = new Player (115.67, 325.32);
       Enemy enemy = new Enemy(135.45, 325.32);
        GameManager gameManager = new GameManager();

        System.out.println(gameManager.checkCollision(player, enemy));

    }
}
