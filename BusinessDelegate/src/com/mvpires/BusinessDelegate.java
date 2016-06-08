package com.mvpires;

/**
 * Created by mv_pi on 08/06/2016.
 */
public class BusinessDelegate {

    LocalizadorDeProduto localizadorDeProduto = new LocalizadorDeProduto();
    BusinessService businessService;
    String tipoProduto;

    public void setTipoProduto(String tipoProduto)
    {
        this.tipoProduto = tipoProduto;
    }

    public void processarTarefa()
    {
        businessService = localizadorDeProduto.getServicoProduto(tipoProduto);
        businessService.gerarProduto();
    }
}
