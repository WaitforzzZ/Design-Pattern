package com.waitfor.pattern.factorymethod;

/**
 * 发送sms
 *
 * @author zhouliang
 * @since 2021-2-20上午 10:27
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
