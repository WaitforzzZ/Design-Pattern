package com.waitfor.pattern.abstractfactory;

/**
 *
 * @author zhouliang
 * @since 2021-2-20下午 2:37
 */
public class Test {
    public static void main(String[] args) {
        AbstractSendFactory factory = new SendMailFactory();
        Sender sender = factory.produce();
        sender.Send();
    }
}
