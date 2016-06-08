package com.mvpires;

/**
 * Created by mv_pi on 08/06/2016.
 */
public class LocalizadorDeProduto {

    public BusinessService getServicoProduto(String tipoProduto)
    {
        if (tipoProduto.equals("ProdutoA"))
        {
            return new ProdutoA();
        }
        else
        {
            return new ProdutoB();
        }
    }
}
