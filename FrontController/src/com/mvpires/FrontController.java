package com.mvpires;

/**
 * Created by mv_pi on 09/06/2016.
 */
public class FrontController {
GerenciadorDeRequisicoes gerenciadorDeRequisicoes;

    public FrontController()
    {
        gerenciadorDeRequisicoes = new GerenciadorDeRequisicoes();
    }

    public void gerenciarRequisicao(String requisicao)
    {
        gerenciadorDeRequisicoes.enviarRequisicao(requisicao);
    }


}
