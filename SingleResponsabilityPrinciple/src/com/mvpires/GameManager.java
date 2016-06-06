package com.mvpires;

/**
 * Created by mv_pi on 06/06/2016.
 */
public class GameManager {


    public String checkCollision(Player player, Enemy enemy)
    {
        if (player.getPositionX() == enemy.getPositionX() || player.getPositionY() == enemy.getPositionY())
        {
            return "Player collided with the enemy.";

        }
        else
        {
            return "Player collided with the enemy.";
        }

    }
}
