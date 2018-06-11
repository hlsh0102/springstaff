package com.crazytd.springstaff.iocOrdi;

/**
 * 这是一个死歌，他在骑士每次执行任务的时候都会进行下列操作
 */
public class DeadSinger {

    public void singBeforeJob(){
        System.out.println("骑士马上就要干掉那个家伙了！！！");
    }

    public void singAfterJob(){
        System.out.println("骑士干掉了那个家伙了！！！");
    }
}
