package com.mvpires;

public class Main {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setTipoProduto("ProdutoA");

        Cliente cliente = new Cliente(businessDelegate);
        cliente.processarTarefa();

        businessDelegate.setTipoProduto("ProdutoB");
        cliente.processarTarefa();

    }
}
