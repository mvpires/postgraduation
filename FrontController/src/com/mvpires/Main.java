package com.mvpires;

public class Main {

    public static void main(String[] args) {
	FrontController frontController = new FrontController();

        frontController.gerenciarRequisicao("politica");
        frontController.gerenciarRequisicao("noticias");
        frontController.gerenciarRequisicao("esportes");
        frontController.gerenciarRequisicao("contato");
    }
}
