package com.crazytd.springstaff.aop;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance {
    @Override
    public void perform() {
        System.out.println("这是一台美妙的音乐剧");
    }
}
