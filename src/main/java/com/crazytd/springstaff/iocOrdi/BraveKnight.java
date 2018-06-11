package com.crazytd.springstaff.iocOrdi;

/**
 * 没有将具体的操作交给这个骑士，而只是给了他一个任务
 */
public class BraveKnight {

    private Job job;
    private DeadSinger deadSinger;


    public BraveKnight(Job job,DeadSinger deadSinger){
        this.job = job;
        this.deadSinger = deadSinger;
    }

    public void doTheJob(){
        deadSinger.singBeforeJob();
        job.doTheJob();
        deadSinger.singAfterJob();
    }

}
