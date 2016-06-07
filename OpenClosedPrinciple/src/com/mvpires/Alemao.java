package com.mvpires;

/**
 * Created by mv_pi on 06/06/2016.
 */
public class Alemao extends Idioma {
    @Override
    public void traduzir(Idioma id1) {
        System.out.println("Traduzindo de " + getClass().getSimpleName() + " para " + id1.getClass().getSimpleName());
    }
}
