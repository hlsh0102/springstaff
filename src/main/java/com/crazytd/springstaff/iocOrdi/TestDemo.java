package com.crazytd.springstaff.iocOrdi;

import sun.jvm.hotspot.oops.BranchData;

public class TestDemo {

    public static  void main(String[] args){
        KillTheTimoKnight killTheTimoKnight = new KillTheTimoKnight();
        killTheTimoKnight.doTheJob();

        Job killYasuo = new KillTheYasuo();
        DeadSinger deadSinger = new DeadSinger();
        BraveKnight braveKnight = new BraveKnight(killYasuo,deadSinger);
        braveKnight.doTheJob();
    }
}
