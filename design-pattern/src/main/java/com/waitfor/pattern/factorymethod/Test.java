package com.waitfor.pattern.factorymethod;


/**
 *
 * @author zhouliang
 * @since 2021-2-20上午 10:36
 */
public class Test {
    public static void main(String[] args) {
        Sender sms = SendFactory.produceMail();
        sms.Send();
    }
}
