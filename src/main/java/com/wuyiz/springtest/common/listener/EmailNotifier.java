package com.wuyiz.springtest.common.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * TODO
 *
 * @author wyz
 * @version 1.0.0 v
 * @date 2022-03-14 13:46
 */
public class EmailNotifier implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

    }
}
