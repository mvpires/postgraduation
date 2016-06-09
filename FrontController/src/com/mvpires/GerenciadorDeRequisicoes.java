package com.mvpires;

/**
 * Created by mv_pi on 09/06/2016.
 */
public class GerenciadorDeRequisicoes {

    PaginaContato paginaContato;
    PaginaEsportes paginaEsportes;
    PaginaNoticias paginaNoticias;
    PaginaPolitica paginaPolitica;


    public GerenciadorDeRequisicoes()
    {
        paginaContato = new PaginaContato();
        paginaEsportes = new PaginaEsportes();
        paginaNoticias = new PaginaNoticias();
        paginaPolitica = new PaginaPolitica();
    }

    public void enviarRequisicao(String requisicao)
    {
        switch (requisicao)
        {
            case "contato":
                paginaContato.carregarPagina();
                break;
            case "esportes":
                paginaEsportes.carregarPagina();
                break;
            case "noticias":
                paginaNoticias.carregarPagina();
                break;
            case "politica":
                paginaPolitica.carregarPagina();
                break;
        }
    }
}
