package com.crazytd.springstaff.iocOrdi;


/**
 * 这是一个只能杀boss的骑士 实现了knight的接口
 */
public class KillTheTimoKnight implements Knight{

    private KillTheTimo killTheTimo;

    public KillTheTimoKnight(){
        this.killTheTimo = new KillTheTimo();
    }

    @Override
    public void doTheJob() {
        killTheTimo.killTheTimo();
    }

    public KillTheTimo getKillTheTimo() {
        return killTheTimo;
    }

    public void setKillTheTimo(KillTheTimo killTheTimo) {
        this.killTheTimo = killTheTimo;
    }

}
