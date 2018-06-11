package com.crazytd.springstaff.beaninit;

import org.springframework.stereotype.Component;

/**
 * 这是一个游戏光盘的实现
 */
@Component
public class GameDisc implements Disc{
    @Override
    public void play() {
        System.out.println("来一起玩真三国无双吧");
    }
}
