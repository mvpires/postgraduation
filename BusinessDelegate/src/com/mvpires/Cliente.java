package com.mvpires;

/**
 * Created by mv_pi on 08/06/2016.
 */
public class Cliente {

    BusinessDelegate businessDelegate;

    public Cliente(BusinessDelegate businessDelegate)
    {
        this.businessDelegate = businessDelegate;
    }

    public void processarTarefa()
    {
        businessDelegate.processarTarefa();
    }
}
