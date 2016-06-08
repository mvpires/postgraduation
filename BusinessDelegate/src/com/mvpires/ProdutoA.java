package com.mvpires;

/**
 * Created by mv_pi on 08/06/2016.
 */
public class ProdutoA implements BusinessService {


    @Override
    public void gerarProduto() {
        System.out.println("Gerando Produto A");
    }
}
